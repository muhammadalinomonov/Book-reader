package uz.gita.a5.bookreader.presentation.ui.explore.viewmodel

import androidx.lifecycle.LiveData
import uz.gita.a5.bookreader.data.model.BookData

interface ExploreViewModel {
    val errorLiveData: LiveData<String>
    val booksLiveData: LiveData<List<BookData>>
    val loadingLiveData:LiveData<Boolean>

    fun getAll()
    fun getBySearch(name:String)
}