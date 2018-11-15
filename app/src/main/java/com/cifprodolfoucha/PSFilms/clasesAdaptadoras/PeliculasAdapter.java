package com.cifprodolfoucha.PSFilms.clasesAdaptadoras;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cifprodolfoucha.PSFilms.Activity_Informacion2;
import com.cifprodolfoucha.PSFilms.R;
import com.cifprodolfoucha.PSFilms.clases.Pelicula;

import java.util.ArrayList;


public class PeliculasAdapter extends RecyclerView.Adapter<PeliculasAdapter.PeliculasViewHolder> {

    private ArrayList<Pelicula> data;

    public PeliculasAdapter(ArrayList<Pelicula> data) {
        this.data = data;
    }

    @Override
    public PeliculasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new PeliculasViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pelicula, parent, false));
    }

    @Override
    public void onBindViewHolder(PeliculasViewHolder holder, int position) {
        Pelicula pelicula = data.get(position);

        holder.imgPelicula.setImageResource(pelicula.getImagen());
        holder.nombrePleicula.setText(pelicula.getNombre());
        holder.año.setText(pelicula.getAño());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class PeliculasViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{

        ImageView imgPelicula;
        TextView nombrePleicula;
        TextView año;
        Context c;
        public PeliculasViewHolder(View itemView) {
            super(itemView);
            imgPelicula = (ImageView) itemView.findViewById(R.id.img_pelicula);
            nombrePleicula = (TextView) itemView.findViewById(R.id.nombrePelicula);
            año = (TextView) itemView.findViewById(R.id.año);
            c= itemView.getContext();
            setOnClickListener();
        }


        @Override
        public void onClick(View v) {

            Intent intent = new Intent(c, Activity_Informacion2.class);
            //EditText editText = (EditText) findViewById(R.id.editText);
            //String message = editText.getText().toString();
            // intent.putExtra(EXTRA_MESSAGE, message);


            intent.putExtra("nombre", nombrePleicula.getText());
            c.startActivity(intent);



        }

        void setOnClickListener() {



            imgPelicula.setOnClickListener(this);

        }
    }
}