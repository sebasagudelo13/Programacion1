package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.LinkedList;

public class Soldado {
    private String idSoldado;
    private String nombreSoldado;
    private int edadSoldado;
    private boolean disponible;
    private Especialidad especialidad;
    private Rango rango;


    public Soldado(String idSoldado, String nombreSoldado, int edadSoldado,boolean disponible,Especialidad especialidad,Rango rango) {
        this.idSoldado = idSoldado;
        this.nombreSoldado = nombreSoldado;
        this.edadSoldado = edadSoldado;
        this.disponible = disponible;
        this.especialidad = especialidad;
        this.rango = rango;

    }


    public String getIdSoldado() {
        return idSoldado;
    }

    public void setIdSoldado(String idSoldado) {
        this.idSoldado = idSoldado;
    }

    public String getNombreSoldado() {
        return nombreSoldado;
    }

    public void setNombreSoldado(String nombreSoldado) {
        this.nombreSoldado = nombreSoldado;
    }

    public int getEdadSoldado() {
        return edadSoldado;
    }

    public void setEdadSoldado(int edadSoldado) {
        this.edadSoldado = edadSoldado;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Rango getRango() {
        return rango;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Soldado{" +
                "idSoldado='" + idSoldado + '\'' +
                ", nombreSoldado='" + nombreSoldado + '\'' +
                ", edadSoldado=" + edadSoldado +
                ", disponible=" + disponible +
                ", especialidad=" + especialidad +
                ", rango=" + rango +
                '}';
    }
}
