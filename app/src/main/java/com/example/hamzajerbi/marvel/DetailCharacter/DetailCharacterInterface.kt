package com.example.hamzajerbi.marvel.DetailCharacter

import android.content.Context

interface DetailCharacterPresenterToViewInterface {
    val contxt: Context
    var presenter: DetailCharacterViewToPresenterInterface?
}

interface DetailCharacterInteractorToPresenterInterface {

}

interface DetailCharacterPresentorToInteractorInterface {
    var presenter: DetailCharacterInteractorToPresenterInterface?
}

interface DetailCharacterViewToPresenterInterface {
    var view: DetailCharacterPresenterToViewInterface?
    var interector: DetailCharacterPresentorToInteractorInterface?
    var router: DetailCharacterPresenterToRouterInterface?

}

interface DetailCharacterPresenterToRouterInterface {
    companion object {
        fun configure(activity: DetailCharacterActivity) {}
    }
}