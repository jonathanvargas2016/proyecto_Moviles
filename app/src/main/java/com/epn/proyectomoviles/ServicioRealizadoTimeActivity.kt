package com.epn.proyectomoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ServicioRealizadoTimeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servicio_realizado_time)
    }

    fun serviceFinish(view: View){

        var intent : Intent = Intent(this, ServicioRealizadoActivity::class.java)
        startActivity(intent)
    }
}
