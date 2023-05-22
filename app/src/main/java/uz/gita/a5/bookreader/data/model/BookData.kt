package uz.gita.a5.bookreader.data.model

import java.io.Serializable

data class BookData(
    val author: String = "",
    val bookName: String = "",
    val bookUrl: String = "",
    val genre: String = "",
    val imageUrl: String = "",
    val page: Long = 0,
    val path: String = "",
    val startSize: String = "",
    val description: String = ""
) : Serializable