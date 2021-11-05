package com.example.persiapanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.sinovac,"Sinovac","Cina","Vaksin Sinovac adalah vaksin Covid-19 pertama di Indonesia yang mendapat izin penggunaan darurat dari BPOM. EUA diterbitkan oleh BPOM pada hari Senin, 11 Januari 2021.  Izin penggunaan darurat terhadap Sinovac diberikan setelah BPOM mengkaji hasil uji klinis tahap III vaksin yang dilakukan di Bandung. BPOM juga mengkaji hasil uji klinis vaksin Sinovac yang dilakukan di Turki dan Brasil.  Dari hasil analisis terhadap uji klinis fase III di Bandung menunjukkan efikasi vaksin Covid-19 Sinovac sebesar 65,3 persen. Vaksin yang dikembangkan oleh Sinovac Research and Development Co.,Ltd ini diberikan dua dosis. \n" +
                "\n" +
                "Artikel ini telah tayang di Kontan.co.id dengan judul \"Ada 9 Jenis vaksin Covid-19 yang digunakan di Indonesia, apa saja efek sampingnya?\", Klik untuk baca: https://newssetup.kontan.co.id/news/ada-9-jenis-vaksin-covid-19-yang-digunakan-di-indonesia-apa-saja-efek-sampingnya?page=all.\n" +
                "\n" +
                "Editor: Barratut Taqiyyah Rafie\n"))

        data?.add(DataModel(R.drawable.biofarma,"Bio Farma","Indonesia", "Satu bulan kemudian, tepatnya pada 16 Februari 2021, BPOM kembali mengeluarkan EUA untuk vaksin Covid-19 yang diproduksi oleh PT Bio Farma (Persero). Vaksin dengan nama produk vaksin Covid-19 itu memiliki nomor izin penggunaan EUA 2102907543A1.  Vaksin yang diproduksi oleh PT Bio Farma ini berasal dari bahan baku vaksin yang secara bertahap telah dikirimkan oleh Sinovac. Vaksin ini memiliki bentuk sediaan vial 5 ml. Setiap vial berisi 10 dosis vaksin yang berasal dari virus yang di-inaktivasi.  Untuk menjaga mutu dan kualitasnya, vaksin Covid-19 ini harus disimpan dalam tempat penyimpanan dengan suhu stabil antara 2-8 derajat celsius. Pada setiap vial telah dilengkapi dengan dua dimensi barcode khusus yang menunjukan detail informasi dari setiap vial. Hal itu berfungsi untuk melacak vaksin dan mencegah pemalsuan vaksin. \n" +
                "\n" +
                "Artikel ini telah tayang di Kontan.co.id dengan judul \"Ada 9 Jenis vaksin Covid-19 yang digunakan di Indonesia, apa saja efek sampingnya?\", Klik untuk baca: https://newssetup.kontan.co.id/news/ada-9-jenis-vaksin-covid-19-yang-digunakan-di-indonesia-apa-saja-efek-sampingnya?page=all.\n" +
                "\n" +
                "Editor: Barratut Taqiyyah Rafie\n"))

        data?.add(DataModel(R.drawable.astrazeneca,"AstraZeneca","Inggris", "Hanya berselang beberapa hari, BPOM kemudian kembali mengeluarkan EUA untuk vaksin Covid-19 buatan perusahaan farmasi Inggris, AstraZeneca, pada 22 Februari 2021 dengan nomor EUA 2158100143A1.  BPOM memberikan izin penggunaan darurat untuk AstraZeneca usai melakukan evaluasi bersama Komite Nasional Penilai Obat dan pihak lainnya. Vaksin Covid-19 yang dikembangkan oleh AstraZeneca dan University of Oxford ini memiliki efikasi sebesar 62,1 persen. \n" +
                "\n" +
                "Artikel ini telah tayang di Kontan.co.id dengan judul \"Ada 9 Jenis vaksin Covid-19 yang digunakan di Indonesia, apa saja efek sampingnya?\", Klik untuk baca: https://newssetup.kontan.co.id/news/ada-9-jenis-vaksin-covid-19-yang-digunakan-di-indonesia-apa-saja-efek-sampingnya?page=all.\n" +
                "\n" +
                "Editor: Barratut Taqiyyah Rafie\n"))

        data?.add(DataModel(R.drawable.sinopharm,"Sinopharm","Cina", "Pada 29 April 2021, BPOM mengeluarkan EUA untuk vaksin Covid-19 Sinopharm dengan nomor EUA 2159000143A2. Vaksin Sinopharm didistribusikan oleh PT.Kimia Farma dengan platform inactivated virus atau virus yang dimatikan.  Berdasarkan hasil evaluasi, pemberian vaksin sinopharm dua dosis dengan selang pemberian 21 hari menujukkan profil keamanan yang dapat ditoleransi dengan baik. Hasil uji klinik fase III yang dilakukan oleh peneliti di Uni Emirates Arab (UAE) dengan subjek sekitar 42 ribu menunjukan efikasi vaksin Sinopharm sebesar 78 persen.   Efek samping vaksin Sinopharm yang banyak dijumpai adalah efek samping lokal yang ringan. Di antaranya seperti berikut: nyeri atau kemerahan di tempat suntikan, efek samping sistemik berupa sakit kepala, nyeri otot, kelelahan, diare, dan batuk.\n" +
                "\n" +
                "Artikel ini telah tayang di Kontan.co.id dengan judul \"Ada 9 Jenis vaksin Covid-19 yang digunakan di Indonesia, apa saja efek sampingnya?\", Klik untuk baca: https://newssetup.kontan.co.id/news/ada-9-jenis-vaksin-covid-19-yang-digunakan-di-indonesia-apa-saja-efek-sampingnya?page=all.\n" +
                "\n" +
                "Editor: Barratut Taqiyyah Rafie\n"))

        data?.add(DataModel(R.drawable.moderna,"Moderna","Amerika", "Vaksin Covid-19 Moderna mendapat EUA dari BPOM pada Jumat, 2 Juli 2021. Berdasarkan data uji klinis fase ketiga menunjukkan efikasi vaksin Moderna sebesar 94,1 persen pada kelompok usia 18-65 tahun.  Efikasi vaksin Moderna kemudian menurun menjadi 86,4 persen untuk usia di atas 65 tahun. Hasil uji klinis juga menyatakan vaksin Moderna aman untuk kelompok populasi masyarakat dengan komorbid atau penyakit penyerta. \n" +
                "\n" +
                "Artikel ini telah tayang di Kontan.co.id dengan judul \"Ada 9 Jenis vaksin Covid-19 yang digunakan di Indonesia, apa saja efek sampingnya?\", Klik untuk baca: https://newssetup.kontan.co.id/news/ada-9-jenis-vaksin-covid-19-yang-digunakan-di-indonesia-apa-saja-efek-sampingnya?page=all.\n" +
                "\n" +
                "Editor: Barratut Taqiyyah Rafie\n "
                ))

        data?.add(DataModel(R.drawable.pfizer,"Pfizer","Jerman", "Selang dua pekan kemudian, BPOM kembali menerbitkan EUA untuk vaksin Covid-19 Pfizer pada 15 Juli 2021.   Data uji klinik fase III menunjukkan efikasi vaksin yang dikembangkan oleh Pfizer Inc. dan BioNTech ini sebesar 100 persen pada usia remaja 12-15 tahun, kemudian menurun menjadi 95,5 persen pada usia 16 tahun ke atas.  Beberapa kajian menunjukkan keamanan vaksin Pfizer ini dapat ditoleransi pada semua kelompok usia. Vaksin Pfizer diberikan secara intramuskular dengan dua kali penyuntikan.\n" +
                "\n" +
                "Artikel ini telah tayang di Kontan.co.id dengan judul \"Ada 9 Jenis vaksin Covid-19 yang digunakan di Indonesia, apa saja efek sampingnya?\", Klik untuk baca: https://newssetup.kontan.co.id/news/ada-9-jenis-vaksin-covid-19-yang-digunakan-di-indonesia-apa-saja-efek-sampingnya?page=all.\n" +
                "\n" +
                "Editor: Barratut Taqiyyah Rafie\n"))

        data?.add(DataModel(R.drawable.sputnik,"Sputnik","Rusia", "BPOM menerbitkan EUA untuk vaksin Covid-19 Sputnik V. EUA diterbitkan oleh BPOM pada Selasa, 24 Agustus 2021. Vaksin Sputnik V digunakan untuk kelompok usia 18 tahun ke atas.  Vaksin ini diberikan secara injeksi intramuscular dengan dosis 0,5 mL untuk 2 kali penyuntikan dalam rentang waktu 3 minggu.  Vaksin yang dikembangkan oleh The Gamaleya National Center of Epidemiology and Microbiology di Russia ini menggunakan platform Non-Replicating Viral Vector (Ad26-S dan Ad5-S). \n" +
                "\n" +
                "Artikel ini telah tayang di Kontan.co.id dengan judul \"Ada 9 Jenis vaksin Covid-19 yang digunakan di Indonesia, apa saja efek sampingnya?\", Klik untuk baca: https://newssetup.kontan.co.id/news/ada-9-jenis-vaksin-covid-19-yang-digunakan-di-indonesia-apa-saja-efek-sampingnya?page=all.\n" +
                "\n" +
                "Editor: Barratut Taqiyyah Rafie\n"))


        data?.add(DataModel(R.drawable.janssen,"Janssen","Amerika Serikat", "Terbaru, BPOM mengumumkan EUA terhadap vaksin Covid-19 yang diproduksi Johnson & Johnson, yaitu Janssen Covid-19 Vaccine. Izin penggunaan darurat untuk vaksin Janssen diumumkan BPOM pada 7 September 2021.  Vaksin Janssen digunakan untuk kelompok usia 18 tahun ke atas dengan pemberian sekali suntikan atau dosis tunggal sebanyak 0,5 mL secara intramuscular. \n" +
                "\n" +
                "Artikel ini telah tayang di Kontan.co.id dengan judul \"Ada 9 Jenis vaksin Covid-19 yang digunakan di Indonesia, apa saja efek sampingnya?\", Klik untuk baca: https://newssetup.kontan.co.id/news/ada-9-jenis-vaksin-covid-19-yang-digunakan-di-indonesia-apa-saja-efek-sampingnya?page=all.\n" +
                "\n" +
                "Editor: Barratut Taqiyyah Rafie\n"))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("asal", item?.asal)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}