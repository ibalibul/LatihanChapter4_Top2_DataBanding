package com.iqbal.latihanchapter4_top2_databanding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.iqbal.latihanchapter4_top2_databanding.databinding.ActivityDetailBinding
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    lateinit var binding : ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)

        getdataBundle()

    }

    fun getdataBundle() {
        var bund = intent.extras
        binding.tvJDetailBerita.text = bund!!.getString("judulberita")
        binding.tvJurnalisDBerita.text = bund!!.getString("jurnalisberita")
        binding.ivImgDetail.setImageResource(bund!!.getInt("imageberita"))
        binding.tvTanggalDetail.text = bund!!.getString("tanggalberita")
        binding.tvIsiBerita.text = bund!!.getString("isiberita")
    }

}