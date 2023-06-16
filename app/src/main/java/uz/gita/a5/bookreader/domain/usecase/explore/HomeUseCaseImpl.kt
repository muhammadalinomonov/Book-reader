package uz.gita.a5.bookreader.domain.usecase.explore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import uz.gita.a5.bookreader.data.model.CategoryData
import uz.gita.a5.bookreader.domain.repository.AppRepository

class HomeUseCaseImpl(private val repository: AppRepository) : HomeUseCase {


    override fun getBooksByCategoryData(): Flow<Result<List<CategoryData>>> = flow {
        val list = arrayListOf<CategoryData>()

        val result = repository.getBooksByCategory().map { bookDataList ->
            val fantasyData = bookDataList.filter { it.genre == "fantasy" }
            val psychologyData = bookDataList.filter { it.genre == "psychology" }
            val classicLiterature = bookDataList.filter { it.genre == "Classic Literature" }

            list.add(CategoryData("Fantasy", fantasyData))
            list.add(CategoryData("Psychology", psychologyData))
            list.add(CategoryData("Classic Literature", classicLiterature))
        }

        result.onSuccess {
            emit(Result.success(list))
        }

        result.onFailure {
            emit(Result.failure(it))
        }
    }
}