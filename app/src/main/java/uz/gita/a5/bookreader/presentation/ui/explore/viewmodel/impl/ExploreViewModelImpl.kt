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
    override val loadingLiveData = MutableLiveData<Boolean>()
    override fun getAll() {
        repository.getAllBook().onEach {
            loadingLiveData.value = true
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

    override fun getBySearch(name: String) {
        loadingLiveData.value = true
        repository.getSearchBook(name).onEach {
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

