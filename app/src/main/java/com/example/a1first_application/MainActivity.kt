package com.example.a1first_application

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.time.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var post = Post(12, "2020-12-09 19:20:03", "Petrov", "This is simple content", false)

        txtPost.text = post.content
        //txtDate.text = post.date
        txtAuthor.text = post.author
        val postTime: String = post.date
        println("Время $postTime")

        time(post)

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


    @RequiresApi(Build.VERSION_CODES.O)
    fun time(post: Post) {
        val zid: ZoneId = ZoneId.of("Europe/Moscow")
        var dateTime = LocalDateTime.now(zid)
        var todayDay: LocalDate = LocalDate.now(zid)
        var todayTime: LocalTime = LocalTime.now(zid)
        var datePost: String = post.date
//        println("Время поста $datePost")
        val postTime: String = post.date

//        println("Vremya $dateTime")
//        println("todayDay $todayDay")
//        println("todayTime $todayTime")
//        println("zid $zid")

        var postList: List<String> = postTime.split(" ")
        println("Размер листа $postList")

        var postSecondsList: List<String> = postList[1].split(":")

        var postHour: Int = postSecondsList[0].toInt()*3600
//        println("Час поста $postHour")
        var postMinutes: Int = postSecondsList[1].toInt()*60
//        println("Минуты поста $postMinutes")
        var postSecond: Int = postSecondsList[2].toInt()
//        println("Секунды поста $postSecond")


        var currentHour: Int = dateTime.hour*3600
//        println("Текущее время: часы $currentHour")
        var currentMinutes: Int = dateTime.minute*60
//        println("Текущщее время: часы $currentMinutes")
        var currentSeconds: Int = dateTime.second
//        println("Текущщее время: секунды $currentSeconds")


        var postDate: List<String> = postList[0].split("-")
        var postYear: Int = postDate[0].toInt()*31536000
//        println("Год поста $postYear")
        var postMonth: Double = postDate[1].toInt()*2629743.83
//        println("Месяц поста $postMonth")
        var postDay: Int = postDate[2].toInt()*86400
//        println("День поста $postDay")
        var postSum = postHour + postMinutes + postSecond + postMonth + postDay + postYear
//        println("Текущщее время: общее в секундах $postSum")

        var currentYear = dateTime.year*31536000
        var currentMonth: Double = dateTime.monthValue*2629743.83
        var currentDay: Int = dateTime.dayOfMonth*86400
//        println("Текущий год $currentYear месяц $currentMonth день $currentDay")
        var currentSum = currentHour + currentMinutes + currentSeconds + currentMonth + currentDay + currentYear
//        println("Текущщее время: общее в секундах $currentSum")

        var resultSeconds = currentSum - postSum
//        println("Разница времени: время остсток $resultSeconds")

        val minutes: Double = resultSeconds/60
        val hours: Double = resultSeconds/3600
        val day: Double = resultSeconds/ 86400
        val month: Double = resultSeconds/2629743.83
        val year: Double = resultSeconds/31536000.0

        val publishedAgoText: String = when (resultSeconds) {

            in 0.0..59.0 -> "${resultSeconds.toInt()} секунд(а/ы) назад"
            in 60.0..3599.0 -> "${minutes.toInt()} минут(ы/а) назад"
            in 3600.0..86399.0 -> "${hours.toInt()} час(а/ов) назад"
            in 86400.0..2629743.82 -> "${day.toInt()} день(дня/ей) назад"
            in 2629743.83..31535999.0 -> "${month.toInt()} месяц(а/ев) назад"
            in 31536000.0..63071999.0 -> "${year.toInt()} год назад"
            else -> "несколько лет назад"
        }
        txtDate.text =("$publishedAgoText")

    }
}


















