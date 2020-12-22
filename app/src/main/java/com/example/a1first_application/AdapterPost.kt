package com.example.a1first_application

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.a1first_application.databinding.RecyclerviewItemBinding
import java.time.LocalDateTime
import java.time.ZoneId


class AdapterPost : ListAdapter<Post, AdapterPost.PostViewHolder>(PostDiffer) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder =
            PostViewHolder(
                    RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

            )


    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(getItem(position))

    }

    class PostViewHolder(
            private val binding: RecyclerviewItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(post: Post) {
            with(binding) {
                imageLogo.setImageResource(R.drawable.ic_baseline_android_24)
                txtAuthor.text = post.author
                txtPost.text = post.content
                txtDate.text = post.date
                imageLike.setImageResource(R.drawable.ic_baseline_favorite_border_24)
                imageComment.setImageResource(R.drawable.ic_baseline_chat_bubble_outline_24)
                imageShare.setImageResource(R.drawable.ic_baseline_share_24)

            }
            var countLike: Int = 0
            var countComment: Int = 0
            var countShare: Int = 0


            binding.imageLike.setOnClickListener(object : View.OnClickListener {
                override fun onClick(v: View?) {
                    if (countLike == 0) {
                        countLike += 1
                        binding.imageLike.setImageResource(R.drawable.ic_baseline_favorite_border_24_red)
                        binding.txtCountLike.text = countLike.toString()
                        binding.txtCountLike.setTextColor(Color.RED)
                    } else {
                        countLike -= 1
                        binding.imageLike.setImageResource(R.drawable.ic_baseline_favorite_border_24)
                        binding.txtCountLike.text = countLike.toString()
                        binding.txtCountLike.setTextColor(Color.WHITE)
                    }
                }
            })

            binding.imageComment.setOnClickListener(object : View.OnClickListener {
                override fun onClick(v: View?) {
                    if (countComment == 0) {
                        countComment += 1
                        binding.imageComment.setImageResource(R.drawable.ic_baseline_chat_bubble_outline_24_red)
                        binding.txtCountComment.text = countComment.toString()
                        binding.txtCountComment.setTextColor(Color.RED)
                    } else {
                        countComment -= 1
                        binding.imageComment.setImageResource(R.drawable.ic_baseline_chat_bubble_outline_24)
                        binding.txtCountComment.text = countComment.toString()
                        binding.txtCountComment.setTextColor(Color.WHITE)
                    }
                }
            })
            binding.imageShare.setOnClickListener(object : View.OnClickListener {
                override fun onClick(v: View?) {
                    if (countShare == 0) {
                        countShare += 1
                        binding.imageShare.setImageResource(R.drawable.ic_baseline_share_24_red)
                        binding.txtCountShare.text = countShare.toString()
                        binding.txtCountShare.setTextColor(Color.RED)
                    } else {
                        countShare -= 1
                        binding.imageShare.setImageResource(R.drawable.ic_baseline_share_24)
                        binding.txtCountShare.text = countShare.toString()
                        binding.txtCountShare.setTextColor(Color.WHITE)
                    }
                }

            })

        }
    }

    private object PostDiffer : DiffUtil.ItemCallback<Post>() {
        override fun areItemsTheSame(oldItem: Post, newItem: Post): Boolean =
                oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Post, newItem: Post): Boolean = oldItem == newItem
    }

}
