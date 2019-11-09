package com.jaime.paleatorios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Shuffle extends AppCompatActivity
        implements RadioGroup.OnCheckedChangeListener, CompoundButton.OnCheckedChangeListener,
        ImageButton.OnClickListener {


    RadioButton sinRangoEspecifico, conRangoEspecifico;
    RadioGroup radioGroup;
    Switch repetir;
    EditText minimo,maximo,numeroDecimales,numerosTotales;
    CheckBox siDecimales;
    ImageButton cohete;
    TextView resultados;
    Random r = new Random();
    int random;
    String elementos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shuffle);
        instancias();
        acciones();

    }

    private void instancias() {
        sinRangoEspecifico = findViewById(R.id.sinRangoEspecifico);
        conRangoEspecifico = findViewById(R.id.conRangoEspecifico);
        minimo = findViewById(R.id.minimo);
        maximo = findViewById(R.id.maximo);
        siDecimales = findViewById(R.id.siDecimales);
        numeroDecimales = findViewById(R.id.numeroDecimales);
        radioGroup = findViewById(R.id.radioGroup);
        cohete = findViewById(R.id.cohete);
        resultados = findViewById(R.id.resultados);
        repetir = findViewById(R.id.repetir);
        numerosTotales = findViewById(R.id.numeroTotales);
    }

    public void acciones() {
        radioGroup.setOnCheckedChangeListener(this);
        cohete.setOnClickListener(this);
        siDecimales.setOnCheckedChangeListener(this);
        repetir.setOnCheckedChangeListener(this);



    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.conRangoEspecifico:
                maximo.setEnabled(true);
                minimo.setEnabled(true);
                break;
            case R.id.sinRangoEspecifico:
                maximo.setEnabled(false);
                minimo.setEnabled(false);
                break;
        }
    }
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (siDecimales.isChecked()){
            numeroDecimales.setEnabled(true);
        }else {
            numeroDecimales.setEnabled(false);
        }
    }

    @Override
    public void onClick(View v) {
            switch (v.getId()) {
                case R.id.cohete:
                    elementos = "";
                    if (conRangoEspecifico.isChecked()) {
                        for (int i = 0; i <(Integer.valueOf(numerosTotales.getText()
                                .toString())); i++) {
                            random = (int) ((Math.random() * ((Integer.valueOf(maximo.getText().toString()) -
                                    Integer.valueOf(minimo.getText().toString())) + 1)) +
                                    Integer.valueOf(minimo.getText().toString()));
                            elementos += random + "\n";
                        } resultados.setText(String.format("%s",elementos));

                    }else if (conRangoEspecifico.isChecked()&& repetir.isChecked()){
                        for (int i = 0; i < Integer.valueOf(numerosTotales.getText()
                                .toString()); i++) {
                            random = (int) ((Math.random() *((Integer.valueOf(maximo.getText().toString()) -
                                    Integer.valueOf(minimo.getText().toString()) + 1)) +
                                    Integer.valueOf(minimo.getText().toString())));
                            elementos += random + "\n";
                        } resultados.setText(String.format("%s",elementos));

                    }else if (sinRangoEspecifico.isChecked()) {
                        for (int i = 0; i < Integer.valueOf(numerosTotales.getText()
                                .toString()); i++) {
                            random = (int) (Math.random() * 100);
                            elementos += random + "\n";
                        }
                        resultados.setText(String.format("%s", elementos));
                    }else if (sinRangoEspecifico.isChecked()&& siDecimales.isChecked()) {
                        for (int i = 0; i < Integer.valueOf(numerosTotales.getText()
                                .toString()); i++) {
                            random = (int) (Math.random() * 100);
                            elementos += random + "\n";
                        }
                        resultados.setText(String.format("%s", elementos));
                    }else {
                        for (int i = 0; i < Integer.valueOf(numerosTotales.getText()
                                .toString()); i++) {
                            random = (int) (Math.random() * 100);
                            elementos += random + "\n";
                        } resultados.setText(String.format("%s",elementos));
                    }
            }
        }
    }


// resultados.setText(String.valueOf(random *(Integer.valueOf(numerosTotales.getText()
//      .toString()))));
//resultados.setText(String.valueOf(random));