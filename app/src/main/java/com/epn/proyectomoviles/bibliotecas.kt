package com.epn.proyectomoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView

class bibliotecas : AppCompatActivity(), AdapterView.OnItemClickListener  {


    private lateinit var listView: ListView
    private lateinit var imagen_AdapterBi : ImageAdapterBi


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bibliotecas)

        listView = findViewById(R.id.idListaBib)
        listView.setOnItemClickListener(this)
        imagen_AdapterBi  = ImageAdapterBi(this)
        listView!!.adapter = imagen_AdapterBi

        imagen_AdapterBi.notifyDataSetChanged()

    }


    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }
}
