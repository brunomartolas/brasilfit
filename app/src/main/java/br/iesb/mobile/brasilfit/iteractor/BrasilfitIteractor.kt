package br.iesb.mobile.brasilfit.iteractor

import br.iesb.mobile.brasilfit.domain.Empresas
import br.iesb.mobile.brasilfit.repository.BrasilfitRepo
import javax.inject.Inject

class BrasilfitIteractor @Inject constructor(
    private val repo: BrasilfitRepo

) {
    suspend fun loadData(): List<Empresas>{
        //Validar chamadas da internet, caso tenha necessidade
       return repo.loadData()
    }
}