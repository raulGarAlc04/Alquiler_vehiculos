package com.example.alquiler_vehiculos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.alquiler_vehiculos.adapter.VehicleAdapter
import com.example.alquiler_vehiculos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val cuadroDialogo = CuadroDialogo()

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        binding.recyclerVehiculo.layoutManager= LinearLayoutManager(this)
        binding.recyclerVehiculo.adapter = VehicleAdapter(VehicleProvider.vehiclelist)

        binding.bMostrar.setOnClickListener() {
            // Cuando pulsemos sobre el boton de mostrar
            // Cambiaremos la propiedad del recycler view de invisible a visible
            binding.recyclerVehiculo.visibility = View.VISIBLE
        }

        binding.bGuardar.setOnClickListener() {
            // Mostramos el cuadro de dialogo de guardado
            cuadroDialogo.show(supportFragmentManager, "Cuadro_dialogo")
        }
    }
}