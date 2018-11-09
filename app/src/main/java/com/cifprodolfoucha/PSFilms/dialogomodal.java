package com.cifprodolfoucha.PSFilms;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;


public class dialogomodal extends DialogFragment {


    Button btn;
    ListView lv;
    SearchView sv;
    ArrayAdapter<String> adapter;
    String[] players={"Lionel Messi","Christiano Ronaldo","Neymar","Gareth Bale"};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {




        View rootView=inflater.inflate(R.layout.dialogomodal, null);



        getDialog().setTitle("Best Players In The World");

        //BUTTON,LISTVIEW,SEARCHVIEW INITIALIZATIONS
        lv=(ListView) rootView.findViewById(R.id.listView1);
        sv=(SearchView) rootView.findViewById(R.id.searchView1);
        btn=(Button) rootView.findViewById(R.id.cerrar);


        //CREATE AND SET ADAPTER TO LISTVIEW
        adapter=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,players);
        lv.setAdapter(adapter);

        //SEARCH
        sv.setQueryHint("Search..");
        sv.setQueryHint("Search..");
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String txt) {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public boolean onQueryTextChange(String txt) {
                // TODO Auto-generated method stub

                adapter.getFilter().filter(txt);
                return false;
            }
        });

        //BUTTON
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                dismiss();
            }
        });




        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getContext(),players[position].toString(),Toast.LENGTH_SHORT).show();

                dismiss();
            }
        });




        return rootView;
    }




}
