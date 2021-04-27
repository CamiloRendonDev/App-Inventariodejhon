package com.example.inventario;

public class Productos {

    public String id;
    public String Nombre;
    public String Descripcion;
    public double Precio;

    public Productos(){

    }

    public Productos(String id, String nombre, String descripcion, double precio) {
        this.id = id;
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.Precio = precio;
    }
}
