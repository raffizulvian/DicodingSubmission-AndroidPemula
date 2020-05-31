package com.example.myrecyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.dicodingsubmission.Campuss
import com.example.dicodingsubmission.DetailActivity
import com.example.dicodingsubmission.R

class Adapter(private val listCampuss: ArrayList<Campuss>) : RecyclerView.Adapter<Adapter.CardViewViewHolder>() {

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
        var btnMore: Button = itemView.findViewById(R.id.btn_set_more)
        var context: Context

        init {
            context = itemView.context
            btnMore.setOnClickListener(object : View.OnClickListener {
                override fun onClick(view: View) {
                    val intent = Intent(context, DetailActivity::class.java)
                    var position = 10
                    when (adapterPosition) {
                        0 -> position = 0
                        1 -> position = 1
                        2 -> position = 2
                        3 -> position = 3
                        4 -> position = 4
                        5 -> position = 5
                        6 -> position = 6
                        7 -> position = 7
                        8 -> position = 8
                        9 -> position = 9
                    }
                    intent.putExtra(DetailActivity.EXTRA_NAME, listCampuss[position].name)
                    intent.putExtra(DetailActivity.EXTRA_DETAIL, listCampuss[position].detail)
                    intent.putExtra(DetailActivity.EXTRA_LOGO, listCampuss[position].logo)
                    context.startActivity(intent)
                }
            })
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCampuss.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val campuss = listCampuss[position]

        Glide.with(holder.itemView.context)
            .load(campuss.logo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.tvName.text = campuss.name
        holder.tvDetail.text = campuss.detail

        holder.btnFavorite.setOnClickListener { Toast.makeText(holder.itemView.context, "Favorite " + listCampuss[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()}
        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Kamu memilih " + listCampuss[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()}
    }
}