package br.iesb.mobile.brasilfit.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import br.iesb.mobile.brasilfit.domain.Empresas
import br.iesb.mobile.brasilfit.iteractor.BrasilfitIteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BrasilFitViewModel @Inject constructor(
    app:Application,
    private val iteractor: BrasilfitIteractor
) : AndroidViewModel(app){

    val resultado = MutableLiveData<List<Empresas>>() //caixa que guarda as listas

    fun loadData() {

        viewModelScope.launch { //co-rotina que roda em segundo plano,
            // para que não trave o aplicativo para fazer requisição para da internet

            resultado.value = iteractor.loadData()

        }

    }


}