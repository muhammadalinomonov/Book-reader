package uz.gita.a5.bookreader.presentation.adapter

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import uz.gita.a5.bookreader.R
import uz.gita.a5.bookreader.data.model.BookData
import uz.gita.a5.bookreader.data.source.local.impl.MySharedPrefImpl
import uz.gita.a5.bookreader.databinding.ItemSavedBookBinding


class SavedBooksAdapter : ListAdapter<BookData, SavedBooksAdapter.SavedViewHolder>(diffUtil) {

    private lateinit var clickListener: ((BookData) -> Unit)
    private lateinit var deleteClickListener: ((BookData) -> Unit)
    private val sharedPref = MySharedPrefImpl.getInstance()
    fun setClickListener(l: (BookData) -> Unit) {
        clickListener = l
    }

    fun setDeleteClickListener(l: (BookData) -> Unit) {
        deleteClickListener = l
    }

    object diffUtil : DiffUtil.ItemCallback<BookData>() {
        override fun areItemsTheSame(oldItem: BookData, newItem: BookData): Boolean {
            return oldItem.bookName == newItem.bookName
        }
        override fun areContentsTheSame(oldItem: BookData, newItem: BookData): Boolean {
            return oldItem == newItem
        }
    }

    inner class SavedViewHolder(private val binding: ItemSavedBookBinding) :
        ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(bookData: BookData) {
            binding.apply {
                txtTitle.text = bookData.bookName
                textAuthor.text = bookData.author
                Glide.with(itemView.context)
                    .load(bookData.imageUrl)
                    .placeholder(R.drawable.book)
                    .into(imgIcon)


                Log.d(
                    "AAA",
                    "progress1 -> ${sharedPref.getSavedPageByBookName(bookData.bookName) * 100} / ${bookData.page}"
                )
                Log.d(
                    "AAA",
                    "progress1 -> ${sharedPref.getSavedPageByBookName(bookData.bookName) * 100 / bookData.page}"
                )
                progress.progress =
                    sharedPref.getSavedPageByBookName(bookData.bookName) * 100 / bookData.page.toInt()


                txtOfProgress.text =
                    "${sharedPref.getSavedPageByBookName(bookData.bookName)} of ${bookData.page.toInt()}"
                Log.d("AAA", "progress -> ${progress.progress} / ${progress.max}")
                root.setOnClickListener {
                    clickListener.invoke(bookData)
                }

                binding.btnDelete.setOnClickListener {
                    deleteClickListener.invoke(bookData)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SavedViewHolder =

        SavedViewHolder(
            ItemSavedBookBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: SavedViewHolder, position: Int) {
        holder.itemView.animation =
            AnimationUtils.loadAnimation(holder.itemView.context, R.anim.animatsiya)
        holder.bind(getItem(position))
    }
}
