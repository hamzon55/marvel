package com.example.hamzajerbi.marvel.Main

class MainRouter: MainPresenterToRouterInterface {

    companion object {
        fun configure(activity: MainActivity) {
            val view = activity
            val presenter = MainPresenter()
            val interactor = MainInteractor()
            val router = MainRouter()

            view.presenter = presenter
            presenter.view = view
            presenter.router = router
            presenter.interector = interactor
            interactor.presenter = presenter
        }
    }
}