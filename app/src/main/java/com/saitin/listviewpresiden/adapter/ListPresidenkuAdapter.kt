package com.saitin.listviewpresiden.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.saitin.listviewpresiden.R
import com.saitin.listviewpresiden.model.DataPresidenku.listPresidenku
import com.saitin.listviewpresiden.model.Presidenku

class ListPresidenkuAdapter (
    private val context: Context, private val presidenku: ArrayList<Presidenku>, private val listener: (Presidenku) -> Unit)
    : RecyclerView.Adapter<ListPresidenkuAdapter.ViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListPresidenkuAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.daftar_presidenku, parent, false))
    }

    override fun getItemCount(): Int {
        return listPresidenku.size
    }

    override fun onBindViewHolder(holder: ListPresidenkuAdapter.ViewHolder, position: Int) {
        holder.bindPresidenku(presidenku[position], listener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var tvName: TextView = view.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = view.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = view.findViewById(R.id.img_item_poster)

        fun bindPresidenku(presidenku: Presidenku, listener: (Presidenku) -> Unit){
            tvName.text = presidenku.name
            Glide.with(itemView.context)
                .load(presidenku.poster)
                .into(imgPoster)

            itemView.setOnClickListener{
                listener(presidenku)
            }

        }
    }
}
