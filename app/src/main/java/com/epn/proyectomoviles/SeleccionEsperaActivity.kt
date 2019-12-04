package com.epn.proyectomoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SeleccionEsperaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_espera)
    }

    fun serviceOk(view: View){

        var intent : Intent = Intent(this, ServicioRealizadoTimeActivity::class.java)
        startActivity(intent)

    }

}
