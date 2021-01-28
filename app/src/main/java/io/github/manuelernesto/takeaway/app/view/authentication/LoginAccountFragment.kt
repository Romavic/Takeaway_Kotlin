package io.github.manuelernesto.takeaway.app.view.authentication

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputLayout
import io.github.manuelernesto.takeaway.R
import io.github.manuelernesto.takeaway.app.viewmodel.LoginAccountViewModel

class LoginAccountFragment : Fragment() {

    companion object {
        fun newInstance() = LoginAccountFragment()
    }

    private lateinit var viewModel: LoginAccountViewModel

    private lateinit var inputPhone: TextInputLayout
    private lateinit var edtPhone: AppCompatEditText
    private lateinit var inputPassword: TextInputLayout
    private lateinit var edtPassword: AppCompatEditText
    private lateinit var btnLoginAccount: AppCompatButton
    private lateinit var textSignUp: AppCompatTextView

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.login_account_fragment, container, false).apply {

            inputPhone = findViewById(R.id.inputPhone)
            edtPhone = findViewById(R.id.edtPhoneLoginAccount)
            inputPassword = findViewById(R.id.inputPassword)
            edtPassword = findViewById(R.id.edtPasswordLoginAccount)
            btnLoginAccount = findViewById(R.id.btnLoginAccount)
            textSignUp = findViewById(R.id.textRegisterAccount)

            btnLoginAccount.setOnClickListener {
                when {
                    edtPhone.text?.isEmpty()!! -> {
                        inputPhone.error = "Preencha o telefone."
                    }
                    edtPassword.text?.isEmpty()!! -> {
                        inputPassword.error = "Preencha a password."
                    }
                    else -> {

                    }
                }
            }

            textSignUp.setOnClickListener {
                findNavController().navigate(R.id.actionLoginAccountToRegisterAccount)
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginAccountViewModel::class.java)
        // TODO: Use the ViewModel
    }

}