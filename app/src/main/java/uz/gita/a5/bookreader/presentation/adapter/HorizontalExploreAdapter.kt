package uz.gita.a5.bookreader.presentation.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import uz.gita.a5.bookreader.R
import uz.gita.a5.bookreader.data.model.BookData
import uz.gita.a5.bookreader.data.source.local.impl.MySharedPrefImpl
import uz.gita.a5.bookreader.databinding.ItemBookBinding

class HorizontalExploreAdapter : Adapter<HorizontalExploreAdapter.ItemViewHolder>() {

    private var list: List<BookData> = ArrayList()
    private val sharesPref = MySharedPrefImpl.getInstance()
    fun setData(l: List<BookData>) {
        list = l
        notifyDataSetChanged()
    }

    private val sharedPref = MySharedPrefImpl.getInstance()

    private var clickListener: ((BookData) -> Unit)? = null

    fun setClickListener(l: (BookData) -> Unit) {
        clickListener = l
    }

    inner class ItemViewHolder(private val binding: ItemBookBinding) : ViewHolder(binding.root) {


        fun bind(book: BookData) {

            with(binding) {


                textBookName.text = book.bookName
                textAuthor.text = book.author
                val defaultPage = sharedPref.getSavedPageByBookName(book.bookName)
                /*if (defaultPage == 0) {
                    percentage.visibility = View.GONE
                    continueRead.visibility = View.GONE
                    btnDownload.visibility = View.VISIBLE
                } else {
                    percentage.visibility = View.VISIBLE
                    continueRead.visibility = View.VISIBLE

                    var foiz = defaultPage.toFloat() / book.page * 100
                    Log.d("PPP", "$defaultPage / ${book.page}")
                    foiz -= (foiz % 0.1).toFloat()
                    if (foiz > 99){
                        foiz = 100f
                    }
                    percentage.text = "$foiz %"
                    btnDownload.visibility = View.GONE
                }
                linearStart.setOnClickListener {
                    clickListener?.invoke(book)
                }*/

                Glide.with(binding.root.context)

                    .load(book.imageUrl)
                    .placeholder(R.drawable.book)
                    .into(bookImg)
            }
            binding.root.setOnClickListener {
                clickListener?.invoke(book)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            ItemBookBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
//        holder.itemView.animation = AnimationUtils.loadAnimation(holder.itemView.context, R.anim.animatsiya)
        holder.bind(list[position])
    }
}