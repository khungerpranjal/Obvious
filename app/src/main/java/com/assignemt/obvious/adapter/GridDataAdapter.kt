package com.assignemt.obvious.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.assignemt.obvious.R
import com.assignemt.obvious.activities.DetailedActivity
import com.assignemt.obvious.model.Data
import com.squareup.picasso.Picasso

class GridDataAdapter(data:List<Data>, val context: Context): RecyclerView.Adapter<GridViewHolder>() {

    private val inflater: LayoutInflater
    private val data: List<Data>

    init {

        inflater = LayoutInflater.from(context)
        this.data = data
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.grid_image_layout,
            parent,false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Picasso.get().load(data[position].getUrl()).into(holder.mainImg)

        holder.mainImg.setOnClickListener{
            var intent = Intent(context,DetailedActivity::class.java)
            intent.putExtra("position",position)
            context.startActivity(intent)
        }
    }
}

class GridViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val mainImg: ImageView

        init {
            mainImg = view.findViewById(R.id.main_img) as ImageView
        }
}