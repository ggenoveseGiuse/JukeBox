package com.example.jukebox_genovese5ai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;



public class SecondActivity extends AppCompatActivity {

    final String TAG = "SecondActivity";
    TextView titolo;

    @Override
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); // invochiamo il metodo della classe padre
        // stiamo sovrascrivendo il metodo
        Log.d(TAG, "Dentro OnCreate()");
        setContentView(R.layout.activity_second);

        // geetIntent() per recuperare i dati inviati 
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int numero = bundle.getInt("Numero");
        Log.d(TAG, "Numero passato: " + numero);


        String titolo = "";
        TextView txttitolo = findViewById(R.id.txtTitolo);
        ImageView cover = findViewById(R.id.idImmagine);

        if(numero == 10){
            titolo = "Cenere - Lazza";
            txttitolo.setText(titolo);
            cover.setImageResource(R.drawable.cenere_cover);
        }
        else{
            titolo.setText("Dybala - ROS21");
            cover.setImageResource(R.drawable.dybala_cover);
        }
        


        
    }

    public void visualizza(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        intent.putExtra("titolo", titolo.getText());
        startActivity(intent);


    }
}