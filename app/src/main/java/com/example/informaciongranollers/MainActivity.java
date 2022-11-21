package com.example.informaciongranollers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton bussines = findViewById(R.id.imgBussines);
        bussines.setOnClickListener(this);
        ImageButton restaurants = findViewById(R.id.imgRestaurants);
        restaurants.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        ImageButton b = (ImageButton) view;

        if (b.getId() == R.id.imgBussines ) {
            //Obrim l'activitat 2 amb el Intent

            Intent intent = new Intent(this, activity_business.class);  //.class és l'arxiu java compilat
            startActivity(intent);
        } else if(b.getId() == R.id.imgRestaurants)
        {
            Intent intent = new Intent(this, restaruants_activities.class);  //.class és l'arxiu java compilat
            startActivity(intent);
        }
    }
}