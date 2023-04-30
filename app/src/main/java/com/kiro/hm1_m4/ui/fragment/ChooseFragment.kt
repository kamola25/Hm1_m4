package com.kiro.hm1_m4.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kiro.hm1_m4.data.model.ImageModel
import com.kiro.hm1_m4.databinding.FragmentChooseBinding
import com.kiro.hm1_m4.ui.adapter.Rv_adapter

class ChooseFragment : Fragment(),Rv_adapter.SelectedListener {
    private lateinit var adapter : Rv_adapter
    private lateinit var binding: FragmentChooseBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChooseBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val value = arguments?.getSerializable("key") as ArrayList<ImageModel>

         binding.rvChoose.adapter = adapter

    }

    override fun select(selectImg: ImageModel) {

    }


}