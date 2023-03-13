package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOrder.setOnClickListener{
            val checkMeatRadioButtonId = rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkMeatRadioButtonId)
            val cheese = Cheese.isChecked
            val onion = Onion.isChecked
            val Salad = Salad.isChecked
            val orderString = "You ordered a burger with -->\n" + "${meat.text}" +
                    (if(cheese)"\nCheese" else " ") +
                    (if(onion)"\nOnion" else " ") +
                    (if(Salad)"\nSalad" else " ")
            tvOrder.text = orderString
        }
    }

}