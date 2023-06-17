package uz.gita.a5.bookreader.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.gita.a5.bookreader.R
import uz.gita.a5.bookreader.data.model.BookData
import uz.gita.a5.bookreader.data.source.local.MySharedPref
import uz.gita.a5.bookreader.data.source.local.impl.MySharedPrefImpl
import uz.gita.a5.bookreader.databinding.ItemBookForExploreBinding

class ExploreAdapter : ListAdapter<BookData, ExploreAdapter.ViewHolder>(diffdUtil) {

    private lateinit var clickBookListener: ((BookData) -> Unit)
    private val sharedPref: MySharedPref = MySharedPrefImpl.getInstance()

    private object diffdUtil : DiffUtil.ItemCallback<BookData>() {
        override fun areItemsTheSame(oldItem: BookData, newItem: BookData): Boolean {
            return oldItem.bookName == newItem.bookName
        }

        override fun areContentsTheSame(oldItem: BookData, newItem: BookData): Boolean {
            return oldItem.imageUrl == newItem.imageUrl
        }

    }

    fun setClickBookListener(block: (BookData) -> Unit) {
        clickBookListener = block
    }

    inner class ViewHolder(private val binding: ItemBookForExploreBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(book: BookData) {
            binding.apply {
                textBookName.text = book.bookName
                textAuthor.text = book.author

                Glide.with(itemView.context)
                    .load(book.imageUrl)
                    .centerCrop()
                    .into(bookImg)
                val defaultPage = sharedPref.getSavedPageByBookName(book.bookName)
                if (defaultPage == 0) {
                    percentage.visibility = View.GONE
                    continueRead.visibility = View.GONE
                    btnDownload.visibility = View.VISIBLE
                } else {
                    percentage.visibility = View.VISIBLE
                    continueRead.visibility = View.VISIBLE

                    var foiz = defaultPage.toFloat() / book.page.toInt() * 100
                    foiz -= (foiz % 0.1).toFloat()
                    if (foiz > 99){
                        foiz = 100f
                    }
                    percentage.text = "$foiz %"
                    btnDownload.visibility = View.GONE
                }
                linearStart.setOnClickListener {
                    clickBookListener.invoke(book)
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemBookForExploreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.itemView.animation = AnimationUtils.loadAnimation(holder.itemView.context, R.anim.animatsiya)

        holder.bind(getItem(position))
    }

}
