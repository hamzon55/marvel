package com.example.hamzajerbi.marvel.DetailCharacter

import android.content.Context
import android.os.Bundle
import android.widget.TextView
import com.example.hamzajerbi.marvel.Base.BaseActivity
import com.example.hamzajerbi.marvel.Base.Model.Marvel
import com.example.hamzajerbi.marvel.R

class DetailCharacterActivity : BaseActivity(), DetailCharacterPresenterToViewInterface {


    override var presenter: DetailCharacterViewToPresenterInterface? = null

    override val contxt: Context = this
    private var characterName: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        DetailCharacterRouter.configure(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character_detail_activity)
        characterName = findViewById(R.id.detailName)
         var receivedModel = intent.getSerializableExtra("model")

        var castedModel = receivedModel as Marvel

        castedModel.data.results.forEach {
            characterName?.setText(it.name)
        }
        }



    }



