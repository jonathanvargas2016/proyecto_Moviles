package com.epn.proyectomoviles

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class registroEstudiante : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_estudiante)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT


    }

    fun siguiente(view: View){

        var intent : Intent = Intent(this, registro_est_celular::class.java)
        startActivity(intent)
    }
}
