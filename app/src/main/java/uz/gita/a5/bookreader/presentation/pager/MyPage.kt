package uz.gita.a5.bookreader.presentation.pager

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import uz.gita.a5.bookreader.R

class MyPage : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageView = view.findViewById<AppCompatImageView>(R.id.image)
        val textTitle = view.findViewById<AppCompatTextView>(R.id.textTitle)
        val textDescription = view.findViewById<AppCompatTextView>(R.id.textDescription)

        val pos = arguments?.getInt("POS", 0)
        when (pos) {
            0 -> {
                imageView.setImageResource(R.drawable.page_1)
                textTitle.text = "Title 1"
                textDescription.text = "Description 1"
            }

            1 -> {
                imageView.setImageResource(R.drawable.page_2)
                textTitle.text = "Title 2"
                textDescription.text = "Description 2"
            }

            else -> {
                imageView.setImageResource(R.drawable.page_3)
                textTitle.text = "Title 3"
                textDescription.text = "Description 3"
            }
        }
    }
}