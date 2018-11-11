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
import com.cifprodolfoucha.PSFilms.clases.Pelicula;
import com.cifprodolfoucha.PSFilms.clasesAdaptadoras.ComentariosAdapter;
import com.cifprodolfoucha.PSFilms.clasesAdaptadoras.PeliculasAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link fragmentOtras.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class fragmentOtras extends Fragment {
    private RecyclerView rcPeliculas;
    private GridLayoutManager glm;
    private PeliculasAdapter adapter;
    private OnFragmentInteractionListener mListener;
    private Activity activity;
    public static fragmentOtras newInstance() {
        fragmentOtras f = new fragmentOtras();
        return f;
    }
    public fragmentOtras() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment




        View view = inflater.inflate(R.layout.layout_fragment_otras_activity, container, false);



        rcPeliculas = view.findViewById(R.id.rcRecyclerView_Otras);
        glm= new GridLayoutManager(activity,3);
        rcPeliculas.setLayoutManager(glm);
        adapter = new PeliculasAdapter(dataSet());
        rcPeliculas.setAdapter(adapter);

        return view;


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

    private ArrayList<Pelicula> dataSet() {
        ArrayList<Pelicula> data = new ArrayList<>();

        data.add(new Pelicula(R.drawable.imagen_all_venom,"Venom",2018+""));
        data.add(new Pelicula(R.drawable.imagen_all_venom,"Venom",2018+""));
        data.add(new Pelicula(R.drawable.imagen_all_venom,"Venom",2018+""));
        data.add(new Pelicula(R.drawable.imagen_all_venom,"Venom",2018+""));
        data.add(new Pelicula(R.drawable.imagen_all_venom,"Venom",2018+""));
        data.add(new Pelicula(R.drawable.imagen_all_venom,"Venom",2018+""));
        data.add(new Pelicula(R.drawable.imagen_all_venom,"Venom",2018+""));
        data.add(new Pelicula(R.drawable.imagen_all_venom,"Venom",2018+""));
        data.add(new Pelicula(R.drawable.imagen_all_venom,"Venom",2018+""));
        data.add(new Pelicula(R.drawable.imagen_all_venom,"Venom",2018+""));
        return data;
    }
}
