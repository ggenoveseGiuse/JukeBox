package com.example.jukebox_genovese5ai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtNome = findViewById(R.id.txtNome);
        // file R.java è un file dove finiscono tutti i puntatori
        // relativi agli oggetti istanziati

        Button btnInvia = findViewById(R.id.btnInvia);
        
        // associare un'altro oggeetto all'ascoltatore 
        // l'ascoltatore è una classe anonima
        btnInvia.setOnClickListener(new View.OnClickListener() {    // classe astratta
            // istanziare un'interfaccia (OnClickListener)
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });
        

    }
}