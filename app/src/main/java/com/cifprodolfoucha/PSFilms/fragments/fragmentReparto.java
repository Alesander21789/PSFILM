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
import com.cifprodolfoucha.PSFilms.clases.Actor;
import com.cifprodolfoucha.PSFilms.clasesAdaptadoras.MusicaAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link fragmentReparto.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class fragmentReparto extends Fragment {
    private RecyclerView rvMusicas;
    private GridLayoutManager glm;
    private MusicaAdapter adapter;
    private OnFragmentInteractionListener mListener;
    private Activity activity;


    public static fragmentReparto newInstance() {
        fragmentReparto f = new fragmentReparto();
        return f;
    }


    public fragmentReparto() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.layout_fragment_reparto_activity, container, false);


        rvMusicas = (RecyclerView) view.findViewById(R.id.rcRecyclerView_Reparto);

        glm = new GridLayoutManager(activity, 2);
        rvMusicas.setLayoutManager(glm);
        adapter = new MusicaAdapter(dataSet());
        rvMusicas.setAdapter(adapter);



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


    private ArrayList<Actor> dataSet() {
        ArrayList<Actor> data = new ArrayList<>();
        data.add(new Actor("Tom Hardy", "Eddie Brock", R.drawable.imagen_all_venom));
        data.add(new Actor("Michelle Williams", "Anne Weying", R.drawable.imagen_all_venom));
        data.add(new Actor("Riz Ahmed", "Riot", R.drawable.imagen_all_venom));
        data.add(new Actor("Scott Haze", "Roland Treece", R.drawable.imagen_all_venom));
        data.add(new Actor("Reid Scott", "Dr. Dan Lewis", R.drawable.imagen_all_venom));
        data.add(new Actor("Jenny Slate", "Dora Skirth", R.drawable.imagen_all_venom));
        return data;
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
