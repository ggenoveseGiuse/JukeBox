package com.example.jukebox_genovese5ai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    TextView text1;
    Button cambiaActivity;
    int n; //numero random


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        EditText txtNome = findViewById(R.id.txtNome);
        // file R.java è un file dove finiscono tutti i puntatori
        // relativi agli oggetti istanziati

        Button btnInvia = findViewById(R.id.btnInvia);
        Button btnRandom = findViewById(R.id.btnRandom);
        Button btnAvvia = findViewById(R.id.btnAvvia);

        // associare un'altro oggeetto all'ascoltatore
        // l'ascoltatore è una classe anonima
        btnInvia.setOnClickListener(new View.OnClickListener() {    // classe astratta
            // istanziare un'interfaccia (OnClickListener)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("Numero", 10);
                startActivity(intent);
            }
        }
        );

    }


    public void generaNumero(View view){

        Random rand = new Random();
        int n = rand.nextInt(10);
        text1.setText(Integer.toString(n+1));
        cambiaActivity.setVisibility(View.VISIBLE);
    }


    public void cambiaActivity(View view){
        Intent ActivityMusic = new Intent(getApplicationContext(), MainActivity2.class);
        ActivityMusic.putExtra("NumeroRandom", n);
        startActivity(ActivityMusic);

    }


    }
