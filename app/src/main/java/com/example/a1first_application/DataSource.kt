package com.example.a1first_application

class DataSource{
    fun createDataSet() {
        val list = ArrayList<Post>()
        list.add(
            Post(
                1,
                "2020-12-09 19:20:03",
                "Petrov",
                "Post1",
                //"https://yandex.ru/images/search?text=%D1%84%D0%BE%D1%82%D0%BE&from=tabbar&pos=16&img_url=https%3A%2F%2Fpbs.twimg.com%2Fmedia%2FEGsD5ZUXUAANIGI.jpg&rpt=simage"
            )
        )
        Post(
            2,
            "2020-12-01 10:20:03",
            "Ivanov",
            "Post2",
            //"https://yandex.ru/images/search?text=%D1%84%D0%BE%D1%82%D0%BE&from=tabbar&pos=16&img_url=https%3A%2F%2Fpbs.twimg.com%2Fmedia%2FEGsD5ZUXUAANIGI.jpg&rpt=simage"
        )
    }

}