package com.example.appoperaciones

import android.app.AlertDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import android.widget.Toast.makeText as makeText1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Multiplicacion(view: View) {
        val myNumero: String = num1.text.toString()
        val myNumero2: String = num2.text.toString()
        val myResul: Int = (myNumero.toInt() * myNumero2.toInt())
        Toast.makeText(this, "El Resultado es "+ myResul,Toast.LENGTH_LONG).show()
    }
    fun Suma(view: View) {
        val myNumero: String = num1.text.toString()
        val myNumero2: String = num2.text.toString()
        val mySuma: Int = (myNumero.toInt() + myNumero2.toInt())
        Toast.makeText(this, "El Resultado es "+ mySuma,Toast.LENGTH_LONG).show()
    }
    fun Division(view: View) {
        val myNumero: String = num1.text.toString()
        val myNumero2: String = num2.text.toString()
        val mySuma: Double = (myNumero.toInt().toDouble() / myNumero2.toInt().toDouble())
        Toast.makeText(this, "El Resultado es "+ mySuma,Toast.LENGTH_LONG).show()

    }
    fun Resta(view: View) {
        val myNumero: String = num1.text.toString()
        val myNumero2: String = num2.text.toString()
        val mySuma: Int = (myNumero.toInt() - myNumero2.toInt())
        Toast.makeText(this, "El Resultado es "+ mySuma,Toast.LENGTH_LONG).show()
    }
}