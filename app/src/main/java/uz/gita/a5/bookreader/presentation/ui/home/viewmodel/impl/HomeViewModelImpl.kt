package uz.gita.a5.bookreader.presentation.ui.home.viewmodel.impl

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.a5.bookreader.data.model.CategoryData
import uz.gita.a5.bookreader.data.source.local.MySharedPref
import uz.gita.a5.bookreader.data.source.local.impl.MySharedPrefImpl
import uz.gita.a5.bookreader.domain.usecase.explore.HomeUseCase
import uz.gita.a5.bookreader.presentation.ui.home.viewmodel.HomeViewModel

class HomeViewModelImpl(private val useCase: HomeUseCase) : ViewModel(), HomeViewModel {

    //    private val repository: AppRepository = AppRepositoryImpl.getInstance()


    private val sharedPref:MySharedPref = MySharedPrefImpl.getInstance()
    override val categoriesLiveData = MutableLiveData<List<CategoryData>>()
    override val errorLiveData = MutableLiveData<String>()
    override val loadingLiveData = MutableLiveData<Boolean>()
    override val maxProgressLiveData = MutableLiveData(sharedPref.totalPage)
    override val progressLiveData = MutableLiveData(sharedPref.savedPage)
    override val userAvatarLiveData:MutableLiveData<String> = MutableLiveData(sharedPref.imageUri)
    override val userNameLiveData:MutableLiveData<String> = MutableLiveData(sharedPref.name)


    init {
        Log.d("TTT", "viewmodel init")
    }

    override fun getBooksByCategoryData() {

        userAvatarLiveData.value = sharedPref.imageUri
        userNameLiveData.value = sharedPref.name
        progressLiveData.value = sharedPref.savedPage
        loadingLiveData.value = true
        useCase.getBooksByCategoryData().onEach {


            Log.d("TTT", "getBooksByCategoryData viewmodel")

            it.onSuccess { list ->
                loadingLiveData.value = false
                Log.d("TTT", "onSuccess viewmodel")
                categoriesLiveData.value = list
            }
            it.onFailure {
                loadingLiveData.value = false
                Log.d("TTT", "onFailure viewmodel")
                errorLiveData.value = it.message
            }
        }.launchIn(viewModelScope)
    }

    @Suppress("UNCHECKED_CAST")
    class Factory(private val useCase: HomeUseCase) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return HomeViewModelImpl(useCase) as T
        }
    }
}

/*
override fun getBooksByCategoryData() {
        repository.getBooksByCategory().onEach {
            it.onSuccess { list ->
                val fantasyData = list.filter { it.genre == "fantasy" }
                val psychologyData = list.filter { it.genre == "psychology" }

                categoriesLiveData.value = listOf(
                    CategoryData("Fantasy", fantasyData),
                    CategoryData("psychology", psychologyData),
                )
            }
            it.onFailure {
                errorLiveData.value = it.message
            }
        }.launchIn(viewModelScope)
    }
*/