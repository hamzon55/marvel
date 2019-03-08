package com.example.hamzajerbi.marvel.Main

import android.content.Context
import com.example.hamzajerbi.marvel.Base.Model.Data
import com.example.hamzajerbi.marvel.Base.Model.Marvel

interface MainPresenterToViewInterface {
    val contxt: Context
    var presenter: MainViewToPresenterInterface?
    fun showMarvel(argument: Marvel)
}

interface MainInteractorToPresenterInterface {
    fun marvelSuceed(result: Marvel)
    fun marvelError(error: Throwable)
}

interface MainPresentorToInteractorInterface {
    var presenter: MainInteractorToPresenterInterface?
    fun marvel()
}

interface MainViewToPresenterInterface {
    var view: MainPresenterToViewInterface?
    var interector: MainPresentorToInteractorInterface?
    var router: MainPresenterToRouterInterface?
    fun validateMarvel()
    fun listItemClicked(model: Marvel)

}

interface MainPresenterToRouterInterface {
    companion object {
        fun configure(activity: Marvel) {}

    }
     fun navigate(contxt: Context, model: Marvel)

    }