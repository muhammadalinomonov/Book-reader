package uz.gita.a5.bookreader.presentation.ui.splash

import android.annotation.SuppressLint
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import uz.gita.a5.bookreader.R
import uz.gita.a5.bookreader.data.source.local.MySharedPref
import uz.gita.a5.bookreader.data.source.local.impl.MySharedPrefImpl

@SuppressLint("CustomSplashScreen")
class SplashScreen : Fragment(R.layout.splash_screen) {
    private val pref: MySharedPref = MySharedPrefImpl.getInstance()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        lifecycleScope.launch {
            delay(1500)
//            if (pref.isFirst) {
//                findNavController().navigate(R.id.action_splashScreen_to_viewPager)
//            } else
                findNavController().navigate(R.id.action_splashScreen_to_mainScreen)
        }
    }
}