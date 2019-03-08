package com.example.hamzajerbi.marvel.Main.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.hamzajerbi.marvel.Base.Model.Data
import com.example.hamzajerbi.marvel.Base.Model.Marvel
import com.example.hamzajerbi.marvel.R
import com.squareup.picasso.Picasso

class MainAdapter(val marvelList: Marvel) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        val v = LayoutInflater.from(p0?.context).inflate(R.layout.main_item_list, p0, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return marvelList.data.results.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var list =  marvelList.data.results[position]
        holder?.txtName?.text = list.name

       var fullPath = list.thumbnail.path + "." + list.thumbnail.extension
        Picasso.get().load(fullPath).into(holder.imageCharacter);

        holder?.itemView.setOnClickListener {

           // listener(marvelList[position])

        }

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtName = itemView.findViewById<TextView>(R.id.name)
        val imageCharacter = itemView.findViewById<ImageView>(R.id.imageMarvel)

    }
}