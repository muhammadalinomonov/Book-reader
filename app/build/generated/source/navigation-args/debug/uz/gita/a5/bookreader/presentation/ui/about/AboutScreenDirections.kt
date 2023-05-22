package uz.gita.a5.bookreader.presentation.ui.about

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String
import uz.gita.a5.bookreader.R

public class AboutScreenDirections private constructor() {
  private data class ActionAboutFragmentToReadBookScreen(
    public val totalPage: Int,
    public val bookName: String,
    public val imageUrl: String,
    public val savedPage: Int = 0
  ) : NavDirections {
    public override val actionId: Int = R.id.action_aboutFragment_to_readBookScreen

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("totalPage", this.totalPage)
        result.putInt("savedPage", this.savedPage)
        result.putString("bookName", this.bookName)
        result.putString("imageUrl", this.imageUrl)
        return result
      }
  }

  public companion object {
    public fun actionAboutFragmentToReadBookScreen(
      totalPage: Int,
      bookName: String,
      imageUrl: String,
      savedPage: Int = 0
    ): NavDirections = ActionAboutFragmentToReadBookScreen(totalPage, bookName, imageUrl, savedPage)
  }
}
