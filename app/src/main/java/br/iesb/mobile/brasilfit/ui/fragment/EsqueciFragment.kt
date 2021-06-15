package br.iesb.mobile.brasilfit.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import br.iesb.mobile.brasilfit.R
import com.google.firebase.auth.FirebaseAuth
//import kotlinx.android.synthetic.main.fragment_esqueci.*

//
class EsqueciFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_esqueci, container, false)
    }
/*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btEnviarEmail.setOnClickListener {
            val email = etEmailEsqueci.text.toString()
            val login = FirebaseAuth.getInstance()
            val taskDeLogin = login.sendPasswordResetEmail(email)
            taskDeLogin.addOnCompleteListener { resultado ->
                if (resultado.isSuccessful) {
                    Toast.makeText(activity, "Um e-mail foi enviado para sua caixa de mensagens", Toast.LENGTH_LONG).show()
                    activity?.finish()
                } else {
                    Toast.makeText(activity, "E-mail não cadastrado", Toast.LENGTH_LONG).show()
                }
            }
        }
        btVoltar.setOnClickListener {
            activity?.finish()
        }
    }
*/
}