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
        Button rest = findViewById(R.id.btComida);
        rest.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Button b = (Button)view;

        if (b.getId() == R.id.btBussines ) {
            //Obrim l'activitat 2 amb el Intent

            Intent intent = new Intent(this, activity_business.class);  //.class és l'arxiu java compilat
            startActivity(intent);
        } else if(b.getId() == R.id.btComida)
        {
            Intent intent = new Intent(this, restaruants_activities.class);  //.class és l'arxiu java compilat
            startActivity(intent);
        }
    }
}