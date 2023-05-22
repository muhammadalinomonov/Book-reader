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
                    binding.image.setImageResource(R.drawable.image_1)

                    //
                }
                1 -> {
                    binding.image.setImageResource(R.drawable.ic_saved)
                    //
                }
                2 -> {
                    binding.image.setImageResource(R.drawable.ic_download)

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