package uz.gita.a5.bookreader.presentation.ui.about

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import uz.gita.a5.bookreader.R
import uz.gita.a5.bookreader.data.source.local.MySharedPref
import uz.gita.a5.bookreader.data.source.local.impl.MySharedPrefImpl
import uz.gita.a5.bookreader.databinding.ScreenAboutBinding
import uz.gita.a5.bookreader.presentation.ui.about.viewmodel.impl.AboutViewModelImpl
import java.io.File

class AboutScreen : Fragment(R.layout.screen_about) {
    private val args by navArgs<AboutScreenArgs>()
    private val binding by viewBinding(ScreenAboutBinding::bind)
    private val viewModel by viewModels<AboutViewModelImpl>()
    private val sharedPref = MySharedPrefImpl.getInstance()

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val bookData = args.bookData
        val book = File(requireContext().filesDir, bookData.bookName)

        binding.apply {
            txtName.text = bookData.bookName
            txtAuthor.text = "Author: ${bookData.author}"
            txtGenre.text = "Genre: ${bookData.genre}"
            txtDescription.text = bookData.description
//            txtStar.text = "Book Stars: ${bookData.startSize}"

            Glide.with(requireContext()).load(bookData.imageUrl).into(imgBook)


            progress.visibility = View.GONE

            if (book.exists()) {
                btnRead.visibility = View.VISIBLE
                btnDownload.setImageResource(R.drawable.ic_checked)
                btnDownload.isClickable = false
            } else {
                btnRead.visibility = View.GONE
                btnDownload.setImageResource(R.drawable.download)
                btnDownload.isClickable = true
            }

            btnBack.setOnClickListener {
                findNavController().popBackStack()
            }

            btnDownload.setOnClickListener {
                viewModel.downloadBookByUrl(requireContext(), bookData)
            }

            btnRead.setOnClickListener {
                val action = AboutScreenDirections.actionAboutFragmentToReadBookScreen(
                    bookData.page.toInt(),
                    bookData.bookName,
                    bookData.imageUrl,
                    sharedPref.getSavedPageByBookName(bookData.bookName)
                )
                findNavController().navigate(action)
            }
        }
        viewModel.errorLiveData.observe(viewLifecycleOwner, errorObserver)
        viewModel.successLiveData.observe(viewLifecycleOwner, successObserver)
        viewModel.loadingLiveData.observe(viewLifecycleOwner, loadingObserver)
    }

    private val successObserver = Observer<String> {
        binding.btnRead.visibility = View.VISIBLE
        binding.btnDownload.setImageResource(R.drawable.ic_checked)
        binding.btnDownload.isClickable = false
        Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
    }

    private val errorObserver = Observer<String> {
        Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
    }
    private val loadingObserver = Observer<Boolean> {
        if (it) {
            binding.progress.visibility = View.VISIBLE
            binding.btnDownload.visibility = View.GONE
            Log.d("TTT", "progress show")
            binding.progress.show()
        } else {
            binding.btnDownload.visibility = View.VISIBLE
            binding.progress.visibility = View.GONE
            Log.d("TTT", "progress hide")

            binding.progress.hide()
        }
    }
}