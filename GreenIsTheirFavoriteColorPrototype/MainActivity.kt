// COM437 – Green Is Their Favorite Color – Eco Shopping Assistant
// Prototype Kotlin activity for Week 6 progress


package com.havenstleo.greenfavoritecolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Placeholder button action (prototype only)
        val ecoButton: Button? = findViewById(R.id.btnViewEcoProducts)

        ecoButton?.setOnClickListener {
            Toast.makeText(
                this,
                "Eco products coming soon! (Prototype only)",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
