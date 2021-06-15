package br.iesb.mobile.brasilfit.domain

    data class Empresas(val name:String, val reg: Int, val num: Int){
        val razao_social: String = ""
        val cnpj: Int = 0
        val numero_tar: Int = 0
    }

    data class ResultadoAPI(val name: List<Empresas>){
       val empresas_halibilitadas_regular: List<Empresas> = TODO()


    }