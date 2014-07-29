package com.example.admin.clase_animales;

/**
 * Created by admin on 29/07/2014.
 */
public class animalito
{
    private String nombre;
    private String descripcion;
    private int imagen;

    public animalito(int imagen,String nombre, String descripcion ) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
