package com.example.hamzajerbi.marvel.Main

import android.content.Context
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.hamzajerbi.marvel.Base.BaseActivity
import com.example.hamzajerbi.marvel.Base.Model.CharacterResponse

import com.example.hamzajerbi.marvel.Main.Adapter.MainAdapter
import com.example.hamzajerbi.marvel.R

class MainActivity : BaseActivity(),MainPresenterToViewInterface {


    override var presenter: MainViewToPresenterInterface? = null

    override val contxt: Context = this
    private var recycleView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        MainRouter.configure(this)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        recycleView = findViewById(R.id.recyclerView)
        recycleView?.layoutManager = LinearLayoutManager(this)
        presenter?.validateMarvel()


    }
    override fun showMarvel(argument: CharacterResponse) {
        recycleView?.adapter = MainAdapter({ Int -> presenter?.listItemClicked(Int) },argument)

    }

}
