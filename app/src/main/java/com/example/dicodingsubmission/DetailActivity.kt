package com.example.dicodingsubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_POSITION = "extra_position"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName: TextView = findViewById(R.id.tv_name)
        val tvDetail: TextView = findViewById(R.id.tv_detail)
        val tvLogo: ImageView = findViewById(R.id.tv_logo)

        val position = intent.getIntExtra(EXTRA_POSITION, 10)
        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        val text_name = name
        tvName.text = text_name

        val text_detail = detail
        tvDetail.text = text_detail
    }
}
