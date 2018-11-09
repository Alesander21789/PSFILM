package com.cifprodolfoucha.PSFilms.clasesAdaptadoras;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cifprodolfoucha.PSFilms.R;
import com.cifprodolfoucha.PSFilms.clases.Comentario;
import com.cifprodolfoucha.PSFilms.dialogomodal;

import java.util.ArrayList;


public class ComentariosAdapter extends RecyclerView.Adapter<ComentariosAdapter.ComentariosViewHolder> {
    private ArrayList<Comentario> data;






    final dialogomodal frag = new dialogomodal();

    public ComentariosAdapter(ArrayList<Comentario> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ComentariosViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {




        return new ComentariosViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.comentarioslista, viewGroup,false));
    // return new ComentariosViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.comentarioslista, viewGroup, false));


    }

    @Override
    public void onBindViewHolder(@NonNull ComentariosViewHolder holder, int i) {
Comentario comentario= data.get(i);

holder.comentario.setText(comentario.getComentario());
holder.nombre.setText(comentario.getPerosna());




//Eventos
holder.setOnLongClickListener();


    }



    @Override
    public int getItemCount() {
        return data.size();
    }




    class ComentariosViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener{
        final dialogomodal frag = new dialogomodal();
       // final FragmentManager fragmentmanager =getSupportFragmentManager();
    TextView comentario;
    TextView nombre;
        Context contexto=null;
    private TextView text;


        public ComentariosViewHolder( View itemView) {
            super(itemView);
          contexto=  itemView.getContext();
            text=(TextView) itemView.findViewById(R.id.comentarios);

    comentario =(TextView)itemView.findViewById(R.id.comentarios);
    nombre = (TextView)itemView.findViewById(R.id.autor);



        }
void setOnLongClickListener() {



            comentario.setOnLongClickListener(this);
            nombre.setOnLongClickListener(this);
}

        @Override
        public boolean onLongClick(View v) {


            switch (v.getId()) {



                case R.id.comentarios:

                    Intent intent = new Intent(contexto,dialogomodal.class);
                    contexto.startActivity(intent);


                    break;

                case R.id.autor:


                    break;




            }
            return false;
        }
    }
}
