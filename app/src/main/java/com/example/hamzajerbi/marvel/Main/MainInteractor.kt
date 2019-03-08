package com.example.hamzajerbi.marvel.Main

import com.example.hamzajerbi.marvel.Base.NetworkLayer.apiService
import com.example.hamzajerbi.marvel.Base.NetworkLayer.disposable
import com.example.hamzajerbi.marvel.Base.PersistentData.Keys
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainInteractor : MainPresentorToInteractorInterface {

    override var presenter: MainInteractorToPresenterInterface? = null
    override fun marvel() {

        disposable = apiService.marvelList(Keys.userData.TS.value,Keys.userData.HASH.value,Keys.userData.APIKEY.value)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { result ->
                    presenter?.marvelSuceed(result)

                },
                { error ->
                    presenter?.marvelError(error)
                })
    }
    }
