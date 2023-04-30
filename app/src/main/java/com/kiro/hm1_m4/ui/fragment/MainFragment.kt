package com.kiro.hm1_m4.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kiro.hm1_m4.R
import com.kiro.hm1_m4.data.model.ImageModel
import com.kiro.hm1_m4.databinding.FragmentMainBinding
import com.kiro.hm1_m4.ui.adapter.Rv_adapter

class MainFragment : Fragment(),Rv_adapter.SelectedListener {

    private val imageList: ArrayList<ImageModel> = ArrayList()
    private lateinit var imageAdapter : Rv_adapter
    lateinit var binding:FragmentMainBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=FragmentMainBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = arrayListOf<ImageModel>()
        list.add(ImageModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToRooEkgUSA8K9EFYl5j7SbTmV_78crkCpZA&usqp=CAU"))
        list.add(ImageModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfgZxAXxuxM-R4cHYMuOzvpXhmKZtdOoS6og&usqp=CAU"))
        list.add(ImageModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToRooEkgUSA8K9EFYl5j7SbTmV_78crkCpZA&usqp=CAU"))
        list.add(ImageModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToRooEkgUSA8K9EFYl5j7SbTmV_78crkCpZA&usqp=CAU"))
        binding.recyclerSingleAc.adapter = imageAdapter

        binding.btnBack.setOnClickListener{
            findNavController().navigate(R.id.chooseFragment)
        }


        binding.btnBack.setOnClickListener{
            val bundle = Bundle()
            bundle.putSerializable("key", imageList)
            findNavController().navigate(R.id.chooseFragment, bundle)
        }



    }

    override fun select(selectImg: ImageModel) {
        imageList.add(selectImg)

    }
}

