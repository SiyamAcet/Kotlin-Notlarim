package com.siyamacet.myfirstapplication

class Superkahraman(var isim: String, var yas: Int, var meslek: String) {
    // primery constructor
    /* var isim = ""
     var yas = 0
     var meslek = ""

     // Constructor
    // secondary constructor
     constructor(isim: String, yas: Int, meslek: String) {
         this.isim = isim
         this.meslek = meslek
         this.yas = yas
     }

     */
}

fun main() {
    var superman = Superkahraman("Can", 26, "Gazeteci")
    superman.meslek = "Gazeteci"
    superman.yas = 26
    superman.isim = "Can"

    //boş veri tipi değişkeni oluşturmayı sağlar ama sadece özel veri tipleri için

    lateinit var benimKahraman : Superkahraman

}