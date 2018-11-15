package com.cifprodolfoucha.PSFilms.clases;

import java.io.Serializable;

public class Actor implements Serializable {

    private String nombre;
    private String artista;
    private int imagen;

    public Actor(){

    }

    public Actor(String nombre, String artista, int imagen) {
        this.nombre = nombre;
        this.artista = artista;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}





























