package com.gulsah.getir_remake

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
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

        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_anasayfa, container, false)

        tasarim.rvkategori.layoutManager =
            StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)

        val k1 = Kategoriler("su_ve_icecek","Su & İçecek")
        val k2 = Kategoriler("meyve_sebze","Meyve & Sebze")
        val k3 = Kategoriler("firindan","Fırından")
        val k4 = Kategoriler("temel_gida","Temel Gıda")
        val k5 = Kategoriler("atistirmalik","Atıştırmalık")
        val k6 = Kategoriler("dondurma","Dondurma")
        val k7 = Kategoriler("yiyecek","Yiyecek")
        val k8 = Kategoriler("sut_kahvalti","Süt & Kahvaltı")
        val k9 = Kategoriler("fit_form","Fit & Form")
        val k10 = Kategoriler("kisisel_bakim","Kişisel Bakım")
        val k11 = Kategoriler("ev_bakim","Ev Bakım")
        val k12 = Kategoriler("ev_yasam","Ev Yaşam")
        val k13 = Kategoriler("teknoloji","Teknoloji")
        val k14 = Kategoriler("evcil_hayvan","Evcil Hayvan")
        val k15 = Kategoriler("bebek","Bebek")
        val k16 = Kategoriler("cinsel_saglik","Cinsel Sağlık")
        val k17 = Kategoriler("giyim","Giyim")

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
        kategorilerListesi.add(k17)

        adapter = KategoriAdapter(requireContext(),kategorilerListesi)
        tasarim.rvkategori.adapter = adapter


        return tasarim.root
    }

}