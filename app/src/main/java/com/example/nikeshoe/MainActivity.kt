package com.example.nikeshoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.RecoverySystem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nikeshoe.adapter.ShoeAdapter
import com.example.nikeshoe.shoe.shoe

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView:RecyclerView=findViewById(R.id.nike_shoe)

        var shoeArray=ArrayList<shoe>()
        shoeArray.add(shoe(  " Nike Spverfly 6 \n Elite FG \n $799",R.drawable.nike1,"001"))
        shoeArray.add(shoe(" Air Vapormax \n Flyknit \n $2180",R.drawable.nike2,"002"))
        shoeArray.add(shoe(" Air Jardan 14 \n Retro se \n $2400",R.drawable.nike3,"003"))
        shoeArray.add(shoe(" LeBorn XVI \n Low EP \n $1099",R.drawable.nike4,"004"))
        shoeArray.add(shoe(" Jordan Why Not \n Zero0.2PF \n$2699",R.drawable.nike5,"005"))
        shoeArray.add(shoe(" LeBorn XVI \n SB EP \n $2180",R.drawable.nike6,"006"))

        val shoeAdapter=ShoeAdapter(shoeArray)

        recyclerView.layoutManager=GridLayoutManager(this,2)
        recyclerView.adapter=shoeAdapter
    }
}
