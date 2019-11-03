package com.jaime.paleatorios;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Dices extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {


    RadioButton sinRangoEspecifico, conRangoEspecifico;
    RadioGroup radioGroup;
    EditText minimo,maximo,numeroDecimales;
    CheckBox siDecimales;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dices);
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
    }

    public void acciones() {
        radioGroup.setOnCheckedChangeListener(this);


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


}
