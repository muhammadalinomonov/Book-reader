package uz.gita.a5.bookreader.presentation.ui.splash

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.gita.a5.bookreader.R

public class SplashScreenDirections private constructor() {
  public companion object {
    public fun actionSplashScreenToMainScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashScreen_to_mainScreen)

    public fun actionSplashScreenToViewPager(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashScreen_to_viewPager)
  }
}
