package com.example.laboratorio04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.lifecycle.R

class ShareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)

        val nombre= this.intent.getStringExtra("nombre").toString()
        val correo= this.intent.getStringExtra("correo").toString()
        val telefono= this.intent.getStringExtra("telefono").toString()
        val Nombre=findViewById<TextView>(R.id.txtNombre)
        val Correo= findViewById<TextView>(R.id.txtCorreo)
        val Telefono= findViewById<TextView>(R.id.txtTelefono)

        Nombre.text=nombre
        Correo.text=correo
        Telefono.text=telefono

        val buttonCompartir = findViewById<Button>(R.id.btnCompartir)
        val txtcompartir="Nombre: "+nombre+"\nCorreo electronico: "+correo+"\nNumeroTelefonico: "+telefono
        buttonCompartir.setOnClickListener{
            Compartir(txtcompartir)
        }


    }

    fun Compartir(text: String) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, text)
        startActivity(Intent.createChooser(intent, "Compartir con"))
    }
}