
package com.cifprodolfoucha.PSFilms;


import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.cifprodolfoucha.PSFilms.clasesAdaptadoras.MiFragmentPagerAdapter;
import com.cifprodolfoucha.PSFilms.fragments.fragmentComentarios;
import com.cifprodolfoucha.PSFilms.fragments.fragmentOtras;
import com.cifprodolfoucha.PSFilms.fragments.fragmentReparto;
import com.cifprodolfoucha.PSFilms.fragments.fragmentResumen;


public class Activity_Informacion2 extends AppCompatActivity implements fragmentResumen.OnFragmentInteractionListener, fragmentReparto.OnFragmentInteractionListener,fragmentOtras.OnFragmentInteractionListener,fragmentComentarios.OnFragmentInteractionListener, View.OnClickListener  {




    private   Toolbar toolbar;
    private int idDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_informacion2_activity);

        setToolbar("Venom (2018)");// Añadir action bar
        if (getSupportActionBar() != null) // Habilitar up button
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent i = getIntent();

        idDrawable=R.drawable.imagen_all_venom;
        CollapsingToolbarLayout collapser =
                (CollapsingToolbarLayout) findViewById(R.id.collapser);
        collapser.setTitle("Venom (2018)");

        loadImageParallax(idDrawable);// Cargar Imagen

        // Setear escucha al FAB
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showSnackBar("Opción de Chatear");
                    }
                }

        );


        /*
        ViewPager viewPager =  findViewById(R.id.viewpager1);
        viewPager.setAdapter(new MiFragmentPagerAdapter(
                getSupportFragmentManager()));



        TabLayout tabLayout = (TabLayout) findViewById(R.id.appbartabs);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        tabLayout.setupWithViewPager(viewPager);
*/



    }

    private void setToolbar(String nombre) {
        // Añadir la Toolbar
        toolbar =  findViewById(R.id.toolbarInformacion2);
        setSupportActionBar(toolbar);
        toolbar.setTitle(nombre);
        toolbar = findViewById(R.id.tb_informacion);
        toolbar.inflateMenu(R.menu.menu_informacion_toolbar);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                if (item.getItemId()==R.id.resumen){


                    fragmentResumen f = fragmentResumen.newInstance();
                   // getSupportFragmentManager().beginTransaction().replace(R.id.cambio,f).addToBackStack(null).commit();

                    FragmentManager fragmentmanager =getSupportFragmentManager();
                    //obtener una nueva transaccion
                   FragmentTransaction transaccion = fragmentmanager.beginTransaction();
                    transaccion.add(R.id.cambio,f);
                    transaccion.replace(R.id.cambio,f);
                    transaccion.addToBackStack(null);
                    transaccion.commit();
                }else if(item.getItemId()==R.id.reparto) {



                    fragmentReparto f = new fragmentReparto();
                    // getSupportFragmentManager().beginTransaction().replace(R.id.cambio2,f).addToBackStack(null).commit();

                    FragmentManager fragmentmanager =getSupportFragmentManager();
                    //obtener una nueva transaccion
                    FragmentTransaction transaccion = fragmentmanager.beginTransaction();
                    transaccion.add(R.id.cambio,f);
                    transaccion.replace(R.id.cambio,f);
                    transaccion.addToBackStack(null);
                    transaccion.commit();




                }else if(item.getItemId()==R.id.trailers) {



                    fragmentComentarios f = new fragmentComentarios();
                    // getSupportFragmentManager().beginTransaction().replace(R.id.cambio2,f).addToBackStack(null).commit();

                    FragmentManager fragmentmanager =getSupportFragmentManager();
                    //obtener una nueva transaccion
                    FragmentTransaction transaccion = fragmentmanager.beginTransaction();
                    transaccion.add(R.id.cambio,f);
                    transaccion.replace(R.id.cambio,f);
                    transaccion.addToBackStack(null);
                    transaccion.commit();




                }else if(item.getItemId()==R.id.otras) {



                    fragmentOtras f = new fragmentOtras();
                    // getSupportFragmentManager().beginTransaction().replace(R.id.cambio2,f).addToBackStack(null).commit();

                    FragmentManager fragmentmanager =getSupportFragmentManager();
                    //obtener una nueva transaccion
                    FragmentTransaction transaccion = fragmentmanager.beginTransaction();
                    transaccion.add(R.id.cambio,f);
                    transaccion.replace(R.id.cambio,f);
                    transaccion.addToBackStack(null);
                    transaccion.commit();



                }



                return false;
            }
        });



    }



    private void showSnackBar(String msg) {
        Snackbar
                .make(findViewById(R.id.coordinator), msg, Snackbar.LENGTH_LONG)
                .show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.action_settings:
                showSnackBar("Se abren los ajustes");
                return true;
            case R.id.action_add:
                showSnackBar("Añadir a contactos");
                return true;
            case R.id.action_favorite:
                showSnackBar("Añadir a favoritos");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }


    private void loadImageParallax(int id) {
        ImageView image = (ImageView) findViewById(R.id.image_paralax);
        // Usando Glide para la carga asíncrona
        Glide.with(this)
                .load(id)
                .centerCrop()
                .into(image);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onClick(View v) {

    }
}