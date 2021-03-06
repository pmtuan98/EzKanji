package com.illidant.easykanzicapstone.domain.model

import com.google.gson.annotations.SerializedName

data class Kanji(
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("kanji")
    val kanji: String,
    @SerializedName("sino_vietnamese")
    val sino_vietnamese: String,
    @SerializedName("kanji_meaning")
    val kanji_meaning: String,
    @SerializedName("onyomi")
    val onyomi: String,
    @SerializedName("on_furigana")
    val on_furigana: String,
    @SerializedName("kunyomi")
    val kunyomi: String,
    @SerializedName("kun_furigana")
    val kun_furigana: String
)
