package com.iqbal.latihanchapter4_top2_databanding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.iqbal.latihanchapter4_top2_databanding.databinding.ItemBeritaBinding

class BeritaAdapter (var listBerita: ArrayList<ListBerita>) : RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {

    var onclick: ((ListBerita)-> Unit)? = null

    class ViewHolder(var binding: ItemBeritaBinding) : RecyclerView.ViewHolder(binding.root){
        fun datanew (itemData : ListBerita) {
            binding.berita = itemData
            binding.cardView.setOnClickListener{
                var bundle = Bundle()
                bundle.putSerializable("berita",itemData)


            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemBeritaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.datanew(listBerita[position])
    }

    override fun getItemCount(): Int = listBerita.size

//    fun getData(data : ArrayList<ListBerita>){
//            this.listBerita = data
//    }
}