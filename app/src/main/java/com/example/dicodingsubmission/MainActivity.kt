package com.example.dicodingsubmission

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerview.Adapter

class MainActivity : AppCompatActivity() {
    private lateinit var rvCampuss: RecyclerView
    private var list: ArrayList<Campuss> = arrayListOf()
    private var title: String = "Daftar Kampus"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvCampuss = findViewById(R.id.rv_campuss)
        rvCampuss.setHasFixedSize(true)

        list.addAll(Data.listData)
        showRecyclerCardView()
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    private fun showRecyclerCardView() {
        rvCampuss.layoutManager = LinearLayoutManager(this)
        val cardViewAdapter = Adapter(list)
        rvCampuss.adapter = cardViewAdapter
    }
}
