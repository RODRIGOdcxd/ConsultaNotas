package com.example.proyecto2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        verNota()
        Nuevo()
    }

    fun verNota(){
        val nota = findViewById<Button>(R.id.btnVerNota)
        nota.setOnClickListener() {
            val nota1 = findViewById<TextView>(R.id.txtTarea1).text.toString().toInt()
            val nota2 = findViewById<TextView>(R.id.txtTarea2).text.toString().toInt()
            val parcial = findViewById<TextView>(R.id.txtParcial).text.toString().toInt()
            val final = findViewById<TextView>(R.id.txtFinal).text.toString().toInt()
            val promediofinal = findViewById<TextView>(R.id.txtPromedioFinal)
            val promedioprac = findViewById<TextView>(R.id.txtPromedioPractica)
            val situacion = findViewById<TextView>(R.id.txtSituacion)
            promedioprac.text = ((nota1 + nota2) / 2).toString()
            promediofinal.text = ((nota1 + nota2 + parcial + final) / 4).toString()
            if (promediofinal.text.toString().toInt() > 13){
                situacion.text = "APROBADO"
            }else{
                situacion.text = "DESAPROBO"
            }
        }
    }

    fun Nuevo(){
        val nuevo = findViewById<Button>(R.id.btnNuevo)
        nuevo.setOnClickListener() {
            val nota1 = findViewById<TextView>(R.id.txtTarea1)
            val nota2 = findViewById<TextView>(R.id.txtTarea2)
            val parcial = findViewById<TextView>(R.id.txtParcial)
            val final = findViewById<TextView>(R.id.txtFinal)
            val propracticas = findViewById<TextView>(R.id.txtPromedioPractica)
            val profinal = findViewById<TextView>(R.id.txtPromedioFinal)
            val situacion = findViewById<TextView>(R.id.txtSituacion)
            nota1.text = ""
            nota2.text = ""
            parcial.text = ""
            final.text = ""
            propracticas.text = ""
            profinal.text = ""
            situacion.text = ""
        }
    }
}