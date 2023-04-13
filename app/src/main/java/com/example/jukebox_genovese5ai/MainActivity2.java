package com.example.jukebox_genovese5ai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity2 extends AppCompatActivity {

    final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        int numero = bundle.getInt("Numero");

        Log.d(TAG, "Numero passato: " + numero);

        String titolo = "";
        if(numero == 10){
            titolo = "Cenere";
        }
        TextView txttitolo = findViewById(R.id.txtTitolo);
        txttitolo.setText(titolo);

        ImageView image = new ImageView(MainActivity2.this);


        ImageView immagine = findViewById(R.id.idImmagine);
        immagine.setImageResource(R.drawable.cover);
        //immagine.setImageDrawable(R.id.cover);
        //ImageView image = new ImageView();
    }
}