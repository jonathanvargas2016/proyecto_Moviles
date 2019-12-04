package com.epn.proyectomoviles


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class registro_est_verif : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_est_verif)
    }

    fun siguiente(view: View){

        var intent : Intent = Intent(this, activity_navegation::class.java)
        startActivity(intent)

    }

}
