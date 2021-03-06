package com.example.dicodingsubmission

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_LOGO = "extra_logo"
        const val EXTRA_ADDRESS = "extra_address"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName: TextView = findViewById(R.id.tv_name)
        val tvDetail: TextView = findViewById(R.id.tv_detail)
        val tvLogo: ImageView = findViewById(R.id.tv_logo)
        val tvAdress: TextView = findViewById(R.id.tv_adress)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val logo = intent.getIntExtra(EXTRA_LOGO, 10)
        val address = intent.getStringExtra(EXTRA_ADDRESS)

        tvName.text = name
        tvDetail.text = detail
        tvLogo.setImageResource(logo)
        tvAdress.text = address
    }
}
