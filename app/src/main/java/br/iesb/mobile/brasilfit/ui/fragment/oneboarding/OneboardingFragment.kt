package br.iesb.mobile.brasilfit.ui.fragment.oneboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.iesb.mobile.brasilfit.databinding.FragmentOneboardingBinding
import br.iesb.mobile.brasilfit.ui.fragment.oneboarding.janelas.JanelaOneboarding1Fragment
import br.iesb.mobile.brasilfit.ui.fragment.oneboarding.janelas.JanelaOneboarding2Fragment
import br.iesb.mobile.brasilfit.ui.fragment.oneboarding.janelas.JanelaOneboarding3Fragment


class OneboardingFragment : Fragment() {
      private lateinit var binding: FragmentOneboardingBinding//iniciar a variável antes de utilizar

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = FragmentOneboardingBinding.inflate(inflater, container,false)
        binding.lifecycleOwner = this
        binding.fragment = this

        //lista que contém os fragmentos
        val listaDeFragmentos = listOf(JanelaOneboarding1Fragment(),JanelaOneboarding2Fragment(),JanelaOneboarding3Fragment())

        //adaptador
        val adaptador = Adaptador(
            listaDeFragmentos,
            requireActivity().supportFragmentManager,
            lifecycle
        )
            //Adaptador(listaDeFragmentos,requireActivity().supportFragmentManager,lifecycle)


        binding.vpOboarding.adapter = adaptador


        return binding.root

    }

    fun start(){

    }

    class Adaptador(private val lista:List<Fragment>, fragmentManager:FragmentManager, lifecycle:Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle){

        override fun getItemCount():Int{
            return lista.size
        }

        override fun createFragment(position: Int): Fragment {
            return lista[position]
        }


    }
}


