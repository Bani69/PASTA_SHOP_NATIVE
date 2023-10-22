package com.example.pasta_shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val dfiamg = findViewById<ImageView>(R.id.dfimage)
        val productprice = findViewById<TextView>(R.id.productprice)
        val productdescription = findViewById<TextView>(R.id.description)
        val producttitle = findViewById<TextView>(R.id.producttitle)
        val imageResourceId = intent.getIntExtra("imageResourceId", R.id.imageView6)
        val getprice = "₱" + intent.getIntExtra("price", 0).toString()
        producttitle.text = intent.getStringExtra("title")
        productprice.text = getprice
        val settotal = findViewById<TextView>(R.id.total)



        productdescription.text = intent.getStringExtra("description")
        dfiamg.setImageResource(imageResourceId)
        val box1 = findViewById<CheckBox>(R.id.box1)
        val box2 = findViewById<CheckBox>(R.id.box2)
        val box3 = findViewById<CheckBox>(R.id.box3)
        val box4 = findViewById<CheckBox>(R.id.box4)
        val box5 = findViewById<CheckBox>(R.id.box5)
        val box6 = findViewById<CheckBox>(R.id.box6)
        val box7 = findViewById<CheckBox>(R.id.box7)
        val box8 = findViewById<CheckBox>(R.id.box8)
        val totalprice = mutableListOf(intent.getIntExtra("price", 0), 0, 0, 0, 0, 0, 0, 0)

        fun calculateaddons(id: CheckBox, index: Int, Value: Int) {

            if (id.isChecked) {
                totalprice[index] = Value
                settotal.text = totalprice.sum().toString()
            } else {
                totalprice[index] = 0
                settotal.text = totalprice.sum().toString()

            }

        }
        settotal.text = getprice
        box2.setOnCheckedChangeListener { button, b ->
            calculateaddons(box2, 1, 28)
        }

        box3.setOnCheckedChangeListener { button, b ->
            calculateaddons(box3, 2, 65)
        }

        box4.setOnCheckedChangeListener { button, b ->

            calculateaddons(box4, 3, 48)
        }

        box5.setOnCheckedChangeListener { button, b ->
            //group
            if (box5.isChecked) {
                totalprice[0] = 699
                settotal.text = totalprice.sum().toString()
            } else {
                totalprice[0] = intent.getIntExtra("price", 0)
                settotal.text = totalprice.sum().toString()
            }


        }

        box6.setOnCheckedChangeListener { button, b ->
            calculateaddons(box6, 5, 68)
        }

        box7.setOnCheckedChangeListener { button, b ->

            calculateaddons(box7, 6, 38)
        }

        box8.setOnCheckedChangeListener { button, b ->

            calculateaddons(box8, 7, 58)
        }

    }
}