package com.example.hamzajerbi.marvel.DetailCharacter

import android.content.Context
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.hamzajerbi.marvel.Base.BaseActivity
import com.example.hamzajerbi.marvel.Base.Model.Marvel
import com.example.hamzajerbi.marvel.R
import com.squareup.picasso.Picasso

class DetailCharacterActivity : BaseActivity(), DetailCharacterPresenterToViewInterface {


    override var presenter: DetailCharacterViewToPresenterInterface? = null

    override val contxt: Context = this
    private var characterName: TextView? = null
    private var imageCharacter: ImageView? = null
    private var characteDesc: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        DetailCharacterRouter.configure(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character_detail_activity)
        characterName = findViewById(R.id.detailName)
        characteDesc = findViewById(R.id.detailDesc)
        imageCharacter = findViewById(R.id.imageView)
         var receivedModel = intent.getSerializableExtra("model")

        var castedModel = receivedModel as Marvel
        var fullPath = castedModel.thumbnail.path + "." + castedModel.thumbnail.extension

            Picasso.get().load(fullPath).into(imageCharacter);
            characterName?.setText(castedModel.name)
            characteDesc?.setText(castedModel.description)

        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar()?.setDisplayShowHomeEnabled(true);

        }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }



    }



