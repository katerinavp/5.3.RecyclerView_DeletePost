package com.example.a1first_application

data class Post (
        var type: PostType,
        val id: Int,
        val date: String?,
        val author: String?,
        val content: String?,
        val adress: String?,
        val location: Pair<Double?, Double?>?,
        val repost: String?,
        val video:String?,
        val adv:String?


        )







