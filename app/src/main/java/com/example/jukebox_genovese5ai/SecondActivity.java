package com.example.jukebox_genovese5ai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;



public class SecondActivity extends AppCompatActivity {

    final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // invochiamo il metodo della classe padre
        // stiamo sovrascrivendo il metodo
        Log.d(TAG, "Dentro OnCreate()");
        setContentView(R.layout.activity_second);

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

        ImageView image = new ImageView(SecondActivity.this);


        ImageView immagine = findViewById(R.id.idImmagine);
        immagine.setImageResource(R.drawable.cover);
        //immagine.setImageDrawable(R.id.cover);
        //ImageView image = new ImageView();
    }

    @Override
    protected void onStart(){
        super.onStart();
    }



}