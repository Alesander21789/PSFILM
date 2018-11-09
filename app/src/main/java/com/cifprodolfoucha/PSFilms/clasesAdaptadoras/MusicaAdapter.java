package com.cifprodolfoucha.PSFilms.clasesAdaptadoras;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.cifprodolfoucha.PSFilms.R;
import com.cifprodolfoucha.PSFilms.clases.Actor;

import java.util.ArrayList;


public class MusicaAdapter extends RecyclerView.Adapter<MusicaAdapter.MusicaViewHolder>{

    private ArrayList<Actor> data;

    public MusicaAdapter(ArrayList<Actor> data) {
        this.data = data;
    }

    @Override
    public MusicaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new MusicaViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_actores, parent, false));
    }

    @Override
    public void onBindViewHolder(MusicaViewHolder holder, int position) {
        Actor actor = data.get(position);
        holder.imgMusica.setImageResource(actor.getImagen());
        holder.tvNombre.setText(actor.getNombre());
        holder.tvArtista.setText(actor.getArtista());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MusicaViewHolder extends RecyclerView.ViewHolder{

        ImageView imgMusica;
        TextView tvNombre;
        TextView tvArtista;

        public MusicaViewHolder(View itemView) {
            super(itemView);
            imgMusica = (ImageView) itemView.findViewById(R.id.img_musica);
            tvNombre = (TextView) itemView.findViewById(R.id.tv_nombre);
            tvArtista = (TextView) itemView.findViewById(R.id.tv_artista);
        }
    }
}