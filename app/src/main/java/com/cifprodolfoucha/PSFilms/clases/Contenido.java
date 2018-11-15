package com.cifprodolfoucha.PSFilms.clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Contenido implements Serializable {


    private int imagen;
    private String nombre;

    public Contenido(int imagen, String nombre, String año, String resumen, String tipo, ArrayList<Actor> actores, ArrayList<Comentario> comentarios) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.año = año;
        this.resumen = resumen;
        this.tipo = tipo;
        this.actores = actores;
        this.comentarios = comentarios;
    }


    public  Contenido() {



    }
    public String getResumen() {
        return resumen;

    }

    public Contenido(int imagen) {
        this.imagen = imagen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public ArrayList<Actor> getActores() {
        return actores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setActores(ArrayList<Actor> actores) {
        this.actores = actores;
    }

    private String año;

    private String resumen;

    private String tipo;

    private ArrayList<Actor> actores = new ArrayList();

    private ArrayList<Comentario> comentarios = new ArrayList();

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

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





    public Contenido(int imagen, String nombre, String año) {

        this.imagen = imagen;
        this.nombre = nombre;
        this.año = año;
    }



}



