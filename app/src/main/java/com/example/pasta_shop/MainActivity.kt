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

        shrimpbtn.setOnClickListener {


            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)


        }
        spinachbtn.setOnClickListener {
            Toast.makeText(this, "spinachbtn", Toast.LENGTH_SHORT).show()
        }
        skilletibtn.setOnClickListener {
            Toast.makeText(this, "skilletibtn", Toast.LENGTH_SHORT).show()
        }
        baconcheesebtn.setOnClickListener {
            Toast.makeText(this, " baconcheesebtn", Toast.LENGTH_SHORT).show()
        }
        carbonarabtn.setOnClickListener {
            Toast.makeText(this, "  carbonarabtn", Toast.LENGTH_SHORT).show()
        }
        marinarabtn.setOnClickListener {
            Toast.makeText(this,   "marinarabt=", Toast.LENGTH_SHORT).show()
        }


    }


}