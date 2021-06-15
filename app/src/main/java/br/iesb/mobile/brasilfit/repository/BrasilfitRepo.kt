package br.iesb.mobile.brasilfit.repository

import br.iesb.mobile.brasilfit.di.EndspointsAcademias
import br.iesb.mobile.brasilfit.domain.Empresas
import br.iesb.mobile.brasilfit.domain.ResultadoAPI
import javax.inject.Inject

class BrasilfitRepo @Inject constructor(
   private val req: EndspointsAcademias
){
    suspend fun loadData():List<Empresas>{

            val result:ResultadoAPI = req.buscarNome()

            return result.empresas_halibilitadas_regular //retorna a lista de empresas

    }
}

