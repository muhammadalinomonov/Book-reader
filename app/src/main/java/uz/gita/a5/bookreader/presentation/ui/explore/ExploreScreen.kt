package uz.gita.a5.bookreader.presentation.ui.explore

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.a5.bookreader.R
import uz.gita.a5.bookreader.data.model.BookData
import uz.gita.a5.bookreader.databinding.ScreenExploreBinding
import uz.gita.a5.bookreader.presentation.adapter.ExploreAdapter
import uz.gita.a5.bookreader.presentation.ui.explore.viewmodel.impl.ExploreViewModelImpl

class ExploreScreen : Fragment(R.layout.screen_explore) {

    private val binding by viewBinding(ScreenExploreBinding::bind)
    private val viewModel by viewModels<ExploreViewModelImpl>()
    private val adapter by lazy { ExploreAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.booksLiveData.observe(viewLifecycleOwner, booksObserver)
        viewModel.errorLiveData.observe(viewLifecycleOwner, errorData)

        binding.apply {
            recycler.layoutManager = GridLayoutManager(requireContext(), 2)
            recycler.adapter = adapter
        }

        adapter.setClickBookListener {
            val action = ExploreScreenDirections.actionExploreFragmentToAboutFragment(it)
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
}