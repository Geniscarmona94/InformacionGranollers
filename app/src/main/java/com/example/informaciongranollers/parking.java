package com.example.informaciongranollers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class parking extends AppCompatActivity implements View.OnClickListener {
    //atenea
    ImageView ateneaWeb;
    ImageView ateneaTelef;
    ImageView ateneaMap;

    //elsot
    ImageView elsotWeb;
    ImageView elsotTelef;
    ImageView elsotMap;

    //corona
    ImageView coronaWeb;
    ImageView coronaTelef;
    ImageView coronaMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);

        //elsot
        elsotTelef = findViewById(R.id.elsotTelef);
       elsotTelef.setOnClickListener(this);
        elsotWeb = findViewById(R.id.elsotWeb);
        elsotWeb.setOnClickListener(this);
        elsotMap = findViewById(R.id.elsotMap);
        elsotMap.setOnClickListener(this);

        //atenea
        ateneaTelef = findViewById(R.id.ateneaTelef);
        ateneaTelef.setOnClickListener(this);
        ateneaWeb = findViewById(R.id.ateneaWeb);
        ateneaWeb.setOnClickListener(this);
        ateneaMap = findViewById(R.id.ateneaMap);
        ateneaMap.setOnClickListener(this);

        //corona
        coronaTelef = findViewById(R.id.coronaTelef);
        coronaTelef.setOnClickListener(this);
        coronaWeb = findViewById(R.id.coronaWeb);
        coronaWeb.setOnClickListener(this);
        coronaMap = findViewById(R.id.coronaMap);
        coronaMap.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.coronaWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.es/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.coronaTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 938 606 690"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.coronaMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }else if (view.getId() == R.id.elsotWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.es/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.elsotTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 938 709 150"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.elsotMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }else if (view.getId() == R.id.ateneaWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.es/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.ateneaTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 618 463 836"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.ateneaMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }
    }
}