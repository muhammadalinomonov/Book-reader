package uz.gita.a5.bookreader.presentation.ui.saved.viewmodel.impl

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.a5.bookreader.data.model.BookData
import uz.gita.a5.bookreader.domain.repository.AppRepository
import uz.gita.a5.bookreader.domain.repository.impl.AppRepositoryImpl
import uz.gita.a5.bookreader.presentation.ui.saved.viewmodel.SavedViewModel

class SavedViewModelImpl : ViewModel(), SavedViewModel {
    private val repository: AppRepository = AppRepositoryImpl.getInstance()

    override val errorLiveData = MutableLiveData<String>()
    override val booksLiveData = MutableLiveData<List<BookData>>()
    override val loadingLiveData = MutableLiveData<Boolean>()


    override fun getAllSavedBook(context: Context) {
        loadingLiveData.value = true
        repository.getSavedBooks(context).onEach {
            it.onSuccess {
                loadingLiveData.value = false
                booksLiveData.value = it
            }
            it.onFailure {
                loadingLiveData.value = false
                errorLiveData.value = it.message
            }
        }.launchIn(viewModelScope)
    }

}