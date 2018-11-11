package com.cifprodolfoucha.PSFilms.clases;

public class Pelicula {


   private int imagen;
   private String nombre;
   private String año;

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public Pelicula(int imagen, String nombre, String año) {

        this.imagen = imagen;
        this.nombre = nombre;
        this.año = año;
    }
}
