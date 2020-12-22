package com.example.a1first_application

data class Post(
    val id: Int,
    val date: String,
    val author: String,
    val content: String,
//    val image: String,
    var likedByMe: Boolean = false

) {
    override fun toString(): String {
        return "Post($id, $author)"
    }


}




