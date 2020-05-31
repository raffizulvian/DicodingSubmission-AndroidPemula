package com.example.dicodingsubmission

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvCampus: RecyclerView
    private var list: ArrayList<Campus> = arrayListOf()
    private var title: String = "Daftar Kampus"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvCampus = findViewById(R.id.rv_campuss)
        rvCampus.setHasFixedSize(true)

        list.addAll(Data.listData)
        showRecyclerCardView()
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    private fun showRecyclerCardView() {
        rvCampus.layoutManager = LinearLayoutManager(this)
        val cardViewAdapter = Adapter(list)
        rvCampus.adapter = cardViewAdapter
    }
}
