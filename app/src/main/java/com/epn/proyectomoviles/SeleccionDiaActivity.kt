package com.epn.proyectomoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SeleccionDiaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_dia)
    }

    fun selectH(view: View){

        var intent : Intent = Intent(this, SeleccionHorarioActivity::class.java)
        startActivity(intent)

    }
}
