package br.iesb.mobile.brasilfit.ui.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import br.iesb.mobile.brasilfit.R
import com.google.firebase.auth.FirebaseAuth
//import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }
/*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btCadastro.setOnClickListener {

        }

        tvEsqueci.setOnClickListener {

        }

        btLogin.setOnClickListener {
            val email = etEmail.text.toString()
            val senha = etSenha.text.toString()

            val login = FirebaseAuth.getInstance()
            val taskDeLogin = login.signInWithEmailAndPassword(email,senha)
            taskDeLogin.addOnCompleteListener { resultado ->
                if(resultado.isSuccessful){

                }else{
                    Toast.makeText(activity,"Erro no Login", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

*/
}
