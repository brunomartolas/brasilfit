package br.iesb.mobile.brasilfit.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import br.iesb.mobile.brasilfit.R
import br.iesb.mobile.brasilfit.databinding.FragmentHomeBinding
import br.iesb.mobile.brasilfit.domain.Empresas
import br.iesb.mobile.brasilfit.viewmodel.BrasilFitViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val viewModel: BrasilFitViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater,container,false)
        binding.fragmentHome = this
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.resultado.observe(viewLifecycleOwner){ ListaEmpresas ->
            ListaEmpresas.forEach{ p ->
                Log.d("Rick_LOG", "Empresas: ${p.razao_social}")
            }

        }//dono do ciclo de vida

    }

    fun loadData(v: View){

        viewModel.loadData()
    }

}
