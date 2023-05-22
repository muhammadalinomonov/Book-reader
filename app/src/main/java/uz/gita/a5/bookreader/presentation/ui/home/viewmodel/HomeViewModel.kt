package uz.gita.a5.bookreader.presentation.ui.home.viewmodel

import androidx.lifecycle.LiveData
import uz.gita.a5.bookreader.data.model.CategoryData

interface HomeViewModel {
    val categoriesLiveData: LiveData<List<CategoryData>>
    val errorLiveData: LiveData<String>

    fun getBooksByCategoryData()
}