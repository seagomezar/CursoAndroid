package com.example.admin.clase_personificador;

/**
 * Created by admin on 30/07/2014.
 */
public class Persona {
    private String Nombre;
    private String Titulo;
    private String Descripcion;
    private int Imagen;

    public Persona(String nombre, int imagen, String titulo, String descripcion) {
        Nombre = nombre;
        Titulo = titulo;
        Descripcion = descripcion;
        Imagen = imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }
}
