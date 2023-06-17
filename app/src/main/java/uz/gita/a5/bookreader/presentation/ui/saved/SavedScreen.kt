package uz.gita.a5.bookreader.presentation.ui.saved

import android.annotation.SuppressLint
import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.a5.bookreader.R
import uz.gita.a5.bookreader.data.source.local.impl.MySharedPrefImpl
import uz.gita.a5.bookreader.databinding.ScreenSavedBinding
import uz.gita.a5.bookreader.presentation.adapter.SavedBooksAdapter
import uz.gita.a5.bookreader.presentation.ui.saved.viewmodel.impl.SavedViewModelImpl
import java.io.File

class SavedScreen : Fragment(R.layout.screen_saved) {
    private val binding by viewBinding(ScreenSavedBinding::bind)
    private val viewModel by viewModels<SavedViewModelImpl>()
    private val adapter by lazy { SavedBooksAdapter() }
    private val sharedPref = MySharedPrefImpl.getInstance()

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        viewModel.getAllSavedBook(requireContext())
        adapter.setDeleteClickListener {
            val book = it

            val dialog = Dialog(requireContext())
            dialog.setContentView(R.layout.delete_dialog)

            dialog.findViewById<TextView>(R.id.title).text =
                requireContext().getString(R.string.delete, book.bookName)
            dialog.getWindow()?.setBackgroundDrawableResource(android.R.color.transparent)

            dialog.findViewById<TextView>(R.id.btnNo).setOnClickListener {
                dialog.dismiss()
            }
            dialog.findViewById<TextView>(R.id.btnYes).setOnClickListener {
                viewModel.getAllSavedBook(requireContext())

                sharedPref.savedPageByBookName(book.bookName, 0)

                if (book.bookName == sharedPref.bookName) {
                    sharedPref.bookName = ""
                    sharedPref.savedPageByBookName(book.bookName, 0)
                }
                val file = File(requireContext().filesDir, book.bookName)
                val deleted = if (file.exists()) file.delete() else false

                if (deleted) {

                    Toast.makeText(requireContext(), "${book.bookName} deleted", Toast.LENGTH_SHORT)
                        .show()
                } else
                    adapter.notifyDataSetChanged()

                dialog.dismiss()
            }
            dialog.show()

        }
        binding.apply {
            recycler.layoutManager = GridLayoutManager(requireContext(), 2)
            recycler.adapter = adapter
        }

        adapter.setClickListener {
            Log.d("UUU", it.imageUrl)
            MySharedPrefImpl.getInstance().bookUrl = it.imageUrl
            //todo
            val action =
                SavedScreenDirections.actionFavoriteFragmentToReadBookScreen(
                    200,
                    it.bookName,
                    it.imageUrl,
                    sharedPref.getSavedPageByBookName(it.bookName)
                )
            findNavController().navigate(action)
        }
        viewModel.booksLiveData.observe(viewLifecycleOwner) {
            if (it.isEmpty()) {
                binding.apply {
                    imgNoBooks.visibility = View.VISIBLE
                    txtNoBookTitle.visibility = View.VISIBLE
                }
            } else {
                binding.apply {
                    imgNoBooks.visibility = View.GONE
                    txtNoBookTitle.visibility = View.GONE
                }
            }
            Log.d("TTT", "saved ${it.size}")
            adapter.submitList(it)
        }

        viewModel.errorLiveData.observe(viewLifecycleOwner) {
            Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
        }
    }
}