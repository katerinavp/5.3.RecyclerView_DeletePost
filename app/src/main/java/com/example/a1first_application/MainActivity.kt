package com.example.a1first_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

abstract class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val post = Post(12, "02 december 2020", "Petrov", "This is simple content", false)

        txtPost.text = post.content
        txtDate.text = post.date

        val imageLike = findViewById<ImageView>(R.id.imageLike)
        val imageComment = findViewById<ImageView>(R.id.imageComment)
        val imageShare = findViewById<ImageView>(R.id.imageShare)

        imageLike.setOnClickListener(this)
        imageComment.setOnClickListener(this)
        imageShare.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        val item_id = v.id
        when (item_id) {
            R.id.imageLike ->
                imageLike.setImageResource(R.drawable.ic_baseline_favorite_border_24_red)

            R.id.imageComment ->
                imageLike.setImageResource(R.drawable.ic_baseline_chat_bubble_outline_24_red)

        }
    }
}









