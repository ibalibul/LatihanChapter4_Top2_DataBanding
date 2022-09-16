package com.iqbal.latihanchapter4_top2_databanding

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.iqbal.latihanchapter4_top2_databanding.databinding.ItemBeritaBinding

class BeritaAdapter (var listBerita: ArrayList<ListBerita>) : RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {

    var onclick: ((ListBerita)-> Unit)? = null

    class ViewHolder(var binding: ItemBeritaBinding) : RecyclerView.ViewHolder(binding.root){
        fun datanew (itemData : ListBerita) {
            binding.berita = itemData
            binding.cardView.setOnClickListener(object : View.OnClickListener{

                override fun onClick(view: View?) {

                    var bundle = Bundle()
                    bundle.putString("judulberita", itemData.judulBerita)
                    bundle.putString("tanggalberita", itemData.tanggalBerita)
                    bundle.putString("jurnalisberita", itemData.jurnalis)
                    bundle.putInt("isiberita", itemData.isiBerita)
                    bundle.putInt("imageberita", itemData.img)
                    val intent = Intent(view!!.context,DetailActivity::class.java)
                    intent.putExtras(bundle)
                    view.context.startActivity(intent)

                }

            })
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemBeritaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.datanew(listBerita[position])
    }

    override fun getItemCount(): Int {
        return listBerita.size
    }

}