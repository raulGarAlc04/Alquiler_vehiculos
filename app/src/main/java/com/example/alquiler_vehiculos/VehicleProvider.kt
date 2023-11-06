package com.example.alquiler_vehiculos

class VehicleProvider {
    // Datos de los vehiculos
    companion object {
        val vehiclelist = listOf<Vehicle>(
            Vehicle(
                model = "Carrozado con trampilla",
                numPlazas = "3 plazas",
                capacidad = "20 M3",
                photo = "https://blanauto.com/sites/default/files/inline-images/vehiculos-carrozados-002.jpg"
            ),
            Vehicle(
                model = "Carrozado sin trampilla",
                numPlazas = "3 plazas",
                capacidad = "20 M3",
                photo = "https://blanauto.com/sites/default/files/inline-images/vehiculos-carrozados-002.jpg"
            ),
            Vehicle(
                model = "Furgoneta grande",
                numPlazas = "3 plazas",
                capacidad = "15 M3",
                photo = "https://blanauto.com/sites/default/files/inline-images/mercedes-sprinter.png.jpg"
            ),
            Vehicle(
                model = "Furgoneta mediana",
                numPlazas = "3 plazas",
                capacidad = "8 M3",
                photo = "https://blanauto.com/sites/default/files/inline-images/1539849303199.jpg"
            ),
            Vehicle(
                model = "Furgoneta pequeña",
                numPlazas = "2 plazas",
                capacidad = "4 M3",
                photo = "https://blanauto.com/sites/default/files/inline-images/mercedes_benz_citan_long_diesel_109cdi_van_2013_front_three_quarter.jpeg"
            )
        )
    }
}