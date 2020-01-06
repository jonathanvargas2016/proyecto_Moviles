package com.epn.proyectomoviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_detalle_servicio.*

class DetalleServicio : AppCompatActivity() {
    private lateinit var listView: ListView
    private lateinit var listViewItems: ArrayList<String>
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_servicio)



        listView = findViewById<ListView>(R.id.listaAyuda)
        listViewItems = ArrayList<String>(10)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listViewItems)
        listView.adapter = adapter
        adapter.add(R.string.servicio_detalle_ayuda1.toString())
        adapter.add(R.string.servicio_detalle_ayuda2.toString())
        adapter.add(R.string.servicio_detaller_ayuda3.toString())
        adapter.add(R.string.servicio_detalle_ayuda4.toString())
        adapter.add(R.string.servicio_detalle_ayuda5.toString())


        adapter.notifyDataSetChanged()





    }


}
