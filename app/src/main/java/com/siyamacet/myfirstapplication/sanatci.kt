package com.siyamacet.myfirstapplication

class sanatci(var isim: String, var yas: Int, var enstruman: String) {

    fun sarkiSoyle(){
        println("Şu sanatçı şarkı söyledi: ${this.isim}")
    }

    // sanatcı sınıfı oluşturulmadan önce bu fonksiyoun içerisine yazılan kodlar çalışır.
    init {
        println("init çağrıldı")
    }
}

fun main(){
    var sanatci = sanatci("Siyam",24,"Gitar")

    sanatci.sarkiSoyle()
}