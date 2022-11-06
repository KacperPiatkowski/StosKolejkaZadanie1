package com.example.stoskolejkazadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Stack

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var planets =  Stack<Int>();



        findViewById<Button>(R.id.pushbtn).setOnClickListener {

            var nowy = findViewById<EditText>(R.id.editTextTextPersonName).text.toString().toInt();

            planets.push(nowy);

            findViewById<TextView>(R.id.textView2).text = planets.toString();

        }

        findViewById<Button>(R.id.popbutton).setOnClickListener {

            if(planets.isEmpty()) {

                findViewById<TextView>(R.id.textView2).text = "Nie ma elementow";

            }else {

                planets.pop();

                findViewById<TextView>(R.id.textView2).text = planets.toString();

            }

        }

        findViewById<Button>(R.id.emptybtn).setOnClickListener {

            val empty : Boolean = planets.isEmpty()

            findViewById<TextView>(R.id.textView2).text = "Czy jest pusty: " + empty.toString();

        }

        findViewById<Button>(R.id.sizebtn).setOnClickListener {

            findViewById<TextView>(R.id.textView2).text = "Ilosc elementow: " + planets.size;

        }
    }
}