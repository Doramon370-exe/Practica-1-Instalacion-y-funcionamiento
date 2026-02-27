package com.example.practica1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.fragment.app.FragmentActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button

class SistemaSolarActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sistema_solar)

        // Cargar el Fragment del Sistema Solar
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContenedorSistema, SistemaSolarFragment())
                .commit()
        }

        // Configurar el botón para ir a Planetas
        val btnIrPlanetas = findViewById<Button>(R.id.btnIrPlanetas)

        btnIrPlanetas.setOnClickListener {
            // Te marcará error en rojo hasta que creemos PlanetasActivity
            val intent = Intent(this, PlanetasActivity::class.java)
            startActivity(intent)
        }
    }
}