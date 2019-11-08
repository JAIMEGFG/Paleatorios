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

    private int[] idImagenes;

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
        lanzarDados.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                //Lo que quiero ejecutar... aqui le digo que es lo que quiero que ejecuta
                for(int i=0;i<6;i++){
                    imagenDados.setImageResource(idImagenes[(int) (Math.random()*5)]);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("aaa");
                }

            }
        });
        //es un objeto que me permite ejecutar valga la regundancia un segundo hilo

    }
}
