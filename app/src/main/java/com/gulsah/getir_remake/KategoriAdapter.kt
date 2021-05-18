package com.gulsah.getir_remake

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.gulsah.getir_remake.databinding.KategoriCardBinding

class KategoriAdapter(var mContext: Context, var kategorilerListesi: List<Kategoriler>) :
    RecyclerView.Adapter<KategoriAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(kategoriCardBinding: KategoriCardBinding) :
        RecyclerView.ViewHolder(kategoriCardBinding.root) {
        var tasarim : KategoriCardBinding

        init {
            this.tasarim = kategoriCardBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = KategoriCardBinding.inflate(layoutInflater, parent, false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val kategori = kategorilerListesi.get(position)
        holder.tasarim.imageView.setImageResource(
            mContext.resources.getIdentifier(
                kategori.resim,
                "drawable",
                mContext.packageName
            )
        )
        holder.tasarim.textViewKategoriAdi.text = kategori.kategori_adi
        holder.tasarim.kategoriCard.setOnClickListener {
            Snackbar.make(it, kategori.kategori_adi, Snackbar.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return kategorilerListesi.size
    }
}