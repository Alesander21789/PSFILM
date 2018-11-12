package com.cifprodolfoucha.PSFilms;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Toast;

public class sacarFoto extends Activity implements View.OnClickListener {
    // Usado por si necesitamos diferentes permisos, para identificar cual de ellos es
    private final int CODIGO_IDENTIFICADOR=1;

    private void guardarFoto(){

    }


    //...
    private static final int CAMERA_PERMISSION_REQUEST_CODE = 1;
    private static final int SENSOR_PERMISSION_REQUEST_CODE = 2;
    //...

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCameraPermission:
                //Verifica si el permiso de la cámara no está concedido
                Toast.makeText(this, "No funciona", Toast.LENGTH_SHORT).show();
                if ((Build.VERSION.SDK_INT >= 24)) {
                    Toast.makeText(this, "No funciona", Toast.LENGTH_SHORT).show();
                if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                    //Si el permiso no se encuentra concedido se solicita
                   requestPermissions(new String[]{Manifest.permission.CAMERA}, CAMERA_PERMISSION_REQUEST_CODE);
                } else {
                    //Si el permiso esá concedico prosigue con el flujo normal
                    permissionGranted();
                }
            }else {

                    Toast.makeText(this, "No funciona", Toast.LENGTH_SHORT).show();


                }
                break;
            case R.id.btnSensorPermission:
                //Verifica si el permiso de los sensores no está concedido
                if (checkSelfPermission(Manifest.permission.BODY_SENSORS) != PackageManager.PERMISSION_GRANTED) {
                    //Si el permiso no se encuentra concedido se solicita
                    requestPermissions( new String[]{Manifest.permission.BODY_SENSORS}, SENSOR_PERMISSION_REQUEST_CODE);
                } else {
                    //Si el permiso está concedido prosigue con el flujo normal
                    permissionGranted();
                }
                break;
        }
    }

    private void permissionGranted() {
        //Toast.makeText(this, getString(R.string.permission_granted), Toast.LENGTH_SHORT).show();


        Toast.makeText(this, "Aceptado", Toast.LENGTH_SHORT).show();
    }

    private void permissionRejected() {
        Toast.makeText(this, "Rechazado", Toast.LENGTH_SHORT).show();
    }


  /*  private void xestionarEventos(){

        Button boton = (Button)findViewById(R.id.UD12_01_btnChamar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Build.VERSION.SDK_INT>=23){
                    int permiso = checkSelfPermission(Manifest.permission.CALL_PHONE);
                    if (permiso ==PackageManager.PERMISSION_GRANTED){
                        guardarFoto();
                    }
                    else{
                        sacarFoto.this.requestPermissions( new String[]{Manifest.permission.CALL_PHONE},CODIGO_IDENTIFICADOR);
                    }

                }
            }
        });


    }


    */
  @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_sacarfoto_activity);



        Button boton = (Button)findViewById(R.id.btnCameraPermission);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((Build.VERSION.SDK_INT >= 24)) {

                    if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                        //Si el permiso no se encuentra concedido se solicita
                        requestPermissions(new String[]{Manifest.permission.CAMERA}, CAMERA_PERMISSION_REQUEST_CODE);
                    } else {
                        //Si el permiso esá concedico prosigue con el flujo normal
                        permissionGranted();
                    }

                }
            }
        });

    }

  @Override
  public void onRequestPermissionsResult(int requestCode, String[] permissions,  int[] grantResults) {
      super.onRequestPermissionsResult(requestCode, permissions, grantResults);
      //Se obtiene el resultado de los permisos con base en la clave
      switch (requestCode) {
          case CAMERA_PERMISSION_REQUEST_CODE:
              //Se verifica si existen resultados y se valida si el permiso fue concedido o no
              if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                  //Si el permiso está concedido prosigue con el flujo normal
                  permissionGranted();
              } else {
                  //Si el permiso no fue concedido no se puede continuar
                  permissionRejected();
              }
              break;
          case SENSOR_PERMISSION_REQUEST_CODE:
              //Se verifica si existen resultados y se valida si el permiso fue concedido o no
              if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                  //Si el permiso está concedido prosigue con el flujo normal
                  permissionGranted();
              } else {
                  //Si el permiso no fue concedido no se puede continuar
                  permissionRejected();
              }
              break;
      }
    }





}
