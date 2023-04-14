package com.example.laboratorio04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.lifecycle.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonEnviar = findViewById<Button>(R.id.btnGuardar)
        val Nombre= findViewById<EditText>(R.id.Nombre)
        val Correo = findViewById<EditText>(R.id.Correo)
        val Telefono= findViewById<EditText>(R.id.Telefono)
        buttonEnviar.setOnClickListener {
                val intent = Intent(this, ShareActivity::class.java)
                intent.putExtra("nombre", Nombre.text.toString())
                intent.putExtra("correo", Correo.text.toString())
                intent.putExtra("telefono", Telefono.text.toString())
                startActivity(intent)
            }

        }

    }


