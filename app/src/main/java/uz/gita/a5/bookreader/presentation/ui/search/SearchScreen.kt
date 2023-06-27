package uz.gita.a5.bookreader.presentation.ui.search

import android.graphics.PorterDuff
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.widget.ContentLoadingProgressBar
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.a5.bookreader.R
import uz.gita.a5.bookreader.data.model.BookData
import uz.gita.a5.bookreader.databinding.ScreenSearchBinding
import uz.gita.a5.bookreader.presentation.adapter.ExploreAdapter
import uz.gita.a5.bookreader.presentation.ui.explore.viewmodel.impl.ExploreViewModelImpl

class SearchScreen :Fragment(R.layout.screen_search) {


    private val binding by viewBinding(ScreenSearchBinding::bind)
    private val viewModel by viewModels<ExploreViewModelImpl>()
    private val adapter by lazy { ExploreAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val progressBar: ContentLoadingProgressBar = binding.progress
        val progressDrawable = progressBar.indeterminateDrawable.mutate()
        progressDrawable.setColorFilter(
            ContextCompat.getColor(requireContext(), R.color.progress),
            PorterDuff.Mode.SRC_IN
        )
        progressBar.indeterminateDrawable = progressDrawable

        viewModel.booksLiveData.observe(viewLifecycleOwner, booksObserver)
        viewModel.errorLiveData.observe(viewLifecycleOwner, errorData)
        viewModel.loadingLiveData.observe(viewLifecycleOwner, loadingProgressBarObserver)
        viewModel.placeHolderLiveData.observe(viewLifecycleOwner, placeHolderObserver)

        binding.apply {
            recycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            recycler.adapter = adapter

            searchField.doAfterTextChanged {
                viewModel.getBySearch(searchField.text.toString())
            }
        }


        adapter.setClickBookListener {
            val action = SearchScreenDirections.actionSearchScreenToAboutFragment(it)
            findNavController().navigate(action)
        }
    }

    private val booksObserver = Observer<List<BookData>> {
        Log.d("TTT", it.size.toString())
        adapter.submitList(it)
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
    private val placeHolderObserver = Observer<Boolean> {
        if (it) {
            binding.placeholder.visibility = View.VISIBLE
            binding.txtPlaceholder.visibility = View.VISIBLE

        } else {
            binding.placeholder.visibility = View.GONE
            binding.txtPlaceholder.visibility = View.GONE

        }
    }
}