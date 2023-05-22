package uz.gita.a5.bookreader.domain.usecase.explore

import kotlinx.coroutines.flow.Flow
import uz.gita.a5.bookreader.data.model.CategoryData

interface HomeUseCase {
    fun getBooksByCategoryData(): Flow<Result<List<CategoryData>>>
}