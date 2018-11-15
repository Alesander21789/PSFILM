package com.cifprodolfoucha.PSFilms.clases;

import com.cifprodolfoucha.PSFilms.R;


import java.util.ArrayList;

public class Contenedor {



    private static ArrayList<Contenido> peliculas = new ArrayList();
    private ArrayList<Actor> actores = new ArrayList();
    private ArrayList<Comentario> comentarios = new ArrayList();


    public static void llenarArray(Contenido c) {



        peliculas.add(c);



    }


    public static Contenido devolverCotenido (String nombre) {
        Contenido contenido = new Contenido();


        for (Contenido c : peliculas) {


           if(c.getNombre().compareTo(nombre)==0){



             return  contenido=c;


           }


        }



        return contenido;
    }



   private void llenar () {

        String resumen="El periodista Eddie Brock está investigando a Carlton Drake," +
                " el célebre fundador de Life Foundation. Brock establece una simbiosis con un ente alienígena que le ofrece superpoderes," +
                " pero el ser se apodera de su personalidad y le vuelve perverso.";

        String comentario = "Es mi opinion,pero a mi Venom me ha encantado.Entretenida en todo momento,tiene humor,tiene accion,y la relacion de Venom y Eddie es interesante" +
                " y a la vez bonita.Tom hardy,como siempre,a hecho un buen papel y ha sabido interpretar su personaje" +
                ".A mi me da igual las malas críticas de esta pelicula.Para mi,Venom,es una muy buena pelicula";
       actores.add(new Actor("Tom Hardy", "Eddie Brock", R.drawable.imagen_all_venom));
       actores.add(new Actor("Michelle Williams", "Anne Weying", R.drawable.imagen_all_venom));
       actores.add(new Actor("Riz Ahmed", "Riot", R.drawable.imagen_all_venom));
       actores.add(new Actor("Scott Haze", "Roland Treece", R.drawable.imagen_all_venom));
       actores.add(new Actor("Reid Scott", "Dr. Dan Lewis", R.drawable.imagen_all_venom));
       actores.add(new Actor("Jenny Slate", "Dora Skirth", R.drawable.imagen_all_venom));

        comentarios.add(new Comentario(comentario,"aasda"));




        Contenido c = new Contenido(R.drawable.imagen_all_venom,"Venom 2018","2018",resumen,"Heroes",actores,comentarios);


   }

}
