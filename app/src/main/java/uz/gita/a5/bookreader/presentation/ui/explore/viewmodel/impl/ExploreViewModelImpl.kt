package uz.gita.a5.bookreader.presentation.ui.explore.viewmodel.impl

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.a5.bookreader.data.model.BookData
import uz.gita.a5.bookreader.domain.repository.AppRepository
import uz.gita.a5.bookreader.domain.repository.impl.AppRepositoryImpl
import uz.gita.a5.bookreader.presentation.ui.explore.viewmodel.ExploreViewModel

class ExploreViewModelImpl : ViewModel(), ExploreViewModel {

    private val repository: AppRepository = AppRepositoryImpl.getInstance()

    init {
        getAll()
    }
    override val errorLiveData = MutableLiveData<String>()
    override val booksLiveData = MutableLiveData<List<BookData>>()
    override fun getAll() {
        repository.getAllBook().onEach {
            it.onSuccess {
                booksLiveData.value = it
            }
            it.onFailure {
                errorLiveData.value = it.message
            }
        }.launchIn(viewModelScope)
    }

    override fun getBySearch(name: String) {
        repository.getSearchBook(name).onEach {
            it.onSuccess {
                booksLiveData.value = it
            }
            it.onFailure {
                errorLiveData.value = it.message
            }
        }.launchIn(viewModelScope)
    }


}

