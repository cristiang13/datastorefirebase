package com.example.casa.storecloud.models;

/**
 * Created by Casa on 04/04/2017.
 */

public class Usuario {

    private String identificacion;
    private String nombres;
    private String apellidos;
    private String telefono;


    public Usuario() {
    }

    public Usuario( String nombres, String apellidos, String telefono) {

        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}
