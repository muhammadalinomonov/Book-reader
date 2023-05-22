package uz.gita.a5.bookreader.presentation.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.a5.bookreader.R
import uz.gita.a5.bookreader.databinding.ScreenMainBinding

class MainScreen : Fragment(R.layout.screen_main) {

    private val binding by viewBinding(ScreenMainBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.bottomNavigationView.itemBackground = null

        val navController =
            (childFragmentManager.findFragmentById(R.id.main_fragmentContainerView) as NavHostFragment)
                .navController

        binding.bottomNavigationView.setupWithNavController(navController)

    }
}