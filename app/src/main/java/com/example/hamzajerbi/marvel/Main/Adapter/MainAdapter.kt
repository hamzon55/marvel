package com.example.hamzajerbi.marvel.Main.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.hamzajerbi.marvel.Base.Model.Marvel
import com.example.hamzajerbi.marvel.R
import com.squareup.picasso.Picasso

class MainAdapter(val marvelList: Marvel) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        val v = LayoutInflater.from(p0?.context).inflate(R.layout.main_item_list, p0, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return marvelList.data.results.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0?.txtName?.text = marvelList.data.results[p1].name

       var fullPath = marvelList.data.results[p1].thumbnail.path + "." + marvelList.data.results[p1].thumbnail.extension.toString()
        Picasso.get().load(fullPath).into(p0.imageCharacter);

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtName = itemView.findViewById<TextView>(R.id.name)
        val imageCharacter = itemView.findViewById<ImageView>(R.id.imageMarvel)




    }
}