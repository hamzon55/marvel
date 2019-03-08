package com.example.hamzajerbi.marvel.Main

import android.content.Context
import com.example.hamzajerbi.marvel.Base.Model.CharacterResponse
import com.example.hamzajerbi.marvel.Base.Model.Marvel

interface MainPresenterToViewInterface {
    val contxt: Context
    var presenter: MainViewToPresenterInterface?
    fun showMarvel(argument: CharacterResponse)
}

interface MainInteractorToPresenterInterface {
    fun marvelSuceed(result: CharacterResponse)
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
        fun configure(activity: MainActivity) {}

    }
     fun navigate(contxt: Context, model: Marvel)

    }