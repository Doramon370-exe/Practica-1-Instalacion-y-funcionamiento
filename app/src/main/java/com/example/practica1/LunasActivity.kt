package com.example.practica1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.fragment.app.FragmentActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class LunasActivity : FragmentActivity() { // Usamos FragmentActivity para evitar el crash
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lunas)

        // Cargamos el Fragment de las Lunas en el contenedor
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContenedorLunas, LunasFragment())
                .commit()
        }
    }
}