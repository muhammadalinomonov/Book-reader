package uz.gita.a5.bookreader.presentation.ui.home

import android.annotation.SuppressLint
import android.graphics.PorterDuff
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.widget.ContentLoadingProgressBar
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import uz.gita.a5.bookreader.R
import uz.gita.a5.bookreader.data.model.CategoryData
import uz.gita.a5.bookreader.data.source.local.MySharedPref
import uz.gita.a5.bookreader.data.source.local.impl.MySharedPrefImpl
import uz.gita.a5.bookreader.databinding.ScreenHomeBinding
import uz.gita.a5.bookreader.domain.repository.AppRepository
import uz.gita.a5.bookreader.domain.repository.impl.AppRepositoryImpl
import uz.gita.a5.bookreader.domain.usecase.explore.HomeUseCase
import uz.gita.a5.bookreader.domain.usecase.explore.HomeUseCaseImpl
import uz.gita.a5.bookreader.presentation.adapter.HomeAdapter
import uz.gita.a5.bookreader.presentation.ui.home.viewmodel.impl.HomeViewModelImpl

class HomeScreen : Fragment(R.layout.screen_home) {
    private val repository: AppRepository = AppRepositoryImpl.getInstance()
    private val useCase: HomeUseCase = HomeUseCaseImpl(repository)
    private val factory = HomeViewModelImpl.Factory(useCase)
    private val binding by viewBinding(ScreenHomeBinding::bind)
    private val viewModel by viewModels<HomeViewModelImpl>(factoryProducer = { factory })

    private val adapter by lazy { HomeAdapter() }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    private val sharedPref: MySharedPref = MySharedPrefImpl.getInstance()

    @SuppressLint("SetTextI18n", "FragmentLiveDataObserve")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val progressBar: ContentLoadingProgressBar = binding.progress
        val progressDrawable = progressBar.indeterminateDrawable.mutate()
        progressDrawable.setColorFilter(
            ContextCompat.getColor(requireContext(), R.color.progress),
            PorterDuff.Mode.SRC_IN
        )

        viewModel.maxProgressLiveData.observe(viewLifecycleOwner){
            Log.d("@@@", "max$it")
            binding.progressBar3.max = it
        }
        viewModel.progressLiveData.observe(viewLifecycleOwner){
            Log.d("@@@", "progress$it")
            Log.d("@@@", "progress${sharedPref.savedPage}")

            binding.progressBar3.progress = it
        }
        progressBar.indeterminateDrawable = progressDrawable

        viewModel.loadingLiveData.observe(viewLifecycleOwner, loadingProgressBarObserver)

        viewModel.getBooksByCategoryData()
        viewModel.categoriesLiveData.observe(viewLifecycleOwner, categoriesData)
        viewModel.errorLiveData.observe(viewLifecycleOwner, errorData)


        if (sharedPref.bookName!!.isEmpty()) {

            binding.linear2.visibility = View.GONE
        } else {
            binding.apply {
                linear2.visibility = View.VISIBLE

                Glide.with(requireContext())
                    .load(sharedPref.bookUrl)
                    .placeholder(R.drawable.ribbon)
                    .into(lastBookImage)

                /*progressBar3.progress = sharedPref.getSavedPageByBookName(sharedPref.bookName!!)
                progressBar3.max = sharedPref.totalPage*/

                /*Log.d("@@@", "${sharedPref.getSavedPageByBookName(sharedPref.bookName!!)} /${sharedPref.totalPage}")
                Log.d("@@@", "${progressBar3.progress}  /${progressBar3.max}")*/

                textBookName.text = sharedPref.bookName
            }
        }

        binding.linear2.setOnClickListener {
            val action =
                HomeScreenDirections.actionHomeFragmentToReadBookScreen(
                    sharedPref.totalPage,
                    sharedPref.bookName!!,
                    sharedPref.bookUrl,
                    sharedPref.savedPage
                )

            findNavController().navigate(action)
        }

        binding.apply {
            recycler.layoutManager = LinearLayoutManager(requireContext())
            recycler.adapter = adapter
        }


        adapter.setClickListener {
            findNavController().navigate(HomeScreenDirections.actionHomeFragmentToAboutFragment(it))
        }
    }

    private val categoriesData = Observer<List<CategoryData>> {
        adapter.setData(it)
    }

    private val errorData = Observer<String> {
        Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
    }
    private val loadingProgressBarObserver = Observer<Boolean> {
        if (it) {
            binding.progress.show()
        } else {
            binding.progress.hide()
        }
    }

}