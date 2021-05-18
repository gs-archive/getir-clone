package com.gulsah.getir_remake

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.inflate
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.viewbinding.ViewBinding
import com.gulsah.getir_remake.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim: FragmentAnasayfaBinding
    private lateinit var kategorilerListesi: ArrayList<Kategoriler>
    private lateinit var adapter: KategoriAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = inflate(inflater, R.layout.fragment_anasayfa, container, false)

        tasarim.rvkategori.layoutManager =
            StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)

        val k1 = Kategoriler("filiz_burgu","Filiz Burgu",3.45,"500 g")
        val k2 = Kategoriler("filiz_fiyonk","Filiz Fiyonk",3.45,"500 g")
        val k3 = Kategoriler("filiz_spagetti","Filiz Spagetti",3.45,"500 g")
        val k4 = Kategoriler("ankara_fiyonk","Nuh'un Ankara Fiyonk", 3.95, "500 g")
        val k5 = Kategoriler("ankara_burgu","Nuh'un Ankara Burgu", 3.95, "500 g")
        val k6 = Kategoriler("ankara_spagetti","Nuh'un Ankara Spaghetti",3.95,"500 g")
        val k7 = Kategoriler("barilla_fiyonk","Barilla Fiyonk",5.30,"500 g")
        val k8 = Kategoriler("barilla_burgu","Barilla Burgu",5.30,"500 g")
        val k9 = Kategoriler("barilla_spagetti","Barilla Spagetti",5.30,"500 g")
        val k10 = Kategoriler("barilla_arpa","Barilla Arpa Şehriye",28.95,"250 g")
        val k11 = Kategoriler("barilla_peynirli","Barilla Peynrili Tortellini",3.45,"250 g")
        val k12 = Kategoriler("napoliten_soslu_makarna","Napoliten Soslu Makarna",3.45,"250 g")
        val k13 = Kategoriler("arabiata_soslu_makarna","Arabiata Soslu Makarna",3.45,"250 g")
        val k14 = Kategoriler("knor_uc_peynirli","Knorr 3 Peynirli Çabuk Makarna",5.95,"67 g")
        val k15 = Kategoriler("knorr_napoliten","Knorr Napoliten Çabuk Makarna",5.95,"78 g")
        val k16 = Kategoriler("knorr_kremali","Knorr Kremalı Çabuk Makarna",5.95,"78 g")

        kategorilerListesi = ArrayList()
        kategorilerListesi.add(k1)
        kategorilerListesi.add(k2)
        kategorilerListesi.add(k3)
        kategorilerListesi.add(k4)
        kategorilerListesi.add(k5)
        kategorilerListesi.add(k6)
        kategorilerListesi.add(k7)
        kategorilerListesi.add(k8)
        kategorilerListesi.add(k9)
        kategorilerListesi.add(k10)
        kategorilerListesi.add(k11)
        kategorilerListesi.add(k12)
        kategorilerListesi.add(k13)
        kategorilerListesi.add(k14)
        kategorilerListesi.add(k15)
        kategorilerListesi.add(k16)

        adapter = KategoriAdapter(requireContext(),kategorilerListesi)
        tasarim.rvkategori.adapter = adapter


        return tasarim.root
    }

}