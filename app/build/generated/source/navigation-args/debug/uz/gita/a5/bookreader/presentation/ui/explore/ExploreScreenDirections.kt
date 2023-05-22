package uz.gita.a5.bookreader.presentation.ui.explore

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import uz.gita.a5.bookreader.R
import uz.gita.a5.bookreader.`data`.model.BookData

public class ExploreScreenDirections private constructor() {
  private data class ActionExploreFragmentToAboutFragment(
    public val bookData: BookData
  ) : NavDirections {
    public override val actionId: Int = R.id.action_exploreFragment_to_aboutFragment

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

  public companion object {
    public fun actionExploreFragmentToAboutFragment(bookData: BookData): NavDirections =
        ActionExploreFragmentToAboutFragment(bookData)
  }
}
