package com.example.practica1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.practica1.ui.theme.Practica1Theme
import android.content.Intent
import android.widget.Button
import androidx.fragment.app.FragmentActivity

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Cargar el Fragment en el contenedor
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContenedorGalaxia, GalaxiaFragment())
                .commit()
        }

        // 2. Configurar el botón de navegación
        val btnIrSistemaSolar = findViewById<Button>(R.id.btnIrSistemaSolar)

        btnIrSistemaSolar.setOnClickListener {
            // Aquí le decimos que viaje de MainActivity a SistemaSolarActivity
            val intent = Intent(this, SistemaSolarActivity::class.java)
            startActivity(intent)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Practica1Theme {
        Greeting("Android")
    }
}