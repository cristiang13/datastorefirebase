package com.example.casa.storecloud.models;

/**
 * Created by Casa on 07/04/2017.
 */

public class Comida {
    private String id;
    private  String nombre,resumen,precio,foto;

    public Comida() {
    }

    public Comida( String nombre, String resumen, String precio) {

        this.nombre = nombre;
        this.resumen = resumen;
        this.precio = precio;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
