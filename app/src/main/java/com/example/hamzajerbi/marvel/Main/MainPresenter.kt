package com.example.hamzajerbi.marvel.Main

import android.widget.Toast
import com.example.hamzajerbi.marvel.Base.BaseActivity
import com.example.hamzajerbi.marvel.Base.Model.Data
import com.example.hamzajerbi.marvel.Base.Model.Marvel
import com.example.hamzajerbi.marvel.Base.PersistentData.Keys

class MainPresenter : MainViewToPresenterInterface, MainInteractorToPresenterInterface {

    override var view: MainPresenterToViewInterface? = null
    override var interector: MainPresentorToInteractorInterface? = null
    override var router: MainPresenterToRouterInterface? = null

    override fun marvelSuceed(result: Marvel) {
        val loader = view as BaseActivity

        loader.hideWaiting()
        view?.showMarvel(result)

    }
    override fun marvelError(error: Throwable) {

        val context = view?.contxt ?: return
        Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()

    }
    override fun validateMarvel() {
        val loader = view as BaseActivity

        loader.displayWaiting()
        interector?.marvel()

    }

}
