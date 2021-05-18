package com.gulsah.getir_remake

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.gulsah.getir_remake.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {

    private lateinit var tasarim: FragmentDetayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_detay, container, false)
        val b: DetayFragmentArgs by navArgs()
        val gelenNesne = b.detayNesne

        tasarim.imageViewDetay.setImageResource(
            resources.getIdentifier(gelenNesne.resim, "drawable", requireContext().packageName))

        tasarim.textViewDetayFiyat.text = gelenNesne.fiyat.toString()
        tasarim.textViewDetayAd.text = gelenNesne.kategori_adi
        tasarim.textViewDetayGram.text = gelenNesne.gram

        return tasarim.root
    }
}