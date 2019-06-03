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
    ImageView img1,img2,img3;
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
        img1 = findViewById(R.id.imagen1);
        img2 = findViewById(R.id.imagen2);
        img3 = findViewById(R.id.imagen3);
        tit.setText(titulo);
        desc.setText(descripcion);
        buscarImagenes(tipo);
    }

    public void buscarImagenes(String tipo){
        switch(tipo){

            case "CB":
                img1.setImageResource(R.drawable.cb);
                img2.setImageResource(R.drawable.cb1);
                img3.setImageResource(R.drawable.cb2);

                break;
            case "LC":
                img1.setImageResource(R.drawable.lc);
                img2.setImageResource(R.drawable.lc1);
                img3.setImageResource(R.drawable.lc2);
                break;
            case "UD":
                img1.setImageResource(R.drawable.ud);
                img2.setImageResource(R.drawable.ud2);
                img3.setImageResource(R.drawable.ud1);
                break;
            case "F":
                img1.setImageResource(R.drawable.civil);
                img2.setImageResource(R.drawable.civil1);
                img3.setImageResource(R.drawable.civil2);
                break;
            case "DOMO":
                img1.setImageResource(R.drawable.domo);
                img2.setImageResource(R.drawable.domo1);
                img3.setImageResource(R.drawable.domo2);
                break;
            case "UVP":
                img1.setImageResource(R.drawable.uvp);
                img2.setImageResource(R.drawable.uvp1);
                img3.setImageResource(R.drawable.uvp2);
                break;
            case "LICBI":
                img1.setImageResource(R.drawable.licbi);
                img2.setImageResource(R.drawable.licbi1);
                img3.setImageResource(R.drawable.licbi2);
                break;
            case "K":
                img1.setImageResource(R.drawable.k);
                img2.setImageResource(R.drawable.k1);
                img3.setImageResource(R.drawable.k2);
                break;
            case "P":
                img1.setImageResource(R.drawable.audiov);
                img2.setImageResource(R.drawable.audiov1);
                img3.setImageResource(R.drawable.audiov2);
                break;
            case "J":
                img1.setImageResource(R.drawable.j);
                img2.setImageResource(R.drawable.j1);
//                img3.setImageResource(R.drawable.j2);
                break;
            case "LIIA":
                img1.setImageResource(R.drawable.lia);
                img2.setImageResource(R.drawable.lia1);
                img3.setImageResource(R.drawable.lia2);
                break;
            case "CI":
                img1.setImageResource(R.drawable.ci);
                img2.setImageResource(R.drawable.ci1);
                img3.setImageResource(R.drawable.ci2);
                break;
            case "G":
                img1.setImageResource(R.drawable.g);
                img2.setImageResource(R.drawable.g1);
                img3.setImageResource(R.drawable.g2);
                break;
            case "GP":
                img1.setImageResource(R.drawable.gprima);
                img2.setImageResource(R.drawable.gprima1);
                img3.setImageResource(R.drawable.gprima2);
                break;
            case "AD":
                img1.setImageResource(R.drawable.admin);
                img2.setImageResource(R.drawable.admin1);
                img3.setImageResource(R.drawable.admin2);
                break;
            case "A":
                img1.setImageResource(R.drawable.a);
                img2.setImageResource(R.drawable.a1);
//                img3.setImageResource(R.drawable.a2);
                break;
            case "B":
                img1.setImageResource(R.drawable.b);
                img2.setImageResource(R.drawable.b1);
                img3.setImageResource(R.drawable.b2);
                break;
            case "BP":
                img1.setImageResource(R.drawable.bprima);
                img2.setImageResource(R.drawable.bprima1);
                img3.setImageResource(R.drawable.bprima2);
                break;
            case "S":
                img1.setImageResource(R.drawable.s);
                img2.setImageResource(R.drawable.s1);
                img3.setImageResource(R.drawable.s2);
                break;
            case "Q":
                img1.setImageResource(R.drawable.q);
                img2.setImageResource(R.drawable.q1);
                img3.setImageResource(R.drawable.q2);
                break;
            case "X":
                img1.setImageResource(R.drawable.x);
                img2.setImageResource(R.drawable.x1);
                img3.setImageResource(R.drawable.x2);
                break;
            case "N":
                img1.setImageResource(R.drawable.n);
                img2.setImageResource(R.drawable.n1);
                img3.setImageResource(R.drawable.n2);
                break;
            case "M":
                img1.setImageResource(R.drawable.labq);
                img2.setImageResource(R.drawable.labq1);
                img3.setImageResource(R.drawable.labq2);
                break;
            case "L":
                img1.setImageResource(R.drawable.i);
                img2.setImageResource(R.drawable.i1);
                img3.setImageResource(R.drawable.i3);
                break;
            case "H":
                img1.setImageResource(R.drawable.h);
                img2.setImageResource(R.drawable.h1);
                img3.setImageResource(R.drawable.h2);
                break;
            case "QP":
                img1.setImageResource(R.drawable.arqui);
                img2.setImageResource(R.drawable.arqui1);
                img3.setImageResource(R.drawable.arqui2);
                break;

        }

    }
}
