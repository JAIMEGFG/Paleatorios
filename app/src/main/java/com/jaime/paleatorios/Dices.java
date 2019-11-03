package com.jaime.paleatorios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Dices extends AppCompatActivity implements View.OnClickListener {

    Button lanzarDados;
    ImageView imagenDados;
    private int[] idImagenes = idImagenes.toArray();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dices);
        instancias();
        acciones();

    }

    private void instancias() {
        lanzarDados = findViewById(R.id.lanzarDados);
        imagenDados = findViewById(R.id.imagenDados);
        idImagenes = new int[]{R.drawable.uno,R.drawable.dos,R.drawable.tres,R.drawable.cuatro,
                R.drawable.cinco,R.drawable.seis};

    }

    private void acciones() {
        lanzarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagenDados.setImageDrawable(getDrawable(R.drawable.idImagenes[0]));
            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Lo que quiero ejecutar... aqui le digo que es lo que quiero que ejecute
                imagenDados.setImageDrawable(getDrawable(idImagenes[2]));
            }
        },6000);
        //es un objeto que me permite ejecutar valga la regundancia un segundo hilo

    }

    @Override
    public void onClick(View v) {

    }
}
