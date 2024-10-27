package com.siyamacet.myfirstapplication

fun main() {

    birinciFonksiyon()

    //nullable
    val kullaniciGirdisi = "20"

    val kullaniciGirdisiInteger = kullaniciGirdisi.toIntOrNull()

    if (kullaniciGirdisiInteger != null) {
        println(kullaniciGirdisiInteger * 2)
    }

    var benimDouble: Double? = null

    val kullaniciGirdisiDouble = kullaniciGirdisi.toDoubleOrNull()

    //!! kesinlikle double gelecek demek
    kullaniciGirdisiDouble!!.div(2)

    // ?
    kullaniciGirdisiDouble?.div(2)

    // elvis operatörü

    println(kullaniciGirdisiDouble?.div(2) ?: 20)

    kullaniciGirdisiDouble.let {
        println(it.div(2))
    }


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