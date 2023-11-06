package com.example.alquiler_vehiculos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.alquiler_vehiculos.R
import com.example.alquiler_vehiculos.Vehicle

class VehicleAdapter(val vehicleList: List<Vehicle>): RecyclerView.Adapter<VehicleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehicleViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return VehicleViewHolder(layoutInflater.inflate(R.layout.item_vehicle,parent,false))
    }

    override fun getItemCount(): Int {
        return vehicleList.size
    }

    override fun onBindViewHolder(holder: VehicleViewHolder, position: Int) {
        val item = vehicleList[position]
        holder.render(item)
    }
}