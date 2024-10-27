package com.siyamacet.myfirstapplication



fun main() {

    // tam sayilar
    var x = 10 //sonradan değeri değiştirilebilir.

    x = 20 //değeri değiştirirken bir daha var yazmaya gerek yok

    val z = 30 //sonradan değeri değişmez

    // explicit tanımlama
    var ornek: Long = 10
    var ornekshort: Short = 10
    var ornekbyte: Byte = 3

    // snake_case
    //camelCase
    // kesirli sayilar

    var pi = 3.14
    // stringler
    var metin = "benim stringim"

    //conversion

    var yas = "15"
    var yasInt = yas.toInt()

    println(yasInt * 20)

    //boolean
    var benimBool = true
    println(benimBool)

    // veri yapıları

    //Diziler - Array

    var benimDizim = arrayOf("siyam", "acet", "fatih", "can")

    println(benimDizim[0] + benimDizim[1])

    // array'e sonradan eleman eklemesine izin vermez. Elemanlar en baştan eklenir
    // ve dizi kapasitesi baştan belirlenir.

    // array'lere verilere tip olarak karşık bir şekilde eklenebilir.

    var karisikDizi = arrayOf(1, 1.2, "siyam", true, false)

    // ArrayList

    var isimlistesi = arrayListOf("siyam", "acet", "can")

    // arrayList sonradan eleman eklemeye olanak tanır.

    var numaraListesi = arrayListOf<Int>()

    var digerOrnekListe = ArrayList<Int>()

    var karisikBosListe = arrayListOf<Any>()

    // Set
    // Set içerisinde uniq - tekil eleman barındıran index mantığına sahip olmayan yapılardır.

    var ornekSet = setOf(10, 10, 20, 20, 30)

    // Map
    // anahtar - değer ilişkisiyle çalışır

    val yemeklerMapi = hashMapOf<String, Int>()
    yemeklerMapi.put("elma", 100)
    yemeklerMapi.put("armut", 200)
    println(yemeklerMapi["elma"])

    val ornekHashMap = HashMap<String, String>()

    ornekHashMap.put("elma", "armut")

    // IF kontrolleri

    var skor = 10

    if (skor >= 20) {
        println("skorunuz yüksek")
    } else if (skor < 10) {
        println("skorunuz düşük")
    } else {
        println("skorunuz harika")
    }

    var notString = ""

    when (skor) {
        1 -> notString = "düşük"
        2 -> notString = "orta"
        3 -> notString = "yüksek"
    }

    // while

    var j = 0

    while (j < 10) {
        println(j)
        j = j + 1
    }

    // For

    val baskaDizi = arrayListOf(5, 10, 20, 32)

    for (numara in baskaDizi) {
        println(numara) // baskaDizi'nin içerisindeki elemanları yazar
    }

    for (num in 0..10) {

        println(num * 10)  //num 0 dan 10 kadar olan tam sayıları alır

    }

    baskaDizi.forEach {
            kelime ->
        println(kelime)
    }



}