package com.iqbal.latihanchapter4_top2_databanding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.iqbal.latihanchapter4_top2_databanding.databinding.ActivityDetailBinding
import com.iqbal.latihanchapter4_top2_databanding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    lateinit var binding: ActivityDetailBinding
//    lateinit var adapter: BeritaAdapter
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var listBerita = arrayListOf(
            ListBerita("Polisi: Motif Suami Bunuh Istri Di Tangerang Dipicu Chat Perselingkuhan ","14 Sep 2022","detik.com",R.drawable.suami_bunuh_istri,R.string.isi_berita1),
            ListBerita("Polisi Antisipasi Demo BBM Di Patung Kuda dan Flayover Pasar Rebo ","14 Sep 2022","detik.com",R.drawable.demo_bbm,R.string.isi_berita2),
            ListBerita("Link Live Streaming Indonesia Vs Timor Leste di Kualifikasi Piala Asia U20 2023","14 Sep 2022","Kompas.com",R.drawable.timnas_vs_timorleste,R.string.isi_berita3),
            ListBerita("Serangan Siber Bjorka dan Kebocoran Data, Tanggung Jawab Siapa ?","14 Sep 2022","Kompas.com",R.drawable.saiber_bjorka,R.string.isi_berita4),
            ListBerita("Buat Korbannya Merugi Puluhan Juta, Dukun Palsu yang Klaim Bisa Gandakan Uang Ditangkap","14 Sep 2022","Kompas.com",R.drawable.dukun_palsu,R.string.isi_berita5),
            ListBerita("KPU Klaim Bakal Upgrade Teknologi dan Keamanan Aplikasi Terkait Pemilu 2024 ","14 Sep 2022","Kompas.com",R.drawable.upgrade_kpu,R.string.isi_berita6),
            ListBerita("Perkebunan Sawit Ilegal Sebabkan Hutan Mukomuko Bengkulu Kritis Hingga Matikan Habitat gajah ","14 Sep 2022","Kompas.com",R.drawable.kebun_sawit_ilegal,R.string.isi_berita7),
            ListBerita("Penutupan Area Tebet Eco Park Jadi Sasaran Vandalisme, Lurah Klaim Sudah Berupaya Cegah","14 Sep 2022","Kompas.com",R.drawable.ecopark,R.string.isi_Berita8),
            ListBerita("Gunungkidul Promosikan Wisata Minat Khusus,Salah Satunya Goa Jomblang","13 Sep 2022","Kompas.com",R.drawable.gunungkidul,R.string.isi_Berita9),
            ListBerita("Pegiat Sambut Regulasi Konversi Mobil Listrik","14 Sep 2022","Kompas.com",R.drawable.mobil_listrik,R.string.isi_berita10),
        )


        binding.rvBerita.adapter = BeritaAdapter(listBerita)
        binding.rvBerita.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

//        adapter.onclick = {
//            val intent = Intent(this, DetailActivity :: class.java)
//            intent.putExtra("berita",it)
//            startActivity(intent)
        }





//    override fun onItemCliked(detail : ListBerita) {
//        var pindah = Intent(this,DetailActivity::class.java)
//        pindah.putExtra("detailBerita",detail)
//        startActivity(pindah)
//    }

}