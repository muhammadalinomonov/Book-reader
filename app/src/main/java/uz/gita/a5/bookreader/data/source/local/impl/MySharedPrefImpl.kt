package uz.gita.a5.bookreader.data.source.local.impl

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import uz.gita.a5.bookreader.data.source.local.MySharedPref

class MySharedPrefImpl : MySharedPref {


    private val pref: SharedPreferences =
        context.getSharedPreferences("MY_PREF", Context.MODE_PRIVATE)
    private val BOOK_NAME = "BOOK_NAME"
    private val SAVED_PAGE = "SAVED_PAGE"
    private val TOTAL_PAGE = "TOTAL_PAGE"
    override var bookName: String?
        get() = pref.getString(BOOK_NAME, "")
        set(value) {
            pref.edit().putString(BOOK_NAME, value).apply()
        }
    override var savedPage: Int
        get() = pref.getInt(SAVED_PAGE, 0)
        set(value) {
            pref.edit().putInt(SAVED_PAGE, value).apply()
        }
    override var totalPage: Int
        get() = pref.getInt(TOTAL_PAGE, 0)
        set(value) {
            pref.edit().putInt(TOTAL_PAGE, value).apply()
        }
    override var isFirst: Boolean
        get() = pref.getBoolean("IS_FIRST", true)
        set(value) {
            pref.edit().putBoolean("IS_FIRST", value).apply()
        }
    override var bookUrl: String
        get() = pref.getString("BOOK_URL", "")!!
        set(value) {
            pref.edit().putString("BOOK_URL", value).apply()
        }


    override fun savedPageByBookName(bookName: String, page: Int) {
        pref.edit().putInt(bookName, page).apply()
    }

    override fun getSavedPageByBookName(bookName: String): Int = pref.getInt(bookName, 0)

    companion object {
        private lateinit var instance: MySharedPref

        fun getInstance(): MySharedPref {
            if (!(::instance.isInitialized)) {
                instance = MySharedPrefImpl()
            }
            return instance
        }

        @SuppressLint("StaticFieldLeak")
        private lateinit var context: Context
        fun init(context: Context) {
            this.context = context
        }
    }
}