package com.cifprodolfoucha.PSFilms;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.cifprodolfoucha.PSFilms.clases.Save;

import java.io.ByteArrayOutputStream;

public class Activity_CargarXml extends Activity {
    // Usado por si necesitamos diferentes permisos, para identificar cual de ellos es
    private final int CODIGO_IDENTIFICADOR=1;
    ImageView image;
    private void guardarFoto(){

    }


    //...
    private static final String imagen = "imagen";
    private Bitmap imageBitmap;
private Bundle extras;
    private static final int CAMERA_PERMISSION_REQUEST_CODE = 1;
    private static final int TARJETASD_PERMISSION_REQUEST_CODE = 2;
    private static final  int REQUEST_IMAGE_CAPTURE=1;
    //...

    private void permissionGrantedT() {
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {


        if (requestCode==REQUEST_IMAGE_CAPTURE && resultCode==RESULT_OK) {


            extras = data.getExtras();
            imageBitmap = (Bitmap) extras.get("data");

            image = findViewById(R.id.imImagen_sacarFoto);
            image.setImageBitmap(imageBitmap);


            image.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    //convertir imagen a bitmap
                    image.buildDrawingCache();
                    Bitmap bmap = image.getDrawingCache();

                    //guardar imagen
                    Save savefile = new Save();
                    savefile.SaveImage(Activity_CargarXml.this, bmap);
                    return false;
                }
            });
        }
    }





    private void permissionGrantedF() {
        //Toast.makeText(this, getString(R.string.permission_granted), Toast.LENGTH_SHORT).show();



        Intent tomarFoto= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        if (tomarFoto.resolveActivity(getPackageManager()) !=null) {

            startActivityForResult(tomarFoto, REQUEST_IMAGE_CAPTURE);

        }


        Toast.makeText(this, "Aceptado", Toast.LENGTH_SHORT).show();
    }

    private void permissionRejected() {
        Toast.makeText(this, "Rechazado", Toast.LENGTH_SHORT).show();
    }



    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cargarxml_activity);




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
                        permissionGrantedF();
                    }

                }
            }
        });

    }



    public void onSaveInstanceState(Bundle savedInstanceState) {


        // Save in savedInstanceState.
       // ByteArrayOutputStream stream = new ByteArrayOutputStream();
       // imageBitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
       // byte[] byteArray = stream.toByteArray();
       // savedInstanceState.putByteArray("image",byteArray);
        savedInstanceState.putParcelable("BitmapImage",imageBitmap);
        super.onSaveInstanceState(savedInstanceState);



    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {

        if(savedInstanceState != null) {
         //   byte[] byteArray = savedInstanceState.getByteArray("image");
         //   Bitmap bit = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
          //  image.setImageBitmap(bit);

            Bitmap bitmapimage = savedInstanceState.getParcelable("BitmapImage");
            image = findViewById(R.id.imImagen_sacarFoto);
            image.setImageBitmap(bitmapimage);
        }

        super.onRestoreInstanceState(savedInstanceState);


        }



}
