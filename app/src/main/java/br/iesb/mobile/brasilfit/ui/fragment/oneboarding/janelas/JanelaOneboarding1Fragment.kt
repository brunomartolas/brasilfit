package br.iesb.mobile.brasilfit.ui.fragment.oneboarding.janelas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.iesb.mobile.brasilfit.databinding.FragmentJanelaOneboarding1Binding


class JanelaOneboarding1Fragment : Fragment() {
    private lateinit var binding: FragmentJanelaOneboarding1Binding//antes de usar, garatinr que ela esteja inicializada

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        binding = FragmentJanelaOneboarding1Binding.inflate(inflater,container,false)
        binding.lifecycleOwner = this

        // representa o xml
        return binding.root
    }
}