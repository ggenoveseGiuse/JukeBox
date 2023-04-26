package com.example.jukebox_genovese5ai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class TableActivity extends AppCompatActivity {

    TextView titolo;
    ImageView cover;
    ImageButton bottoneTesto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        titolo = findViewById(R.id.TitoloCanzone);
        cover = findViewById(R.id.cover);
        bottoneTesto = findViewById(R.id.bottoneTesto);

        titolo.setText("Cenere - Lazza");
        cover.setImageResource(R.drawable.cover);

    }

    public void cambiaActivity(View view){
        Intent intent = new Intent(this, ThirdActivity.class);
        //intent.putExtra("NumeroRandom", n);
        startActivity(intent);

    }

}