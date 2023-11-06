package com.example.alquiler_vehiculos.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.alquiler_vehiculos.Vehicle
import com.example.alquiler_vehiculos.databinding.ItemVehicleBinding

class VehicleViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val binding = ItemVehicleBinding.bind(view)
    fun render(vehicleModel: Vehicle) {
        binding.modelVehicle.text = vehicleModel.model
        binding.numPlazas.text = vehicleModel.numPlazas
        binding.capacidadVehicle.text = vehicleModel.capacidad
        // IMPORTANTE. Las imágenes se verán únicamente si el dispositivo en el que se
        // va a probar la aplicación tiene conexión a internet
        // puesto que las imagenes que proporciono no empiezan por data image
        Glide.with(binding.imgVehicle.context).load(vehicleModel.photo).into(binding.imgVehicle)
    }
}