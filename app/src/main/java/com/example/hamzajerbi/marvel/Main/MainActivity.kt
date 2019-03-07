package com.example.hamzajerbi.marvel.Main

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.hamzajerbi.marvel.Main.Adapter.MainAdapter
import com.example.hamzajerbi.marvel.Main.Adapter.MainAdapterModel
import com.example.hamzajerbi.marvel.R

class MainActivity : AppCompatActivity(),MainPresenterToViewInterface {
    override var presenter: MainViewToPresenterInterface? = null

    override val contxt: Context = this
    private var recycleView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        MainRouter.configure(this)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        recycleView = findViewById(R.id.recyclerView)
        recycleView?.layoutManager = LinearLayoutManager(this)
        presenter?.requestMain()

    }
    override fun showMain(argument: ArrayList<MainAdapterModel>) {
        recycleView?.adapter = MainAdapter(argument)
    }
}
