package com.example.dicodingsubmission

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
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

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                Toast.makeText(this, "Anda sudah berada di halaman ini", Toast.LENGTH_SHORT).show()
            }

            R.id.action_about -> {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
