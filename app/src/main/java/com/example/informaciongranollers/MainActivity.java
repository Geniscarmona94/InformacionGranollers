package com.example.informaciongranollers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tienda = findViewById(R.id.btBussines);
        tienda.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Button b = (Button)view;

        if (b.getId() == R.id.btBussines ) {
            //Obrim l'activitat 2 amb el Intent

            Intent intent = new Intent(this, Businesses.class);  //.class és l'arxiu java compilat
            startActivity(intent);
        }
    }
}