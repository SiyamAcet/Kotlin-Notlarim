package com.siyamacet.myfirstapplication

class sanatci(var isim: String, var yas: Int, var enstruman: String) : dans,sarki{

   override fun sarkiSoyle() {
        println("Şu sanatçı şarkı söyledi: ${this.isim}")
    }


    // sanatcı sınıfı oluşturulmadan önce bu fonksiyoun içerisine yazılan kodlar çalışır.
    init {
        println("init çağrıldı")
    }

    override fun DansEt() {
        TODO("Not yet implemented")
    }

    // eğer baştan değişkene atama yapıp sonradan değiştirilmesini istemezsek var yerine val kullanılır
    // public getter private setter olmuş olur
}

fun main() {
    var sanatci = sanatci("Siyam", 24, "Gitar")

    sanatci.sarkiSoyle()

    // Inheritence

    var muhtesemKahraman = muhtesemKahraman("Siyam", "uçma")

    muhtesemKahraman.kos()
}