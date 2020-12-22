package com.example.a1first_application

import android.graphics.Color
import android.os.Bundle
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a1first_application.databinding.ActivityMainBinding
import java.time.*


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
        Post(
            1, "2020-12-09 19:20:03", "Petrov", "Post1",),
        Post(
            2, "2020-09-09 10:20:03", "Ivanov", "Post2",
        ),
        Post(
            3, "2020-09-09 10:20:03", "Ivanov", "Post3",
        ),
        Post(
            4, "2020-09-09 10:20:03", "Ivanov", "Post4",
        ),
        Post(
            5, "2020-09-09 10:20:03", "Ivanov", "Post5",
        ),
        Post(
            6, "2020-09-09 10:20:03", "Ivanov", "Post5",
        ),
        Post(
            7, "2020-09-09 10:20:03", "Ivanov", "Post7",
        ),
        Post(
            8, "2020-09-09 10:20:03", "Ivanov", "Post8",
        ),
    )

}


















