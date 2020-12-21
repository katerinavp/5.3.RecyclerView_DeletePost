package com.example.a1first_application

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.a1first_application.databinding.ActivityMainBinding
import com.example.a1first_application.databinding.RecyclerviewItemBinding


class AdapterPost(private val list: List<Post>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() { //наш класс имелепентит RecyclerView.Adapter , который в качестве дженерика принимает в себя <RecyclerView.ViewHolder>()
    //private var items: List<Post> = ArrayList()

    //    private val binding by lazy(LazyThreadSafetyMode.NONE) {
//        ActivityMainBinding.inflate(LayoutInflater.from())
//    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {//создаем ViewHolder , наш класс который мы определили. onCreateViewHolder используется для стыковки xml с нашим классом
        return PostViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        )

    }

    //используем  inflater, в наш viewholder передать view.

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) { // если наш Holder является PostViewHolder надо сбиндить,затем в holder надо положить экземпляр класса Post.
        // нужно положить конкретный элемент из списка по полю position
        when (holder) {
            is PostViewHolder -> {
//                holder.bind(items[position])
                holder.bind(list[position])
            }

        }


    }

    override fun getItemCount(): Int =
            list.size

    class PostViewHolder //создаем viewHolder внутри конструктора передаем нашу View. В PostViewHolder происходит описание, что делаем с item
    constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = RecyclerviewItemBinding.bind(itemView)
        val post_author: TextView = binding.txtAuthor
        val post__content: TextView = binding.txtPost
        val post__date:  TextView = binding.txtDate
//        }

        //val post_image = itemView.findViewById(R.id.imageLogo)
//        val post_author = itemView.// берет данные из xml
//        val post_content = itemView.txtPost
//
        fun bind(post: Post) {//функция bind , которая будет на вхожит принимать пост, и загружать картинку
//            val requestOptions =
//                RequestOptions() // создается задний фон для нашего списка, если картинка не загрузится по каким то причинам сети., то загружай картинку, которая есть локально
//                    .placeholder(R.drawable.ic_launcher_background)
//                    .error(R.drawable.ic_launcher_background)
//            Glide.with(itemView.context) // передаем контекст из ячейки
//                .applyDefaultRequestOptions(requestOptions) // когда по умолчанию используем картинку ic_launcher_background
//                .load(post.image) //загружаем наш url
//                .into(post_image)

            post_author.setText(post.author)
            post__content.setText(post.content)
            post__date.setText(post.date)
//        }

        }
    }
}
//}

