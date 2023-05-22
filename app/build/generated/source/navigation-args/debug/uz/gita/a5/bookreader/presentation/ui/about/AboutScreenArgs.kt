package uz.gita.a5.bookreader.presentation.ui.about

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import uz.gita.a5.bookreader.`data`.model.BookData

public data class AboutScreenArgs(
  public val bookData: BookData
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(BookData::class.java)) {
      result.set("bookData", this.bookData as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(BookData::class.java)) {
      result.set("bookData", this.bookData as Serializable)
    } else {
      throw UnsupportedOperationException(BookData::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): AboutScreenArgs {
      bundle.setClassLoader(AboutScreenArgs::class.java.classLoader)
      val __bookData : BookData?
      if (bundle.containsKey("bookData")) {
        if (Parcelable::class.java.isAssignableFrom(BookData::class.java) ||
            Serializable::class.java.isAssignableFrom(BookData::class.java)) {
          __bookData = bundle.get("bookData") as BookData?
        } else {
          throw UnsupportedOperationException(BookData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__bookData == null) {
          throw IllegalArgumentException("Argument \"bookData\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"bookData\" is missing and does not have an android:defaultValue")
      }
      return AboutScreenArgs(__bookData)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AboutScreenArgs {
      val __bookData : BookData?
      if (savedStateHandle.contains("bookData")) {
        if (Parcelable::class.java.isAssignableFrom(BookData::class.java) ||
            Serializable::class.java.isAssignableFrom(BookData::class.java)) {
          __bookData = savedStateHandle.get<BookData?>("bookData")
        } else {
          throw UnsupportedOperationException(BookData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__bookData == null) {
          throw IllegalArgumentException("Argument \"bookData\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"bookData\" is missing and does not have an android:defaultValue")
      }
      return AboutScreenArgs(__bookData)
    }
  }
}
