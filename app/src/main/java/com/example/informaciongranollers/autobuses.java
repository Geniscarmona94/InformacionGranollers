package com.example.informaciongranollers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class autobuses extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autobuses);

        //transgran
        ImageView transgran = findViewById(R.id.transgranImagen);
        transgran.setOnClickListener(this);

        //express
        ImageView express = findViewById(R.id.expressImagen);
        express.setOnClickListener(this);

        //urbanas
        ImageView urbanas = findViewById(R.id.urbanasImagen);
        urbanas.setOnClickListener(this);

        //interurbanas
        ImageView interurbanas = findViewById(R.id.interurbanasImagen);
        interurbanas.setOnClickListener(this);

        //nocturnes
        ImageView nocturnes = findViewById(R.id.nocturnesImagen);
        nocturnes.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        ImageView b = (ImageView) view;

        if (b.getId() == R.id.transgranImagen){
            Intent busesIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sagales.com/uploads/imagenes/marcaliniesWebUrbans/marca_2.pdf"));
            startActivity(busesIntent);
        } else if(b.getId() == R.id.expressImagen)
        {
            Intent busesIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sagales.com/linies/4/linies-expres"));
            startActivity(busesIntent);
        }else if(b.getId() == R.id.urbanasImagen)
        {
            Intent busesIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sagales.com/linies/1/linies-urbanes"));
            startActivity(busesIntent);
        }else if(b.getId() == R.id.interurbanasImagen)
        {
            Intent busesIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sagales.com/linies/2/linies-interurbanes"));
            startActivity(busesIntent);
        }else if(b.getId() == R.id.nocturnesImagen)
        {
            Intent busesIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sagales.com/linies/3/linies-nocturnes"));
            startActivity(busesIntent);
        }
    }
}