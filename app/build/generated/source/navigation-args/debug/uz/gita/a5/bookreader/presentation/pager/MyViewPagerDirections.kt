package uz.gita.a5.bookreader.presentation.pager

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.gita.a5.bookreader.R

public class MyViewPagerDirections private constructor() {
  public companion object {
    public fun actionViewPagerToMainScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_viewPager_to_mainScreen)
  }
}
