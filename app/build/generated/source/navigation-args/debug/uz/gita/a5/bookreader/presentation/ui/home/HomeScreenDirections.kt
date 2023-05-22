package uz.gita.a5.bookreader.presentation.ui.home

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import uz.gita.a5.bookreader.R
import uz.gita.a5.bookreader.`data`.model.BookData

public class HomeScreenDirections private constructor() {
  private data class ActionHomeFragmentToAboutFragment(
    public val bookData: BookData
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_aboutFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(BookData::class.java)) {
          result.putParcelable("bookData", this.bookData as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(BookData::class.java)) {
          result.putSerializable("bookData", this.bookData as Serializable)
        } else {
          throw UnsupportedOperationException(BookData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class ActionHomeFragmentToReadBookScreen(
    public val totalPage: Int,
    public val bookName: String,
    public val imageUrl: String,
    public val savedPage: Int = 0
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_readBookScreen

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
    public fun actionHomeFragmentToAboutFragment(bookData: BookData): NavDirections =
        ActionHomeFragmentToAboutFragment(bookData)

    public fun actionHomeFragmentToReadBookScreen(
      totalPage: Int,
      bookName: String,
      imageUrl: String,
      savedPage: Int = 0
    ): NavDirections = ActionHomeFragmentToReadBookScreen(totalPage, bookName, imageUrl, savedPage)
  }
}
