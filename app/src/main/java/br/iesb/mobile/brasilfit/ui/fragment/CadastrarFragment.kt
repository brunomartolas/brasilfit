package br.iesb.mobile.brasilfit.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import br.iesb.mobile.brasilfit.R
import com.google.firebase.auth.FirebaseAuth
//import kotlinx.android.synthetic.main.fragment_cadastrar.*

class CadastrarFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cadastrar, container, false)
    }
    /*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btConfirmar.setOnClickListener {
          val email = etEmailCadastro.text.toString()
            val senha = etSenhaCadastro.text.toString()
            val confirmasenha = etConfirmaSenha.text.toString()

            if (senha != confirmasenha) {
                Toast.makeText(activity, "Senhas não conferem", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val login = FirebaseAuth.getInstance()
            val taskDeLogin = login.createUserWithEmailAndPassword(email, senha)
            taskDeLogin.addOnCompleteListener { resultado ->
                if (resultado.isSuccessful) {
                    activity?.finish()
                } else {
                    Toast.makeText(activity, "Erro no cadastro", Toast.LENGTH_LONG).show()

                }
            }
        }

        btVoltarCadastro.setOnClickListener {
            activity?.finish()
        }
    }
*/
}