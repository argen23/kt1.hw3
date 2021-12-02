package com.example.lesson3kotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson3kotlin.databinding.ListItemBinding

class SecondAdapter() : RecyclerView.Adapter<SecondAdapter.ViewHolder>() {

    private var list = arrayListOf<Int>()

    fun setList(list : ArrayList<Int>){
        this.list = list
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class ViewHolder(private var viewBinding : ListItemBinding) : RecyclerView.ViewHolder(viewBinding.root){
        fun onBind(image: Int) {
            viewBinding.firstIV.setImageResource(image)
        }

    }

}