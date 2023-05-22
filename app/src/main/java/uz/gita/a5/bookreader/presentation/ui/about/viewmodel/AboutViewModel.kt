package uz.gita.a5.bookreader.presentation.ui.about.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import uz.gita.a5.bookreader.data.model.BookData

interface AboutViewModel {
    val errorLiveData: LiveData<String>
    val successLiveData: LiveData<String>
    val loadingLiveData: LiveData<Boolean>

    fun downloadBookByUrl(context: Context, bookData: BookData)
}