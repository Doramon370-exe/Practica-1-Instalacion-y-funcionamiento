package com.example.practica1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.fragment.app.FragmentActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button


class PlanetasActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planetas)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContenedorPlanetas, PlanetasFragment())
                .commit()
        }

        val btnIrLunas = findViewById<Button>(R.id.btnIrLunas)
        btnIrLunas.setOnClickListener {
            val intent = Intent(this, LunasActivity::class.java)
            startActivity(intent)
        }
    }
}