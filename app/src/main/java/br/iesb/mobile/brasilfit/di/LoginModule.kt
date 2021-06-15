package br.iesb.mobile.brasilfit.di

import br.iesb.mobile.brasilfit.domain.ResultadoAPI
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

@Module
@InstallIn(SingletonComponent::class)
//módulo único que gera "fábricas" de autenticação no firebase
class LoginModule {

        @Provides
        fun fireBaseAuthProvider() = Firebase.auth

    }

class brasilfitModule{
    @Provides //vai entregar a função pra quem declara-la no construtor
    fun provideRetrofit(): Retrofit{
        //chamada para a internet usando o retrofit
        return  Retrofit.Builder() //chama metodos um após o outro
            .baseUrl("https://dados.antt.gov.br/dataset/" +
                    "c7edbb2b-a6ea-49d9-b807-0db8f336022b/resource" +
                    "/4cd56b77-79b4-4e78-b09e-5d3aa2776859/download/")
            .addConverterFactory(GsonConverterFactory.create()) //fabrica que converor json para um objeto/para uma classe
            .build()
    }
    @Provides
    fun providebrasilfitServices(retrofit:Retrofit):EndspointsAcademias{
        return retrofit.create(EndspointsAcademias::class.java)
    }
}

interface EndspointsAcademias{
    @GET("empresas_habilitadas_regular_05_2021")// é um get para recuperar as informações da url
    suspend fun buscarNome(): ResultadoAPI //por causa do suspend, o retrofit sabe que é uma co-rotina.
// Uma co-rotina quando chega em uma determinada linha, ele para até que a requisição volte

}