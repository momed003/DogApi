package com.learn.thedogapi.ui.repository

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.learn.thedogapi.ui.model.DogApi

class DogAdapter(val context: Context, private val dogImage: ArrayList<DogApi>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class ViewHolder(v: View?):RecyclerView.ViewHolder(v!!), View.OnClickListener{
        override fun onClick(p0: View?) {

        }

    }

}