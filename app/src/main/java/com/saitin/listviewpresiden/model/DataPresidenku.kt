package com.saitin.listviewpresiden.model

import com.saitin.listviewpresiden.R

object DataPresidenku {
    private val nama_presidenku = arrayOf(
        "Ir. Soekarno",
        "Soeharto",
        "BJ. Habibie",
        "Abdurrahman Wahid",
        "Megawati",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo"
    )

    private val detail = arrayOf(
        "Ir. Soekarno adalah presiden pertama Republik Indonesia",
        "Soeharto adalah presiden kedua RI ",
        "BJ. Habibie adalah presiden ketiga RI ",
        "Abdurrahman Wahid  adalah presiden keempat RI",
        "Megawati adalah presiden kelima RI ",
        "Susilo Bambang Yudhoyono adalah presiden RI keenam",
        "Joko Widodo atau biasa dikenal Jokowi adalah presiden RI ketujuh sampai sekarang masih menjabat"
    )

    private val presidenkuPoster = intArrayOf(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val listPresidenku: ArrayList<Presidenku>
    get() {

        val list = arrayListOf<Presidenku>()
        for (position in nama_presidenku.indices){
            val presidenku = Presidenku()
            presidenku.name = nama_presidenku[position]
            presidenku.detail= detail[position]
            presidenku.poster = presidenkuPoster[position]
            list.add(presidenku)
        }
        return list
    }
}
