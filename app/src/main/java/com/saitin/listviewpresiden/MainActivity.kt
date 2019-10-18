package com.saitin.listviewpresiden

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.saitin.listviewpresiden.adapter.ListPresidenkuAdapter
import com.saitin.listviewpresiden.model.DataPresidenku
import com.saitin.listviewpresiden.model.Presidenku
import java.util.Collections.addAll

class MainActivity : AppCompatActivity() {
    private lateinit var rvPresidenku: RecyclerView
    private var list: ArrayList<Presidenku> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPresidenku = findViewById(R.id.rv_presidenku)
        list.addAll(DataPresidenku.listPresidenku)
        showPresidenkuList()
    }

    private fun showPresidenkuList() {
        rvPresidenku.layoutManager = LinearLayoutManager(this)
        rvPresidenku.adapter = ListPresidenkuAdapter(this, list) {
            Toast.makeText(this,it.detail, Toast.LENGTH_SHORT).show();

        }
    }
}
