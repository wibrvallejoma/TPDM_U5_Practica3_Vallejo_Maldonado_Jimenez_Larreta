package com.example.tpdm_u5_practica3_vallejo_maldonado_jimenez_larreta;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Informacion extends AppCompatActivity {
    TextView tit,desc;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        Intent intent = getIntent();
        String titulo = intent.getExtras().getString("Edificio");
        String descripcion = intent.getExtras().getString("Descripcion");
        String tipo = intent.getExtras().getString("tipo");

        tit = findViewById(R.id.titulo);
        desc = findViewById(R.id.descripcion);
        img = findViewById(R.id.imagen);

        tit.setText(titulo);
        desc.setText(descripcion);
        buscarImagenes(tipo);
    }

    public void buscarImagenes(String tipo){
        switch(tipo){

            case "CB":

                break;
            case "LC":

                break;
            case "UD":

                break;
            case "F":

                break;
            case "DOMO":

                break;
            case "UVP":

                break;
            case "LICBI":

                break;
            case "K":

                break;
            case "P":

                break;
            case "J":

                break;
            case "LIIA":

                break;
            case "CI":

                break;
            case "G":

                break;
            case "GP":

                break;
            case "AD":

                break;
            case "A":

                break;
            case "AP":

                break;
            case "B":

                break;
            case "BP":

                break;
            case "S":

                break;
            case "Q":

                break;
            case "X":

                break;
            case "N":

                break;
            case "M":

                break;
            case "L":

                break;
            case "H":

                break;
            case "QP":

                break;

        }

    }
}
