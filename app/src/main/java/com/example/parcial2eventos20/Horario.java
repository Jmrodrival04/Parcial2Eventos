package com.example.parcial2eventos20;

public class Horario {
    private String asignatura;
    private String dia;
    private String hora;

    public Horario(String asignatura, String dia, String hora) {
        this.asignatura = asignatura;
        this.dia = dia;
        this.hora = hora;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }
}
