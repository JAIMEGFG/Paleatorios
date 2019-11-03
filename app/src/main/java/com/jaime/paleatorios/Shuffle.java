package com.jaime.paleatorios;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Shuffle extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener,
        ImageButton.OnClickListener {


    RadioButton sinRangoEspecifico, conRangoEspecifico;
    RadioGroup radioGroup;
    EditText minimo,maximo,numeroDecimales;
    CheckBox siDecimales;
    ImageButton cohete;
    TextView resultados;
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
    }

    public void acciones() {
        radioGroup.setOnCheckedChangeListener(this);
        cohete.setOnClickListener(this);


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
    public void onClick(View v) {
        Random r = new Random();
        int i1 = r.nextInt(100-50) + 50;

        }

    }
