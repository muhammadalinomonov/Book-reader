package uz.gita.a5.bookreader.domain.repository.impl

import android.content.Context
import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import uz.gita.a5.bookreader.data.model.BookData
import uz.gita.a5.bookreader.domain.repository.AppRepository
import java.io.File

class AppRepositoryImpl private constructor() : AppRepository {

    private val db = Firebase.firestore
    private val storage = Firebase.storage

    companion object {
        private lateinit var instance: AppRepository
        fun getInstance(): AppRepository {
            if (!(::instance.isInitialized)) {
                instance = AppRepositoryImpl()
            }
            return instance
        }
    }

    override fun getAllBook(): Flow<Result<List<BookData>>> = callbackFlow<Result<List<BookData>>> {
        db.collection("books")
            .get()
            .addOnSuccessListener { querySnapshot ->
                val dataList = arrayListOf<BookData>()
                querySnapshot.forEach {
                    val bookData = BookData(
                        it.get("author") as String,
                        it.get("bookName") as String,
                        it.get("bookUrl") as String,
                        it.get("genre") as String,
                        it.get("imageUrl") as String,
                        it.get("page") as Long,
                        it.get("path") as String,
                        it.get("startSize") as String,
                        it.get("description") as String
                    )
                    dataList.add(bookData)
                }
                trySend(Result.success(dataList))
            }
            .addOnFailureListener { trySend(Result.failure(it)) }
        awaitClose()
    }.flowOn(Dispatchers.IO)


    override suspend fun getBooksByCategory(): Result<List<BookData>> =
        withContext(Dispatchers.IO) {
            try {
                Log.d("TTT", "getBooksByCategory")
                val books = db.collection("books").get().await()

                val list = arrayListOf<BookData>()

                books.forEach {
                    list.add(it.toObject(BookData::class.java))
                }
                return@withContext Result.success(list)
            } catch (e: Exception) {
                return@withContext Result.failure(e)
            }
        }

    override fun downloadBookByUrl(context: Context, bookData: BookData): Flow<Result<String>> =
        callbackFlow<Result<String>> {
            if (File(context.filesDir, bookData.bookName).exists()) {
                trySend(Result.success(bookData.bookName))
            } else {
                storage.reference.child(bookData.path)
                    .getFile(File(context.filesDir, bookData.bookName))
                    .addOnSuccessListener {
                        trySend(Result.success("Success"))
                    }
                    .addOnFailureListener {
                        trySend(Result.failure(it))
                    }
            }
            awaitClose()
        }.flowOn(Dispatchers.IO)

    override fun getSavedBooks(context: Context): Flow<Result<List<BookData>>> =
        callbackFlow<Result<List<BookData>>> {
            db.collection("books")
                .get()
                .addOnSuccessListener {
                    val list = arrayListOf<BookData>()
                    it.forEach { data ->
                        val book = File(context.filesDir, data.get("bookName").toString())

                        if (book.exists()) {
                            val temp = data.toObject(BookData::class.java)
                            list.add(temp)
                        }
                    }
                    trySend(Result.success(list))
                }
                .addOnFailureListener {
                    trySend(Result.failure(it))
                }
            awaitClose()
        }.flowOn(Dispatchers.IO)

    override fun getSearchBook(name: String): Flow<Result<List<BookData>>> = callbackFlow {
        db.collection("books")
            .get()
            .addOnSuccessListener { querySnapshot ->
                val dataList = arrayListOf<BookData>()

                querySnapshot.forEach {
                    val bookData = BookData(
                        it.get("author") as String,
                        it.get("bookName") as String,
                        it.get("bookUrl") as String,
                        it.get("genre") as String,
                        it.get("imageUrl") as String,
                        it.get("page") as Long,
                        it.get("path") as String,
                        it.get("startSize") as String,
                        it.get("description") as String
                    )

                    if (bookData.bookName.startsWith(name) || bookData.author.startsWith(name))
                        dataList.add(bookData)
                }
                trySend(Result.success(dataList))
            }
            .addOnFailureListener { trySend(Result.failure(it)) }
        awaitClose()
    }
}
