package com.iqbal.latihanchapter4_top2_databanding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.iqbal.latihanchapter4_top2_databanding.databinding.ItemBeritaBinding

class BeritaAdapter (var listBerita: ArrayList<ListBerita>,private val mlistener: MainActivity) : RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {

    class ViewHolder(var binding: ItemBeritaBinding) : RecyclerView.ViewHolder(binding.root){

        fun datanew (itemData : ListBerita, listener: MainActivity) {
            binding.berita = itemData
            binding.detailklik = listener
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemBeritaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.datanew(listBerita[position],mlistener)
    }

    override fun getItemCount(): Int {
        return listBerita.size
    }
    interface ItemClickListener {
            fun onItemCliked(detail : ListBerita)
    }
}