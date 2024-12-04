package com.example.parcial2eventos20;

public class Farmacia {
    private String nombre;
    private String telefono;
    private String direccion;

    public Farmacia(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
}
