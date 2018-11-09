package com.cifprodolfoucha.PSFilms.clases;

public class Comentario {


    String comentario;
    String perosna;

    public Comentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "comentario='" + comentario + '\'' +
                ", perosna='" + perosna + '\'' +
                '}';
    }

    public String getPerosna() {
        return perosna;
    }

    public void setPerosna(String perosna) {
        this.perosna = perosna;
    }

    public Comentario(String comentario, String perosna) {

        this.comentario = comentario;
        this.perosna = perosna;
    }

    public String getComentario() {

        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
