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


class MainActivity : AppCompatActivity(){
//        View.OnClickListener {
    private lateinit var adapterPost: AdapterPost

//

//    private fun addData(){
//        val data = DataSource.createDataSet()
//
//    }

    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityMainBinding.inflate(LayoutInflater.from(this))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = AdapterPost(list)
    }
       private val list = ArrayList<Post>().apply {
           Post(
                   1, "2020-12-09 19:20:03", "Petrov", "Post1",

           )
           Post(
                   2, "2020-09-09 10:20:03", "Ivanov", "Post2",
                   )


       }

//        binding.txtPost.text = post.content
//        binding.txtAuthor.text = post.author
//        val postTime: String = post.date
//        println("Время $postTime")
//
//        time(post)

//    private fun initRecycleView() {
//        recycle_view.apply {
//            layoutManager = LinearLayoutManager(this@MainActivity) //LinearLayoutManager нужен, чтобы элементы списка отображались линейно
//            val topSpaceingDecorator = TopSpasingItemDecoration(45) // расстояние между картинкой и текстом
//            addItemDecotation(topSpaceingDecorator)
//
//            adapter = AdapterPost()
//        }
//    }

//
//        binding.imageLike.setOnClickListener(this)
//        binding.imageComment.setOnClickListener(this)
//        binding.imageShare.setOnClickListener(this)

//    }

//    var countLike: Int = 0
//    var countComment: Int = 0
//    var countShare: Int = 0

//    override fun onClick(v: View) {
//        when (v.id) {
//            R.id.imageLike -> {
//                if (countLike == 0) {
//                    countLike += 1
//                    binding.imageLike.setImageResource(R.drawable.ic_baseline_favorite_border_24_red)
//                    binding.txtCountLike.text = countLike.toString()
//                    binding.txtCountLike.setTextColor(Color.RED)
//                } else {
//                    countLike -= 1
//                    binding.imageLike.setImageResource(R.drawable.ic_baseline_favorite_border_24)
//                    binding.txtCountLike.text = countLike.toString()
//                    binding.txtCountLike.setTextColor(Color.WHITE)
//                }
//            }
//            R.id.imageComment -> {
//                if (countComment == 0) {
//                    countComment += 1
//                    binding.imageComment.setImageResource(R.drawable.ic_baseline_chat_bubble_outline_24_red)
//                    binding.txtCountComment.text = countComment.toString()
//                    binding.txtCountComment.setTextColor(Color.RED)
//                } else {
//                    countComment -= 1
//                    binding.imageComment.setImageResource(R.drawable.ic_baseline_chat_bubble_outline_24)
//                    binding.txtCountComment.text = countComment.toString()
//                    binding.txtCountComment.setTextColor(Color.WHITE)
//                }
//            }
//            R.id.imageShare -> {
//                if (countShare == 0) {
//                    countShare += 1
//                    binding.imageShare.setImageResource(R.drawable.ic_baseline_share_24_red)
//                    binding.txtCountShare.text = countShare.toString()
//                    binding.txtCountShare.setTextColor(Color.RED)
//                } else {
//                    countShare -= 1
//                    binding.imageShare.setImageResource(R.drawable.ic_baseline_share_24)
//                    binding.txtCountShare.text = countShare.toString()
//                    binding.txtCountShare.setTextColor(Color.WHITE)
//                }
//            }
//        }
//    }
//
//    fun time(post: Post) {
//        val zid: ZoneId = ZoneId.of("Europe/Moscow")
//        val dateTime = LocalDateTime.now(zid)
//        val postTime: String = post.date
//
//
//        val postList: List<String> = postTime.split(" ")
//        println("Размер листа $postList")
//
//        val postSecondsList: List<String> = postList[1].split(":")
//
//        val postHour: Int = postSecondsList[0].toInt() * 3600
//        val postMinutes: Int = postSecondsList[1].toInt() * 60
//        val postSecond: Int = postSecondsList[2].toInt()
//
//        val currentHour: Int = dateTime.hour * 3600
//        val currentMinutes: Int = dateTime.minute * 60
//        val currentSeconds: Int = dateTime.second
//
//        val postDate: List<String> = postList[0].split("-")
//        val postYear: Int = postDate[0].toInt() * 31536000
//        val postMonth: Double = postDate[1].toInt() * 2629743.83
//        val postDay: Int = postDate[2].toInt() * 86400
//        val postSum = postHour + postMinutes + postSecond + postMonth + postDay + postYear
//
//        val currentYear = dateTime.year * 31536000
//        val currentMonth: Double = dateTime.monthValue * 2629743.83
//        val currentDay: Int = dateTime.dayOfMonth * 86400
//        val currentSum =
//            currentHour + currentMinutes + currentSeconds + currentMonth + currentDay + currentYear
//
//        val resultSeconds = currentSum - postSum
//
//        val minutes: Double = resultSeconds / 60
//        val hours: Double = resultSeconds / 3600
//        val day: Double = resultSeconds / 86400
//        val month: Double = resultSeconds / 2629743.83
//        val year: Double = resultSeconds / 31536000.0
//
//        val publishedAgoText: String = when (resultSeconds) {
//
//            in 0.0..59.0 -> "${resultSeconds.toInt()} секунд(а/ы) назад"
//            in 60.0..3599.0 -> "${minutes.toInt()} минут(ы/а) назад"
//            in 3600.0..86399.0 -> "${hours.toInt()} час(а/ов) назад"
//            in 86400.0..2629743.82 -> "${day.toInt()} день(дня/ей) назад"
//            in 2629743.83..31535999.0 -> "${month.toInt()} месяц(а/ев) назад"
//            in 31536000.0..63071999.0 -> "${year.toInt()} год назад"
//            else -> "несколько лет назад"
//        }
//        binding.txtDate.text = publishedAgoText
//
//    }
}


















