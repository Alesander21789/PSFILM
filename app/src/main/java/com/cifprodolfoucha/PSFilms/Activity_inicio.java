package com.cifprodolfoucha.PSFilms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.cifprodolfoucha.PSFilms.clases.Pelicula;
import com.cifprodolfoucha.PSFilms.clasesAdaptadoras.PeliculasAdapter;

import java.util.ArrayList;

public class Activity_inicio extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private RecyclerView rcPeliculas;
    private GridLayoutManager glm;
    private PeliculasAdapter adapter;
    TableLayout table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_inicio_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

            rcPeliculas = findViewById(R.id.rcRecyclerView_Inicio);
            glm= new GridLayoutManager(this,2);
            rcPeliculas.setLayoutManager(glm);
            adapter = new PeliculasAdapter(dataSet());
            rcPeliculas.setAdapter(adapter);



/*
        table=(TableLayout)findViewById(R.id.tlTableLayout_Inicio);

        table.setStretchAllColumns(true);

        TableRow fila = new TableRow(this);
        //fila.setId();
        TextView vista = new TextView(this);
        vista.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista.setText("imagen 1");

        TextView vista2 = new TextView(this);
        vista2.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista2.setText("imagen 2");
        TextView vista3 = new TextView(this);
        vista3.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista3.setText("imagen 3");
        TableRow fila2 = new TableRow(this);
        //fila.setId();
        TextView vista10 = new TextView(this);
        vista10.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista10.setText("imagen 4");
        TextView vista11 = new TextView(this);
        vista11.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista11.setText("imagen 5");
        TextView vista13 = new TextView(this);
        vista13.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista13.setText("imagen 6");
        TableRow fila3 = new TableRow(this);
        //fila.setId();
        TextView vista20 = new TextView(this);
        vista20.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista20.setText("imagen 4");
        TextView vista21 = new TextView(this);
        vista21.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista21.setText("imagen 5");
        TextView vista23 = new TextView(this);
        vista23.setOnClickListener(_OnClickListener);
        //vista.setId("");
        vista23.setText("imagen 6");

        fila.addView(vista);
        fila.addView(vista2);
        fila.addView(vista3);
        fila2.addView(vista10);
        fila2.addView(vista11);
        fila2.addView(vista13);
        fila3.addView(vista20);
        fila3.addView(vista21);
        fila3.addView(vista23);
        table.addView(fila);
        table.addView(fila2);
        table.addView(fila3);

*/









    }



    private ArrayList<Pelicula> dataSet() {
        ArrayList<Pelicula> data = new ArrayList<>();

        data.add(new Pelicula(R.drawable.imagen_all_venom,"Venom",2018));
        data.add(new Pelicula(R.drawable.imagen_all_venom,"Venom",2018));
        data.add(new Pelicula(R.drawable.imagen_all_venom,"Venom",2018));
        data.add(new Pelicula(R.drawable.imagen_all_venom,"Venom",2018));
        data.add(new Pelicula(R.drawable.imagen_all_venom,"Venom",2018));

        return data;
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.inicio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
            case R.id.itImagenLogin_inicio:


                Intent intent = new Intent(this, Activity_Registro.class);
                //EditText editText = (EditText) findViewById(R.id.editText);
                //String message = editText.getText().toString();
                // intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);

                // Toast toast1 = Toast.makeText(getApplicationContext(), "Prueba ASF", Toast.LENGTH_SHORT);


                // toast1.show();

                return true;


            case R.id.itImagenRegistro_inicio:


                Intent intent2 = new Intent(this, Activity_Login.class);
                //EditText editText = (EditText) findViewById(R.id.editText);
                //String message = editText.getText().toString();
                // intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent2);

                // Toast toast1 = Toast.makeText(getApplicationContext(), "Prueba ASF", Toast.LENGTH_SHORT);


                // toast1.show();

                return true;


            default:
                return super.onOptionsItemSelected(item);

        }


    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private View.OnClickListener _OnClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(Activity_inicio.this, Activity_Informacion.class);
            //EditText editText = (EditText) findViewById(R.id.editText);
            //String message = editText.getText().toString();
            // intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);

        }

    };

}
