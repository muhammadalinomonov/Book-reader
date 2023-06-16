package uz.gita.a5.bookreader.presentation.ui.home.viewmodel.impl

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.a5.bookreader.data.model.CategoryData
import uz.gita.a5.bookreader.domain.usecase.explore.HomeUseCase
import uz.gita.a5.bookreader.presentation.ui.home.viewmodel.HomeViewModel

class HomeViewModelImpl(private val useCase: HomeUseCase) : ViewModel(), HomeViewModel {

    //    private val repository: AppRepository = AppRepositoryImpl.getInstance()
    override val categoriesLiveData = MutableLiveData<List<CategoryData>>()
    override val errorLiveData = MutableLiveData<String>()


    init {
        Log.d("TTT", "viewmodel init")
    }

    override fun getBooksByCategoryData() {
        useCase.getBooksByCategoryData().onEach {

            Log.d("TTT", "getBooksByCategoryData viewmodel")

            it.onSuccess { list ->
                Log.d("TTT", "onSuccess viewmodel")
                categoriesLiveData.value = list
            }
            it.onFailure {
                Log.d("TTT", "onFailure viewmodel")
                errorLiveData.value = it.message
            }
        }.launchIn(viewModelScope)
    }

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
* */