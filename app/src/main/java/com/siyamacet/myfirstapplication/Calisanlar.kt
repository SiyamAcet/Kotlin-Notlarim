package com.siyamacet.myfirstapplication

class Calisanlar(
    isim: String,
    private val maas: Int,
    val yas: Int,
    val departman: String,

    ) {
    var isim: String = isim
        private set


    fun maasGoster(calisanIsım : Calisanlar): Int {
        return calisanIsım.maas
    }


}

