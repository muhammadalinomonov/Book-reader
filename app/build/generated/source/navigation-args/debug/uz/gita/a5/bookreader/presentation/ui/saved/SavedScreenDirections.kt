package uz.gita.a5.bookreader.presentation.ui.saved

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String
import uz.gita.a5.bookreader.R

public class SavedScreenDirections private constructor() {
  private data class ActionFavoriteFragmentToReadBookScreen(
    public val totalPage: Int,
    public val bookName: String,
    public val imageUrl: String,
    public val savedPage: Int = 0
  ) : NavDirections {
    public override val actionId: Int = R.id.action_favoriteFragment_to_readBookScreen

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
    public fun actionFavoriteFragmentToReadBookScreen(
      totalPage: Int,
      bookName: String,
      imageUrl: String,
      savedPage: Int = 0
    ): NavDirections = ActionFavoriteFragmentToReadBookScreen(totalPage, bookName, imageUrl,
        savedPage)
  }
}
