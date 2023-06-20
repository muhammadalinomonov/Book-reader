package uz.gita.a5.bookreader.presentation.pager

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import by.kirich1409.viewbindingdelegate.viewBinding
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator
import uz.gita.a5.bookreader.R
import uz.gita.a5.bookreader.data.source.local.MySharedPref
import uz.gita.a5.bookreader.data.source.local.impl.MySharedPrefImpl
import uz.gita.a5.bookreader.databinding.ItemPageBinding
import uz.gita.a5.bookreader.databinding.ScreenPageBinding
import uz.gita.a5.bookreader.presentation.adapter.ViewPagerAdapter
import uz.gita.a5.bookreader.utils.gone
import uz.gita.a5.bookreader.utils.myLog
import uz.gita.a5.bookreader.utils.visible

class MyViewPager : Fragment(R.layout.screen_page) {
    private val binding by viewBinding(ScreenPageBinding::bind)

    private val vp: ViewPager2 by lazy { binding.viewPager }
    private val buttonNext by lazy { binding.txtNext }
    private val dots: DotsIndicator by lazy { binding.dots }

    private val sharedPref:MySharedPref = MySharedPrefImpl.getInstance()
    init {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.txtNext.setOnClickListener {
            if (vp.currentItem < 2)
                vp.currentItem = vp.currentItem + 1
            else {
                Log.d("TTT", "start")
                sharedPref.isFirst = false
                findNavController().navigate(R.id.action_viewPager_to_mainScreen)
            }
        }

        val adapter = ViewPagerAdapter()

        vp.adapter = adapter
        dots.attachTo(vp)

        vp.registerOnPageChangeCallback(ob)

    }

    private val ob = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
            if (position < 2) {
                buttonNext.text = "Next"
//                buttonSkip.visibility = View.VISIBLE
                buttonNext.visibility = View.VISIBLE
//                dots.visibility = View.VISIBLE
//                buttonStart.gone()
//                buttonStart.visibility = View.GONE
            } else {
//                buttonSkip.visibility = View.GONE
                buttonNext.text = "Start"

//                dots.visibility = View.GONE
//                buttonStart.visibility = View.VISIBLE
            }
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        vp.unregisterOnPageChangeCallback(ob)
    }
}