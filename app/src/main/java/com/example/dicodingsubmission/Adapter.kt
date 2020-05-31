package com.example.dicodingsubmission

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class Adapter(private val listCampuses: ArrayList<Campus>) : RecyclerView.Adapter<Adapter.CardViewViewHolder>() {

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var item: RelativeLayout = itemView.findViewById(R.id.item_list)
        var context: Context = itemView.context

        init {
            item.setOnClickListener {
                val intent = Intent(context, DetailActivity::class.java)
                val position = adapterPosition

                intent.putExtra(DetailActivity.EXTRA_NAME, listCampuses[position].name)
                intent.putExtra(DetailActivity.EXTRA_DETAIL, listCampuses[position].detail)
                intent.putExtra(DetailActivity.EXTRA_LOGO, listCampuses[position].logo)

                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCampuses.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val campuss = listCampuses[position]

        Glide.with(holder.itemView.context)
            .load(campuss.logo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.tvName.text = campuss.name
        holder.tvDetail.text = campuss.detail

        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, listCampuses[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()}
    }
}