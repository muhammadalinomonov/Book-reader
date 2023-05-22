package uz.gita.a5.bookreader.presentation.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.gita.a5.bookreader.R
import uz.gita.a5.bookreader.databinding.PageBinding
import uz.gita.a5.bookreader.presentation.pager.MyViewPager

class ViewPagerAdapter : Adapter<ViewPagerAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: PageBinding) : ViewHolder(binding.root) {
        fun bind(position: Int){
            when(position){
                0 -> {
                    binding.image.setImageResource(R.drawable.page_1)
                    binding.textTitle.text = "Convenient use"
                    binding.textDescription.text = "Everything for comfortable reading of your favourite books."
                }
                1 -> {
                    binding.image.setImageResource(R.drawable.page_2)
                    binding.textTitle.text = "Offline reading"
                    binding.textDescription.text = "Different formats for reading to books."

                }
                2 -> {
                    binding.image.setImageResource(R.drawable.page_3)
                    binding.textTitle.text = "Search"
                    binding.textDescription.text = "Easy search by all titles and authors."
                    //
                }

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(PageBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = 3

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(position)
    }

}