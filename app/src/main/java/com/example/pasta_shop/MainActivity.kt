package com.example.pasta_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shrimpbtn = findViewById<Button>(R.id.shrimpbtn)
        val spinachbtn = findViewById<Button>(R.id.spinachbtn)
        val skilletibtn = findViewById<Button>(R.id.skilletibtn)
        val marinarabtn = findViewById<Button>(R.id.marinarabtn)
        val baconcheesebtn = findViewById<Button>(R.id.baconcheesebtn)
        val carbonarabtn = findViewById<Button>(R.id.carbonarabtn)

         val shrimp=199
        val  spinach=399
        val  skilleti=299
        val  marinara=299
        val  baconcheese=299
        val  carbonara=299






        shrimpbtn.setOnClickListener {


            val intent = Intent(this, MainActivity3::class.java)

            val imageResourceId=R.drawable.ag

            intent.putExtra("imageResourceId", imageResourceId)
            intent.putExtra("title", "Shrimp Aglio Olio")
            intent.putExtra("description", "Olive Oil Coated Pasta Lightly Sautéed With Fresh Garlic Succulent Shrimps And Red Chili Flakes. Served With Garlic Bread.")
            intent.putExtra("price", 199)

            startActivity(intent)

        }
        spinachbtn.setOnClickListener {

            val intent = Intent(this, MainActivity3::class.java)


            val imageResourceId=R.drawable.pinach
            intent.putExtra("imageResourceId", imageResourceId)
            intent.putExtra("title", "Spinach Roll-Ups")
            intent.putExtra("description", "  Creamy Lasagna rolls layered with spinach and white sauce")


            intent.putExtra("price", 299)
            startActivity(intent)
        }
        skilletibtn.setOnClickListener {

            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("price", 299)
            intent.putExtra("title", "Skilletti")
            intent.putExtra("description", "  Rich tomato sauce pasta, made more flavorful with chorizo, salami, herbs and spices. Served with garlic bread.")


            val imageResourceId=R.drawable.skiletti
            intent.putExtra("imageResourceId", imageResourceId)
            startActivity(intent)
        }
        baconcheesebtn.setOnClickListener {

            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("price", 299)
            val imageResourceId=R.drawable.baconncheesexvsxray
            intent.putExtra("title", "Bacon And Cheese Fusilli")
            intent.putExtra("description", " Italian sausage baked in fusilli pasta with marinara sauce topped with cheddar cheese and parsley. Served with garlic bread")


            intent.putExtra("imageResourceId", imageResourceId)
            startActivity(intent)
        }
        carbonarabtn.setOnClickListener {

            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("price", 399)
            intent.putExtra("description", " Creamy white sauce pasta with bacon, ham, and button mushrooms with premium parmesan cheese. Served with garlic bread.")


            intent.putExtra("title", "Carbonara Supreme")
            val imageResourceId=R.drawable.carbonarasupreme
            intent.putExtra("imageResourceId", imageResourceId)
            startActivity(intent)
        }
        marinarabtn.setOnClickListener {

            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("price", 299)
            intent.putExtra("description", "  Premium pasta in chunky marinara sauce with fish cubes, squid rings and shrimps, topped with parmesan cheese. Served with garlic bread.")


            intent.putExtra("title", "Seafood Marinara")
            val imageResourceId=R.drawable.seafoodmarinara
            intent.putExtra("imageResourceId", imageResourceId)
            startActivity(intent)
        }


    }


}