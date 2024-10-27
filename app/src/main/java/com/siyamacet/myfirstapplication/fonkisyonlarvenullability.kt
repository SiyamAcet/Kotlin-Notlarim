package com.siyamacet.myfirstapplication

fun main() {

    birinciFonksiyon()

}

fun birinciFonksiyon() {
    println("birinci fonkisyon çalıştırıldı")
}

// girdi almak

var sonuc: Int? = null

fun cikarma(a: Int, b: Int) {

    sonuc = a - b

}

// return

fun toplama(a: Int, b: Int): Int {
    return a + b
}