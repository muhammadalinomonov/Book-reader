package uz.gita.a5.bookreader.presentation.ui.saved.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import uz.gita.a5.bookreader.data.model.BookData

interface SavedViewModel {
    val errorLiveData: LiveData<String>
    val booksLiveData: LiveData<List<BookData>>

    fun getAllSavedBook(context: Context)
}