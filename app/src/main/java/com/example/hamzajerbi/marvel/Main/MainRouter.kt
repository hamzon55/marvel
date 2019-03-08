package com.example.hamzajerbi.marvel.Main

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import com.example.hamzajerbi.marvel.Base.Model.Data
import com.example.hamzajerbi.marvel.Base.Model.Marvel
import com.example.hamzajerbi.marvel.DetailCharacter.DetailCharacterActivity

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

    override fun navigate(contxt: Context, model: Marvel) {
        val intent = Intent(contxt, DetailCharacterActivity::class.java)
        intent.putExtra("model", model);
        startActivity(contxt, intent, null)
    }
}