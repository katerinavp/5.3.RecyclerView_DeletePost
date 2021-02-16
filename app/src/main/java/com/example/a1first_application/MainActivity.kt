package com.example.a1first_application

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a1first_application.databinding.ActivityMainBinding
import kotlin.properties.Delegates


class MainActivity : AppCompatActivity() {

    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityMainBinding.inflate(LayoutInflater.from(this))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
        adapter.submitList(list)

    }

    val list = listOf(
        Post(
            PostType.SIMPLE,
            1,
            "2020-12-09 19:20:03",
            "Peter",
            "5 STEPS OF PREPARATION TO DEVELOP A NEW APPLICATION",
            null,
            null,
            null,
            null,
            null
        ),
        Post(
            PostType.SIMPLE,
            2,
            "2020-09-09 10:20:03",
            "Anna",
            "Kotlin syntax is similar to Java",
            null,
            null,
            null,
            null,
            null
        ),
        Post(
            PostType.EVENT,
            3,
            "2020-09-09 10:20:03",
            "Ivanov",
            "Gradle is an open-source build automation tool",
            "Москва, ул. Ленинская Слобода",
            Pair(56.13003526647825, 40.41206278961915),
            null,
            null,
            null
        ),
        Post(
            PostType.REPOST,
            4,
            "2020-12-09 19:20:03",
            "Andry",
            null,
            null,
            null,
            "Repost: Android is a mobile operating system",
            null,
            null
        ),
        Post(
            PostType.VIDEO,
            5,
            "2020-12-09 19:20:03",
            "Petrov",
            "Video time",
            null,
            null,
            null,
            "https://www.youtube.com/watch?v=WhWc3b3KhnY",
            null
        ),
        Post(
            PostType.ADV,
            6,
            "2020-12-09 19:20:03",
            "Netology",
            "Study a new profession!",
            null,
            null,
            null,
            null,
            "https://netology.ru/"
        ),
    )

    private val adapter = AdapterPost {
        currentList = currentList.toMutableList().apply { removeAt(it) }
    }

    private var currentList: List<Post> by Delegates.observable(emptyList()) { _, _, newValue ->
        adapter.submitList(newValue)
    }


    init {
        currentList = list
    }

}


















