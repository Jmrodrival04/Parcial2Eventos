package com.example.parcial2eventos20;

public class Evento {
    private String nombre;
    private String descripcion;
    private String fecha;
    private String precio;

    public Evento(String nombre, String descripcion, String fecha, String precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getPrecio() {
        return precio;
    }
}
