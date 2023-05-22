package uz.gita.a5.bookreader.presentation.ui.readbook

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.github.barteksc.pdfviewer.listener.OnPageErrorListener
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle
import com.github.barteksc.pdfviewer.util.FitPolicy
import com.google.android.material.bottomnavigation.BottomNavigationView
import uz.gita.a5.bookreader.R
import uz.gita.a5.bookreader.data.source.local.MySharedPref
import uz.gita.a5.bookreader.data.source.local.impl.MySharedPrefImpl
import uz.gita.a5.bookreader.databinding.ScreenReadBookBinding
import java.io.File

class ReadBookScreen : Fragment(R.layout.screen_read_book),
    com.github.barteksc.pdfviewer.listener.OnPageChangeListener,
    OnPageErrorListener {
    //todo
    private val args by navArgs<ReadBookScreenArgs>()
    private var bookName = ""
    private var pageNumber = 0
    private var totalPage = 0

    private lateinit var imageUrl: String


    private val sharedPref: MySharedPref = MySharedPrefImpl.getInstance()
    private val binding by viewBinding(ScreenReadBookBinding::bind)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val bottomNavigationView =
            activity?.findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        bottomNavigationView?.visibility = View.GONE
        return super.onCreateView(inflater, container, savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        bookName = args.bookName
        totalPage = args.totalPage
        pageNumber = args.savedPage
        imageUrl = args.imageUrl
        binding.txtBookName.text = bookName
//        totalPage = book.page todo

        binding.progressBar2.max = args.totalPage
        Log.d("PPP", binding.progressBar2.max.toString())
        Log.d("PPP", totalPage.toString())


        val b = requireActivity().filesDir
        b?.let {
            val file = File(it, bookName)

            if (file.exists()) {

                binding.txtPages.text = "$pageNumber/$totalPage"
                binding.pdfView.fromFile(file)
                    .enableSwipe(true)
                    .defaultPage(pageNumber)
                    .swipeHorizontal(false)
                    .pageSnap(true)
                    .autoSpacing(true)
                    .pageFling(true)
                    .enableDoubletap(true)
                    .enableAnnotationRendering(false)
                    .scrollHandle(DefaultScrollHandle(requireContext()))
                    .onPageChange(this)
                    .onPageError(this)
                    .enableAntialiasing(true)
                    .spacing(10)
                    .nightMode(false)
                    .pageFitPolicy(FitPolicy.BOTH)
                    .load()
            } else {
                Toast.makeText(requireContext(), "Book is not downloaded", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        binding.apply {
            btnBack.setOnClickListener {
                findNavController().navigateUp()
            }
        }
    }

    override fun onPageChanged(page: Int, pageCount: Int) {
        binding.progressBar2.max = pageCount
        pageNumber = page
        sharedPref.totalPage = pageCount
        binding.txtPages.text = String.format("%s / %s", page + 1, pageCount)
        sharedPref.savedPageByBookName(bookName, page)
        binding.progressBar2.progress = page
    }

    override fun onPageError(page: Int, t: Throwable?) {

    }


    override fun onDestroyView() {
        super.onDestroyView()


        val bottomNavigationView =
            activity?.findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        bottomNavigationView?.visibility = View.VISIBLE
    }

    override fun onPause() {
        super.onPause()
        if (pageNumber != 0) {
            sharedPref.bookName = bookName
            sharedPref.savedPage = pageNumber
//            sharedPref.totalPage = totalPage
            sharedPref.bookUrl = imageUrl
            sharedPref.savedPageByBookName(bookName, pageNumber)
        } else if (pageNumber == totalPage) {
            sharedPref.bookName = ""
            sharedPref.savedPage = 0
            sharedPref.totalPage = 0
        }

    }
}