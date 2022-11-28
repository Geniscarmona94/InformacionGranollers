package com.example.informaciongranollers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class transport extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);

        ImageView bus = findViewById(R.id.bus);
        bus.setOnClickListener(this);
        ImageView trens = findViewById(R.id.trens);
        trens.setOnClickListener(this);

        ImageView estacionBusesTelef = findViewById(R.id.estacionBusesTelef);
        estacionBusesTelef.setOnClickListener(this);
        ImageView estacionCentTrenTelef = findViewById(R.id.estacionCentTrenTelef);
        estacionCentTrenTelef.setOnClickListener(this);
        ImageView estacionCanoTrenTelef = findViewById(R.id.estacionCanoTrenTelef);
        estacionCanoTrenTelef.setOnClickListener(this);
        ImageView estacionNordTrenTelef = findViewById(R.id.estacionNordTrenTelef);
        estacionNordTrenTelef.setOnClickListener(this);

        ImageView estacionBusesMap = findViewById(R.id.estacionBusesMap);
        estacionBusesMap.setOnClickListener(this);
        ImageView estacionCentTrenMap = findViewById(R.id.estacionCentTrenMap);
        estacionCentTrenMap.setOnClickListener(this);
        ImageView estacionCanoTrenMap = findViewById(R.id.estacionCanoTrenMap);
        estacionCanoTrenMap.setOnClickListener(this);
        ImageView estacionNordTrenMap = findViewById(R.id.estacionNordTrenMap);
        estacionNordTrenMap.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        ImageView b = (ImageView) view;

        if(b.getId() == R.id.bus) {
            Intent intentBoton = new Intent(this, autobuses.class);
            startActivity(intentBoton);
        }else if(b.getId() == R.id.trens){
            Intent intentBoton = new Intent(this, trenes.class);
            startActivity(intentBoton);
        }else if (b.getId() == R.id.estacionBusesTelef) {
            Intent intentTelef = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 93 870 78 60"));
            startActivity(intentTelef);
        }else if(b.getId() == R.id.estacionCentTrenTelef)
        {
            Intent intentTelef = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 900 41 00 41"));
            startActivity(intentTelef);
        }else if(b.getId() == R.id.estacionCanoTrenTelef)
        {
            Intent intentTelef = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 900 41 00 41"));
            startActivity(intentTelef);
        }else if(b.getId() == R.id.estacionNordTrenTelef)
        {
            Intent intentTelef = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 900 41 00 41"));
            startActivity(intentTelef);
        }else if (b.getId() == R.id.estacionBusesMap) {
            Intent intentMap = new Intent(Intent.ACTION_DIAL, Uri.parse("geo: 41.606654657069654, 2.2912180689564505"));
            startActivity(intentMap);
        } else if(b.getId() == R.id.estacionCentTrenMap)
        {
            Intent intentMap = new Intent(Intent.ACTION_DIAL, Uri.parse("geo: 41.59979410665576, 2.291395359465632"));
            startActivity(intentMap);
        }else if(b.getId() == R.id.estacionCanoTrenMap)
        {
            Intent intentMap = new Intent(Intent.ACTION_DIAL, Uri.parse("geo: 41.611538751546306, 2.276889974346129"));
            startActivity(intentMap);
        }else if(b.getId() == R.id.estacionNordTrenMap)
        {
            Intent intentMap = new Intent(Intent.ACTION_DIAL, Uri.parse("geo: 41.61715902938536, 2.294409924553507"));
            startActivity(intentMap);
        }
    }
}