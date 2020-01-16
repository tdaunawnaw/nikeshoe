package com.example.nikeshoe.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nikeshoe.R
import com.example.nikeshoe.shoe.shoe


class ShoeHolder(ItemView: View):RecyclerView.ViewHolder(ItemView){
    var shoename=ItemView.findViewById<TextView>(R.id.shoename)
    var shoeimage=ItemView.findViewById<ImageView>(R.id.nike1)
    var shoenumber=ItemView.findViewById<TextView>(R.id.shoeno)
}

class ShoeAdapter(var shoelist:ArrayList<shoe>):RecyclerView.Adapter<ShoeHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoeHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.shoeitem,parent,false)
        return ShoeHolder(view)
    }

    override fun getItemCount(): Int {
        return shoelist.size
    }

    override fun onBindViewHolder(holder: ShoeHolder, position: Int) {
        holder.shoename.text=shoelist[position].name
        holder.shoeimage.setImageResource(shoelist[position].image)
        holder.shoenumber.text= shoelist[position].number.toString()
    }

}