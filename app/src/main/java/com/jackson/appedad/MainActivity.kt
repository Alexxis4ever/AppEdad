package com.jackson.appedad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miBoton:Button=findViewById(R.id.btnIngresar)
        miBoton.setOnClickListener{ onClick() }


    }

    private fun onClick() {

        val campoNombre:EditText=findViewById(R.id.editTextNombre)
        var nombre:String=campoNombre.text.toString()

        val campoDocumento:EditText=findViewById(R.id.editTextDocumento)
        var documento:String=campoDocumento.text.toString()

        val campoEmail:EditText=findViewById(R.id.editTextEmail)
        var email:String=campoEmail.text.toString()

        val campoTelefono:EditText=findViewById(R.id.editTextTelefono)
        var telefono:String=campoTelefono.text.toString()

        val campoEdad:EditText=findViewById(R.id.editTextEdad)
        var edad:String=campoEdad.text.toString()


        var cad = """
            Nombre: $nombre
            Documento: $documento
            E-mail: $email
            Telefono: $telefono
            Edad: $edad
        """.trimIndent()


        val miIntent = Intent(this, ProcesosActivity::class.java)
        val miBundle:Bundle=Bundle()
        miBundle.putString("Datos", cad)
        miBundle.putString("Edad", edad)

        miIntent.putExtras(miBundle)
        startActivity(miIntent)
    }
}