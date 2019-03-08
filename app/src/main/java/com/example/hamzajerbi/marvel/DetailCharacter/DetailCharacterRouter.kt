package com.example.hamzajerbi.marvel.DetailCharacter


class DetailCharacterRouter: DetailCharacterPresenterToRouterInterface {

    companion object {
        fun configure(activity: DetailCharacterActivity) {
            val view = activity
            val presenter = DetailCharacterPresenter()
            val interactor = DetailCharacterInteractor()
            val router = DetailCharacterRouter()

            view.presenter = presenter
            presenter.view = view
            presenter.router = router
            presenter.interector = interactor
            interactor.presenter = presenter
        }
    }
}