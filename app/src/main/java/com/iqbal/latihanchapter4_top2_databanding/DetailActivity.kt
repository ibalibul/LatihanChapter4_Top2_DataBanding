package com.iqbal.latihanchapter4_top2_databanding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var getDetail = intent.getSerializableExtra("detailBerita") as ListBerita
        ivImgDetail.setImageResource(getDetail.img)
        tvJDetailBerita.text = getDetail.judulBerita
        tvJurnalisDBerita.text = getDetail.jurnalis
        tvTanggalDetail.text = getDetail.tanggalBerita
        tvIsiBerita.setText(getDetail.isiBerita)
    }
}