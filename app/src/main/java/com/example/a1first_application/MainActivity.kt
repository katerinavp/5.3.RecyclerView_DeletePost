package com.example.a1first_application

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
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

    var countLike: Int = 0
    var countComment: Int = 0
    var countShare: Int = 0


    override fun onClick(v: View) {
        val item_id = v.id
        when (item_id) {
            R.id.imageLike -> {
                if (countLike == 0) {
                    countLike += 1
                    imageLike.setImageResource(R.drawable.ic_baseline_favorite_border_24_red)
                    txtCountLike.text = countLike.toString()
                    txtCountLike.setTextColor(Color.RED)
                } else {
                    countLike -= 1
                    imageLike.setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    txtCountLike.text = countLike.toString()
                    txtCountLike.setTextColor(Color.WHITE)
                }
            }
            R.id.imageComment -> {
                if (countComment == 0) {
                    countComment += 1
                    imageComment.setImageResource(R.drawable.ic_baseline_chat_bubble_outline_24_red)
                    txtCountComment.text = countComment.toString()
                    txtCountComment.setTextColor(Color.RED)
                } else {
                    countComment -= 1
                    imageComment.setImageResource(R.drawable.ic_baseline_chat_bubble_outline_24)
                    txtCountComment.text = countComment.toString()
                    txtCountComment.setTextColor(Color.WHITE)
                }
            }
            R.id.imageShare -> {
                if (countShare == 0) {
                    countShare += 1
                    imageShare.setImageResource(R.drawable.ic_baseline_share_24_red)
                    txtCountShare.text = countShare.toString()
                    txtCountShare.setTextColor(Color.RED)
                } else {
                    countShare -= 1
                    imageShare.setImageResource(R.drawable.ic_baseline_share_24)
                    txtCountShare.text = countShare.toString()
                    txtCountShare.setTextColor(Color.WHITE)
                }
            }


        }
    }
}












