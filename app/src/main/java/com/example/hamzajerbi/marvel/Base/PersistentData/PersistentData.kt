package com.example.hamzajerbi.marvel.Base.PersistentData

import android.app.Application


enum class Keys {
    nothing;

    enum class userData(var value: String) {
        APIKEY("b64b2574549f20514cddfe770e958632"),
        HASH("fa43d86a5e14717de0ad23e9d52d690b"),
        TS("1529959176")
    }

    enum class baseURL(val value:String) {
        PRO("https://gateway.marvel.com/v1/public/"),
    }
}


class PersistentData: Application() {
    init { println("This ($this) is a singleton") }

    private object Holder {
        val INSTANCE = PersistentData()
    }

    companion object {
        val instance: PersistentData by lazy {
            Holder.INSTANCE
        }
    }

    val baseURL: String by lazy {
        Keys.baseURL.PRO.value
    }
    var apiKey = Keys.userData.APIKEY
    var hash = Keys.userData.HASH
    var timeStamp = Keys.userData.TS
}