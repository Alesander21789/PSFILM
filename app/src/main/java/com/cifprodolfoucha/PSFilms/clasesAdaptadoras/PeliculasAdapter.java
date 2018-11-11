package com.cifprodolfoucha.PSFilms.clasesAdaptadoras;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
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

    class PeliculasViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPelicula;
        TextView nombrePleicula;
        TextView año;

        public PeliculasViewHolder(View itemView) {
            super(itemView);
            imgPelicula = (ImageView) itemView.findViewById(R.id.img_pelicula);
            nombrePleicula = (TextView) itemView.findViewById(R.id.nombrePelicula);
            año = (TextView) itemView.findViewById(R.id.año);
        }
    }
}