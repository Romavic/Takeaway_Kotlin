package io.github.manuelernesto.takeaway.app.view.authentication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.fragment.app.FragmentContainerView
import io.github.manuelernesto.takeaway.R
import io.github.manuelernesto.takeaway.app.util.gone
import io.github.manuelernesto.takeaway.app.util.show

class AuthenticationActivity : AppCompatActivity() {

    private lateinit var navHostFragment: FragmentContainerView
    private lateinit var linearStartOrder: LinearLayoutCompat
    private lateinit var btnStartOrder: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)

        navHostFragment = findViewById(R.id.nav_host_fragment)
        linearStartOrder = findViewById(R.id.linearStartOrder)
        btnStartOrder = findViewById(R.id.btnStartOrder)

        btnStartOrder.setOnClickListener {
            navHostFragment.show()
            linearStartOrder.gone()
        }
    }
}