package com.example.hamzajerbi.marvel.Base.Model


import com.example.hamzajerbi.marvel.Base.PersistentData.PersistentData
import java.io.Serializable


data class Marvel (
    val code: Long,
    val status: String,
    val copyright: String,
    val attributionText: String,
    val attributionHTML: String,
    val etag: String,
    val data: Data
) :Serializable

data class Data (
    val offset: Long,
    val limit: Long,
    val total: Long,
    val count: Long,
    val results: List<Result>
): Serializable

data class Result (
    val id: Long,
    val name: String,
    val description: String,
    val modified: String,
    val thumbnail: Thumbnail,
    val resourceURI: String,
    val comics: Comics,
    val series: Comics,
    val stories: Stories,
    val events: Comics,
    val urls: List<URL>
): Serializable

data class Comics (
    val available: Long,
    val collectionURI: String,
    val items: List<ComicsItem>,
    val returned: Long
): Serializable

data class ComicsItem (
    val resourceURI: String,
    val name: String
): Serializable

data class Stories (
    val available: Long,
    val collectionURI: String,
    val items: List<StoriesItem>,
    val returned: Long
): Serializable

data class StoriesItem (
    val resourceURI: String,
    val name: String,
    val type: ItemType
): Serializable

enum class ItemType {
    Cover,
    Empty,
    InteriorStory,
    Pinup
}

data class Thumbnail (
    val path: String,
    val extension: String = "extension"
): Serializable


data class URL (
    val type: URLType,
    val url: String
): Serializable

enum class URLType {
    Comiclink,
    Detail,
    Wiki
}
