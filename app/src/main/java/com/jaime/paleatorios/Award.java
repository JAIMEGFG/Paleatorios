package com.jaime.paleatorios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Award extends AppCompatActivity implements Button.OnClickListener {
    ArrayList<String> ArrayJugadores = new ArrayList<String>();
    Button agregarConcursante, generarGanador,borrarJugadores;
    TextView jugadores, ganador;
    EditText nombre;
    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_award);
        instancias();
        acciones();
    }

    private void instancias() {
        ArrayJugadores = new ArrayList();
        agregarConcursante = findViewById(R.id.agregarConcursante);
        generarGanador = findViewById(R.id.generarGanador);
        jugadores = findViewById(R.id.jugadores);
        ganador = findViewById(R.id.ganador);
        nombre = findViewById(R.id.nombre);
        borrarJugadores = findViewById(R.id.borrarJugadores);

    }

    private void acciones() {
        agregarConcursante.setOnClickListener(this);
        generarGanador.setOnClickListener(this);
        borrarJugadores.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.agregarConcursante:
                ArrayJugadores.add(nombre.getText().toString());
                jugadores.setText(String.valueOf(ArrayJugadores));
                nombre.setText("");
                break;
            case R.id.generarGanador:
                Random rand = new Random();
                //return list.get(rand.nextInt(list.size()));
                String randomNombre = ArrayJugadores.get(rand.nextInt(ArrayJugadores.size()));
                ganador.setText(randomNombre);
                break;
            case R.id.borrarJugadores:
                nombre.setText("");
                jugadores.setText("");
                ganador.setText("");



        }
    }
}
