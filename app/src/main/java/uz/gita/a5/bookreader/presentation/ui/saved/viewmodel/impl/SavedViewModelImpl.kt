package uz.gita.a5.bookreader.presentation.ui.saved.viewmodel.impl

import android.content.Context
import androidx.lifecycle.LiveData
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

    override fun getAllSavedBook(context: Context) {
        repository.getSavedBooks(context).onEach {
            it.onSuccess {
                booksLiveData.value = it
            }
            it.onFailure {
                errorLiveData.value = it.message
            }
        }.launchIn(viewModelScope)
    }

}