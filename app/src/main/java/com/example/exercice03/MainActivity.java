package com.example.exercice03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText et_nombre;
    Button btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        et_nombre = findViewById(R.id.et_nombre);
        btn_ok = findViewById(R.id.btn_ok);


        btn_ok.setOnClickListener(new View.OnClickListener() {
            final int min = 10;
            final int max = 30;

            int rand = new Random().nextInt(max + 1 - min) + min;

            @Override
            public void onClick(View view) {
                try {
                    if (Integer.parseInt(String.valueOf(et_nombre.getText())) < rand) {
                        Toast.makeText(MainActivity.this, "NON", Toast.LENGTH_SHORT).show();
                    } else if (Integer.parseInt(String.valueOf(et_nombre.getText())) > rand) {
                        Toast.makeText(MainActivity.this, "NON", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "BRAVO", Toast.LENGTH_SHORT).show();
                        rand = new Random().nextInt(max - 1 + min) + min;
                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Vous devez saisir un entier !!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}