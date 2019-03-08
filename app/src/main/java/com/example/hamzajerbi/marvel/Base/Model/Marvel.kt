package com.example.hamzajerbi.marvel.Base.Model

import java.io.Serializable



data class CharacterData (
    val results: List<Marvel>
)

data class CharacterResponse (
    val data: CharacterData
)

data class Marvel (
    val id: Long,
    val name: String,
    val description: String,
    val thumbnail: Thumbnail
) :Serializable

data class Thumbnail (
    val path: String,
    val extension: String = "extension"
): Serializable


