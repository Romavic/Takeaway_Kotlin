package io.github.manuelernesto.takeaway.app.view.menu.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.manuelernesto.takeaway.R
import io.github.manuelernesto.takeaway.app.viewmodel.ProductsDetailsViewModel

class ProductsDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = ProductsDetailsFragment()
    }

    private lateinit var viewModel: ProductsDetailsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.products_details_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProductsDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}