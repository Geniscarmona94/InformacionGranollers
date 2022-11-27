package com.example.informaciongranollers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class trenes extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trenes);

        //granollers centre
        ImageView r2 = findViewById(R.id.r2);
        r2.setOnClickListener(this);
        ImageView r8 = findViewById(R.id.r8);
        r8.setOnClickListener(this);
        ImageView r11 = findViewById(R.id.r11);
        r11.setOnClickListener(this);

        //granollers canovelles
        ImageView r3 = findViewById(R.id.r3);
        r3.setOnClickListener(this);

        //granollers nord (les franqueses)
        ImageView r2Nord = findViewById(R.id.r2Nord);
        r2Nord.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        ImageView b = (ImageView) view;

        if (b.getId() == R.id.r2 ){
            Intent trenIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rodalies.gencat.cat/web/.content/02_Horaris/horaris/R2.pdf"));
            startActivity(trenIntent);
        } else if(b.getId() == R.id.r8)
        {
            Intent trenIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rodalies.gencat.cat/web/.content/02_Horaris/horaris/Grafica_CARTEL-HORARIOS-R8-desde-20-agosto-2022_PAT-Castellbisbal-Corredor-Mediterraneo.pdf"));
            startActivity(trenIntent);
        } else if(b.getId() == R.id.r11)
        {
            Intent trenIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rodalies.gencat.cat/web/.content/02_Horaris/horaris/R11.pdf"));
            startActivity(trenIntent);
        } else if(b.getId() == R.id.r3)
        {
            Intent trenIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rodalies.gencat.cat/web/.content/02_Horaris/horaris/R3.pdf"));
            startActivity(trenIntent);
        } else if(b.getId() == R.id.r2Nord)
        {
            Intent trenIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rodalies.gencat.cat/web/.content/02_Horaris/horaris/R2-NORD_R11_PAT-SAGRERA_Web.pdf"));
            startActivity(trenIntent);
        }
    }
}