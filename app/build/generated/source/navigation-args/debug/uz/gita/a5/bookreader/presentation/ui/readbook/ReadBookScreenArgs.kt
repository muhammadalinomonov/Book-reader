package uz.gita.a5.bookreader.presentation.ui.readbook

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ReadBookScreenArgs(
  public val totalPage: Int,
  public val bookName: String,
  public val imageUrl: String,
  public val savedPage: Int = 0
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("totalPage", this.totalPage)
    result.putInt("savedPage", this.savedPage)
    result.putString("bookName", this.bookName)
    result.putString("imageUrl", this.imageUrl)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("totalPage", this.totalPage)
    result.set("savedPage", this.savedPage)
    result.set("bookName", this.bookName)
    result.set("imageUrl", this.imageUrl)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ReadBookScreenArgs {
      bundle.setClassLoader(ReadBookScreenArgs::class.java.classLoader)
      val __totalPage : Int
      if (bundle.containsKey("totalPage")) {
        __totalPage = bundle.getInt("totalPage")
      } else {
        throw IllegalArgumentException("Required argument \"totalPage\" is missing and does not have an android:defaultValue")
      }
      val __savedPage : Int
      if (bundle.containsKey("savedPage")) {
        __savedPage = bundle.getInt("savedPage")
      } else {
        __savedPage = 0
      }
      val __bookName : String?
      if (bundle.containsKey("bookName")) {
        __bookName = bundle.getString("bookName")
        if (__bookName == null) {
          throw IllegalArgumentException("Argument \"bookName\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"bookName\" is missing and does not have an android:defaultValue")
      }
      val __imageUrl : String?
      if (bundle.containsKey("imageUrl")) {
        __imageUrl = bundle.getString("imageUrl")
        if (__imageUrl == null) {
          throw IllegalArgumentException("Argument \"imageUrl\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"imageUrl\" is missing and does not have an android:defaultValue")
      }
      return ReadBookScreenArgs(__totalPage, __bookName, __imageUrl, __savedPage)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ReadBookScreenArgs {
      val __totalPage : Int?
      if (savedStateHandle.contains("totalPage")) {
        __totalPage = savedStateHandle["totalPage"]
        if (__totalPage == null) {
          throw IllegalArgumentException("Argument \"totalPage\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"totalPage\" is missing and does not have an android:defaultValue")
      }
      val __savedPage : Int?
      if (savedStateHandle.contains("savedPage")) {
        __savedPage = savedStateHandle["savedPage"]
        if (__savedPage == null) {
          throw IllegalArgumentException("Argument \"savedPage\" of type integer does not support null values")
        }
      } else {
        __savedPage = 0
      }
      val __bookName : String?
      if (savedStateHandle.contains("bookName")) {
        __bookName = savedStateHandle["bookName"]
        if (__bookName == null) {
          throw IllegalArgumentException("Argument \"bookName\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"bookName\" is missing and does not have an android:defaultValue")
      }
      val __imageUrl : String?
      if (savedStateHandle.contains("imageUrl")) {
        __imageUrl = savedStateHandle["imageUrl"]
        if (__imageUrl == null) {
          throw IllegalArgumentException("Argument \"imageUrl\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"imageUrl\" is missing and does not have an android:defaultValue")
      }
      return ReadBookScreenArgs(__totalPage, __bookName, __imageUrl, __savedPage)
    }
  }
}
