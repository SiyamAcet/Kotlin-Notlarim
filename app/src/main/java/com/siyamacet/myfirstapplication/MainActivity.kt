package com.siyamacet.myfirstapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val calisan1 = Calisanlar("Siyam", 1000, 24, "Yazılım")
        val calisan2 = Calisanlar("Can", 10000, 26, "Finans")
        val calisan3 = Calisanlar("Ahmet", 28000, 30, "Muhasebe")
        val calisan4 = Calisanlar("Ayşe", 40000, 35, "Yazılım")
        val calisan5 = Calisanlar("Murat", 3500, 28, "Satis")
        val calisan6 = Calisanlar("Atil", 1000, 24, "Yazılım")
        val calisan7 = Calisanlar("Ali", 10000, 26, "Finans")
        val calisan8 = Calisanlar("Mehmet", 28000, 30, "Muhasebe")
        val calisan9 = Calisanlar("Fatma", 40000, 45, "Yazılım")
        val calisan10 = Calisanlar("Hayriye", 3500, 42, "Satis")


        var calisanListesi = ArrayList<Calisanlar>()
        calisanListesi.add(calisan1)
        calisanListesi.add(calisan2)
        calisanListesi.add(calisan3)
        calisanListesi.add(calisan4)
        calisanListesi.add(calisan5)
        calisanListesi.add(calisan6)
        calisanListesi.add(calisan7)
        calisanListesi.add(calisan8)
        calisanListesi.add(calisan9)
        calisanListesi.add(calisan10)
        println(calisan10.isim)

        println(calisan7.maasGoster(calisan7))

        val yas30Yazilim = ArrayList<Int>()
        for (i in calisanListesi) {
            if (i.yas > 30 && i.departman == "Yazılım") {
                yas30Yazilim.add(i.maasGoster(i))
            }
        }
        val yas25Isim = ArrayList<String>()

        for (i in calisanListesi) {
            if (i.yas < 25) {
                yas25Isim.add(i.isim)
            }
        }


    }

    /*
         +1) Calisanlar sinifi oluşturulacak
         +2) Çalışanların isim, maaş, departman, yaş bilgilerini tutacağız
         +3) Örnek 10 tane çalışan oluşturup, bir listede bu çalışanlar toplanacak (MainActivity içinde yapabilirsiniz) (yazılım, finans, satış)
         +4) İsim bilgileri sadece okunabilir olacak. calisan.isim = "sdfld" değişiklik yapılamayacak
         +5) Maaş bilgileri okunabilir de olmayacak, yazılabilir de olmayacak. Sadece maasGoster denilen bir fonksiyonla okunabilecek.
            Bu fonksiyon içerisine aldığı objenin maaşını gösterecek.
         +6) MainActivity içerisinde -> yaşı 30'dan büyük olan ve departmanı yazılım olan kişilerin maaşlarını tutan bir liste yapınız. (maasGoster fonksiyonuyla yazdırsanız da olur)
         +7) MainActivity içerisinde -> yaşı 25'den küçük olan kişilerin sadece isimlerini tutan bir liste yapmanız yeterli olur.
         */


}