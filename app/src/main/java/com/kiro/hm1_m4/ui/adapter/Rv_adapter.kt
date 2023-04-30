package com.kiro.hm1_m4.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kiro.hm1_m4.data.model.ImageModel
import com.kiro.hm1_m4.databinding.ItemListBinding

class  Rv_adapter(private var imageList:ArrayList<ImageModel>, private val listener: SelectedListener, private val context: Context):
    RecyclerView.Adapter<Rv_adapter.ImageViewHolder>() {

    @SuppressLint("NotifyDataSetChanged")
    fun setList(imgList: ArrayList<ImageModel>){
        imageList = imgList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= ImageViewHolder(
            ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.onBind(imageList[position])
        holder.itemView.setOnLongClickListener{
            holder.binding.itemImage.alpha = 0.5f
            listener.select(imageList[position])
            true
        }
    }

    override fun getItemCount(): Int {
      return imageList.size
    }

    inner class ImageViewHolder(val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(img: ImageModel) {
            Glide.with(context).load(img.imageUrl).into(binding.itemImage)

        }

        val imageView : ImageView = binding.itemImage
    }


    interface SelectedListener {
        fun select(selectImg: ImageModel)
    }

}



