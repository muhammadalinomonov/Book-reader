package uz.gita.a5.bookreader.presentation.ui.about.viewmodel.impl

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
import uz.gita.a5.bookreader.presentation.ui.about.viewmodel.AboutViewModel


class AboutViewModelImpl : AboutViewModel, ViewModel() {
    private val repository: AppRepository = AppRepositoryImpl.getInstance()

    override val errorLiveData = MutableLiveData<String>()
    override val successLiveData = MutableLiveData<String>()
    override val loadingLiveData = MutableLiveData<Boolean>()

    override fun downloadBookByUrl(context: Context, bookData: BookData) {
        loadingLiveData.value = true
        repository.downloadBookByUrl(context, bookData).onEach {
            it.onSuccess {
                loadingLiveData.value = false
                successLiveData.value = it
            }
            it.onFailure {
                loadingLiveData.value = false
                errorLiveData.value = it.message
            }
        }.launchIn(viewModelScope)
    }
}

