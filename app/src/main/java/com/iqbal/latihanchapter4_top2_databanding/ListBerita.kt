package com.iqbal.latihanchapter4_top2_databanding

import java.io.Serializable

data class ListBerita(
    val judulBerita : String,
    val tanggalBerita : String,
    val jurnalis : String,
    val img : Int,
    val isiBerita : Int,
): Serializable
