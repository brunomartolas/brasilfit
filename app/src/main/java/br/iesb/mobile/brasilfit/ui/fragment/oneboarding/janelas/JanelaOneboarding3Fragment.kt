package br.iesb.mobile.brasilfit.ui.fragment.oneboarding.janelas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.iesb.mobile.brasilfit.databinding.FragmentJanelaOneboarding3Binding

class JanelaOneboarding3Fragment : Fragment() {

    private  lateinit var  binding: FragmentJanelaOneboarding3Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentJanelaOneboarding3Binding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        // Inflate the layout for this fragment
        return binding.root
    }
}