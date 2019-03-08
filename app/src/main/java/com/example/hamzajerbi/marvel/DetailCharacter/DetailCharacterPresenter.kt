package com.example.hamzajerbi.marvel.DetailCharacter




class DetailCharacterPresenter : DetailCharacterViewToPresenterInterface, DetailCharacterInteractorToPresenterInterface {

    override var view: DetailCharacterPresenterToViewInterface? = null
    override var interector: DetailCharacterPresentorToInteractorInterface? = null
    override var router: DetailCharacterPresenterToRouterInterface? = null

}
