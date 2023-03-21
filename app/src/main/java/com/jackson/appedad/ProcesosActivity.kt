package com.jackson.appedad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ProcesosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_procesos)

        val datosTxt:TextView=findViewById(R.id.txtInformacion)
        val edadTxt:TextView=findViewById(R.id.txtEdad)

        val botonRegresar:Button=findViewById(R.id.btnRegresar)
        botonRegresar.setOnClickListener { onClick() }

        var miBundle: Bundle?= this.intent.extras

        datosTxt.text = miBundle?.getString("Datos")

        var datosMensaje = miBundle?.getString("Datos")

        Toast.makeText(this, "$datosMensaje", Toast.LENGTH_LONG).show()



        val data = miBundle!!.getString("Edad")
        val edad = data?.toInt()

        var cad = ""

        if (edad!! >= 0 && edad <= 15){
            cad = "La persona es infante"
        } else if (edad!! >= 15 && edad <= 18){
            cad = "La persona es Adolescente"
        } else if (edad!! >= 18 && edad <= 65){
            cad = "La persona es Adulto"
        } else if (edad!! > 65){
            cad = "La persona es Adulto Mayor"
        }

        edadTxt.text = cad
    }

    private fun onClick() {
        finish()
    }
}