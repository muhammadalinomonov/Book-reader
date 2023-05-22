package uz.gita.a5.bookreader.domain.repository

import android.content.Context
import kotlinx.coroutines.flow.Flow
import uz.gita.a5.bookreader.data.model.BookData

interface AppRepository {
    fun getAllBook(): Flow<Result<List<BookData>>>
    suspend  fun getBooksByCategory(): Result<List<BookData>>
    fun downloadBookByUrl(context: Context, bookData: BookData): Flow<Result<String>>
    fun getSavedBooks(context: Context): Flow<Result<List<BookData>>>
    fun getSearchBook(name:String):Result<List<BookData>>
}