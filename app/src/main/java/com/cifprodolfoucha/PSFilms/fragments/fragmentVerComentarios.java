package com.cifprodolfoucha.PSFilms.fragments;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cifprodolfoucha.PSFilms.R;
import com.cifprodolfoucha.PSFilms.clases.Comentario;
import com.cifprodolfoucha.PSFilms.clasesAdaptadoras.ComentariosAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link fragmentVerComentarios.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class fragmentVerComentarios extends Fragment {
    private RecyclerView rcComentarios;
    private GridLayoutManager glm;
    private ComentariosAdapter adapter;
    private fragmentVerComentarios.OnFragmentInteractionListener mListener;
    private Activity activity;


    public fragmentVerComentarios() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_fragment_vercomentarios_activity, container, false);



        rcComentarios = view.findViewById(R.id.rvComentarios_fragmentVerComentarios);
        glm= new GridLayoutManager(activity,1);
        rcComentarios.setLayoutManager(glm);
        adapter = new ComentariosAdapter(dataSet());
        rcComentarios.setAdapter(adapter);

        return view;
    }


    private ArrayList<Comentario> dataSet() {
        ArrayList<Comentario> data = new ArrayList<>();
        data.add(new Comentario("Comentario 1", "Persona 1"));
        data.add(new Comentario("Comentario 2", "Persona 2"));
        data.add(new Comentario("Comentario 3", "Persona 3"));
        data.add(new Comentario("Comentario 4", "Persona 4"));
        data.add(new Comentario("Comentario 5", "Persona 5"));
        data.add(new Comentario("Comentario 6", "Persona 6"));
        return data;
    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
