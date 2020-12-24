package com.example.a1first_application

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a1first_application.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var adapterPost: AdapterPost

    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityMainBinding.inflate(LayoutInflater.from(this))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = AdapterPost()
        binding.recyclerView.adapter = adapter
        adapter.submitList(list)

    }

    private val list = listOf(
            Post(PostTypes.SIMPLE, 1, "2020-12-09 19:20:03", "Petrov", "Post1", null, null,null,null,null) ,
            Post(PostTypes.SIMPLE, 2, "2020-09-09 10:20:03", "Ivanov", "Post2",null, null,null,null,null),
            Post(PostTypes.EVENT, 3, "2020-09-09 10:20:03", "Ivanov", "Post3","Москва, ул. Ленинская Слобода", Pair(56.13003526647825 , 40.41206278961915),null,null,null),
            Post(PostTypes.REPOST,4,"2020-12-09 19:20:03","Petrov",null,null,null ,"RepostText",null,null),
            Post(PostTypes.VIDEO,5,"2020-12-09 19:20:03", "Petrov", "Post5" ,null,null,null,"https://www.youtube.com/watch?v=WhWc3b3KhnY",null),
            Post(PostTypes.ADV, 6, "2020-12-09 19:20:03", "Petrov", "Post6", null, null,null,null,"https://netology.ru/") ,
    )


}


















