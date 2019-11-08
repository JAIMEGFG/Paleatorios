package com.jaime.paleatorios;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton dices, shuffle, award;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void instancias() {
        dices = findViewById(R.id.dices);
        shuffle = findViewById(R.id.shuffle);
        award = findViewById(R.id.award);

    }

    private void acciones() {
        dices.setOnClickListener(this);
        shuffle.setOnClickListener(this);
        award.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.dices:
                Intent intent1 = new Intent(getApplicationContext(), Dices.class);
                startActivity(intent1);
                //intent1.putExtra(tag,);
                //startactivityforresult(codigo de arranque,intent1);
                //onactivityresult(,codigo1,codigo2,intent1)
                Toast.makeText(getApplicationContext(), "Vamos a jugar a los DADOS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.award:
                Intent intent2 = new Intent(getApplicationContext(), Award.class);
                startActivity(intent2);
                Toast.makeText(getApplicationContext(), "Vamos a jugar a que has ganado", Toast.LENGTH_SHORT).show();
                break;
            case R.id.shuffle:
                Intent intent3 = new Intent(getApplicationContext(), Shuffle.class);
                startActivity(intent3);
                Toast.makeText(getApplicationContext(), "Vamos a jugar a liarla", Toast.LENGTH_SHORT).show();
                break;

        }
    }

}
