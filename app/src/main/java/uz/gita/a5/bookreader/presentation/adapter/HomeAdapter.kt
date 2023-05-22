package uz.gita.a5.bookreader.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import uz.gita.a5.bookreader.data.model.BookData
import uz.gita.a5.bookreader.data.model.CategoryData
import uz.gita.a5.bookreader.databinding.VerticalItemBinding

class HomeAdapter : Adapter<HomeAdapter.ItemViewHolder>() {

    private var list: List<CategoryData> = ArrayList()


    @SuppressLint("NotifyDataSetChanged")
    fun setData(l: List<CategoryData>) {
        list = l
        notifyDataSetChanged()
    }

    private var clickListener: ((BookData) -> Unit)? = null

    fun setClickListener(l: (BookData) -> Unit) {
        clickListener = l
    }

    inner class ItemViewHolder(private val binding: VerticalItemBinding) :
        ViewHolder(binding.root) {
        private val innerAdapter = HorizontalExploreAdapter()

        fun bind(data: CategoryData) {
            binding.horizontalRv.layoutManager =
                LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)

            binding.category.text = data.title

            binding.horizontalRv.adapter = innerAdapter
            innerAdapter.setData(data.bookList)
            innerAdapter.setClickListener {
                clickListener?.invoke(it)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            VerticalItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(list[position])
    }

}
