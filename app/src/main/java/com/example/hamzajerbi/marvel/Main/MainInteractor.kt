package com.example.hamzajerbi.marvel.Main

import android.content.Context
import com.example.hamzajerbi.marvel.Main.Adapter.MainAdapterModel

class MainInteractor : MainPresentorToInteractorInterface {

    override fun fetchMain(context: Context) {

        val service = ArrayList<MainAdapterModel>()
        service.add(MainAdapterModel("Text"))
        service.add(MainAdapterModel("Text"))
        service.add(MainAdapterModel("Text"))
        service.add(MainAdapterModel("Text"))
        service.add(MainAdapterModel("Text"))
        service.add(MainAdapterModel("Text"))

        val entity  = MainEntities(list = service)
        presenter?.mainFetched(entity)

    }

    override var presenter: MainInteractorToPresenterInterface? = null
}