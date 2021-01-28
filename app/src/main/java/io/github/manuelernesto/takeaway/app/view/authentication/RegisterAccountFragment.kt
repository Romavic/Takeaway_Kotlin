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
import io.github.manuelernesto.takeaway.app.viewmodel.RegisterAccountViewModel

class RegisterAccountFragment : Fragment() {

    companion object {
        fun newInstance() = RegisterAccountFragment()
    }

    private lateinit var viewModel: RegisterAccountViewModel

    private lateinit var inputName: TextInputLayout
    private lateinit var edtName: AppCompatEditText
    private lateinit var inputPhone: TextInputLayout
    private lateinit var edtPhone: AppCompatEditText
    private lateinit var inputPassword: TextInputLayout
    private lateinit var edtPassword: AppCompatEditText
    private lateinit var btnRegisterAccount: AppCompatButton
    private lateinit var textLoginAccount: AppCompatTextView

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.register_account_fragment, container, false).apply {

            inputName = findViewById(R.id.inputName)
            edtName = findViewById(R.id.edtNameRegisterAccount)
            inputPhone = findViewById(R.id.inputPhone)
            edtPhone = findViewById(R.id.edtPhoneRegisterAccount)
            inputPassword = findViewById(R.id.inputPassword)
            edtPassword = findViewById(R.id.edtPasswordRegisterAccount)
            btnRegisterAccount = findViewById(R.id.btnRegisterAccount)
            textLoginAccount = findViewById(R.id.textLoginAccount)

            btnRegisterAccount.setOnClickListener {
                when {
                    edtName.text?.isEmpty()!! -> {
                        inputName.error = "Preencha o nome."
                    }
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

            textLoginAccount.setOnClickListener {
                findNavController().navigate(R.id.actionRegisterAccountToLoginAccount)
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RegisterAccountViewModel::class.java)
        // TODO: Use the ViewModel
    }

}