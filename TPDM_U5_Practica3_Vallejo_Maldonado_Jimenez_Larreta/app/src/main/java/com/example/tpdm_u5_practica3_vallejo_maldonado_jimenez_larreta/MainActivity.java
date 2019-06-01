package com.example.tpdm_u5_practica3_vallejo_maldonado_jimenez_larreta;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button CB,LSC,UD,F,DOMO,UVP,LICBI,K,P,J,LIIA,CI,
            G,G_Prima,AD,A,A_Prima,B,B_Prima,S,Q,X,N,M,
            L,H,Q_Prima;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);



        CB = findViewById(R.id.CB);
        LSC = findViewById(R.id.LSC);
        UD = findViewById(R.id.UD);
        F = findViewById(R.id.F);
        DOMO = findViewById(R.id.DOMO);
        UVP = findViewById(R.id.UVP);
        LICBI = findViewById(R.id.LICBI);
        K = findViewById(R.id.K);
        P = findViewById(R.id.P);
        J = findViewById(R.id.J);
        LIIA = findViewById(R.id.LIIA);
        CI = findViewById(R.id.CI);
        G = findViewById(R.id.G);
        G_Prima = findViewById(R.id.G_Prima);
        AD = findViewById(R.id.AD);
        A = findViewById(R.id.A);
        A_Prima = findViewById(R.id.A_Prima);
        B = findViewById(R.id.B);
        B_Prima = findViewById(R.id.B_Prima);
        S = findViewById(R.id.S);
        Q = findViewById(R.id.Q);
        X = findViewById(R.id.X);
        N = findViewById(R.id.N);
        M = findViewById(R.id.M);
        L = findViewById(R.id.L);
        H = findViewById(R.id.H);
        Q_Prima = findViewById(R.id.Q_Prima);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        int height = metrics.heightPixels;
        int width = metrics.widthPixels;

        System.out.println("width: "+width);
        System.out.println("height: "+height);

        CB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar("Bastón","Tiene forma de baston. Area de ciencias basicas y oficinas del departamento de civil. (ya no da puente)...","CB");
            }
        });
        LSC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar("Laboratorio de computo.","Se encuentra el laboratorio de cisco.","LC");
            }
        });
        UD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar("UD","Se encuentran las oficinas de los maestros de las carreras: ISC-ITIC,IM-IE,II. Tambien esta el laboratorio de matematicas y las oficinas del departamento de desarrollo academico.","UD");
            }
        });
        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar("Laboratorio de Civir y Elécrtica","Lo comparten estan dos carreras","F");
            }
        });
        DOMO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        UVP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar("Vinculacion y posgrado.","Estan las aulas para la maestria en tics ademas se imparten clases de ingles en la planta baja. En la planta alta esta un \"laboratorio de computo\"","UVP");
            }
        });
        LICBI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar("LICBI.","estan los robotses y dan conferencias y certificados cisco ","LICBI");
            }
        });
        K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar("Edificio K","Esta la cafeteria de doña paz, y algo de los maestros","K");
            }
        });
        P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar("Edificio J","Se sacan copias y Ploteo de planos","J");
            }
        });
        LIIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar("LIIA","Maistria y doctorado en alimentos.","LIIA");
            }
        });
        CI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar("Centro de Información","Biblioteca","CI");
            }
        });
        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        G_Prima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        AD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar("AD","Se pagan las incripciones, estan los coordinadores de todas las carreras esta el centro de computo, estan servicios escolares direccion y subdireccion.","AD");
            }
        });
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        A_Prima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        B_Prima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar("Lab de Industrial y Meca","Creemos","BP");
            }
        });
        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar("Cesa","Cesa Tepic","S");
            }
        });
        Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar("Laboratorio de Química","Laboratorio de Química(lo que te falta con ella)","M");
            }
        });
        L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar("Laboratorio de Industrial","Laboratorio de la carrera de Ingeniería Industrial","L");
            }
        });
        H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Q_Prima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar("Departamento de Arquitectura","Departamento de los de Arqui","QP");
            }
        });

    }

    public void entrar(String titulo, String descripcion,String tipo){
        Intent e = new Intent(this,Informacion.class);

        e.putExtra("Edificio",titulo);
        e.putExtra("Descripcion",descripcion);
        e.putExtra("tipo",tipo);
        startActivity(e);
    }


}
