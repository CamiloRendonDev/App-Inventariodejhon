package com.example.inventario;

import java.util.HashMap;

public class Mesero {
    public String id;
    public String nombre;
    public HashMap<String,Boolean> carrito ;

    public Mesero(){

    }

    public Mesero(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.carrito = new HashMap<>();
    }
}
