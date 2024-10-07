package com.nudriin.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nudriin.mynavigation.databinding.FragmentDetailCategoryBinding

class DetailCategoryFragment : Fragment() {
    private var _binding: FragmentDetailCategoryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // get data from safeargs
        val bundleArgs = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle)

        val dataName = bundleArgs.name // get name from bundle arguments
        val dataDescription = bundleArgs.stock // get stock from bundle arguments

        binding.tvCategoryName.text = dataName
        binding.tvCategoryDescription.text = "Stock: $dataDescription"
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}