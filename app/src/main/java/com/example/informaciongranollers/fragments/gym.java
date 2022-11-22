package com.example.informaciongranollers.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.informaciongranollers.R;

public class gym extends Fragment implements View.OnClickListener{

    //CNG
    ImageView CNGWeb;
    ImageView CNGTelef;
    ImageView CNGMap;

    //anytimefitness
    ImageView anytimefitnessWeb;
    ImageView anytimefitnessTelef;
    ImageView anytimefitnessMap;

    //palacefitness
    ImageView palacefitnessWeb;
    ImageView palacefitnessTelef;
    ImageView palacefitnessMap;

    public gym(){
        // Required empty public constructor
    }

    public static gym newInstance() {
        gym fragment = new gym();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gym, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //CNG
        CNGWeb = view.findViewById(R.id.CNGWeb);
        CNGWeb.setOnClickListener(this);
        CNGTelef = view.findViewById(R.id.CNGTelef);
        CNGTelef.setOnClickListener(this);
        CNGMap = view.findViewById(R.id.CNGMap);
        CNGMap.setOnClickListener(this);

        //anytimefitness
        anytimefitnessTelef = view.findViewById(R.id.anytimefitnessTelef);
        anytimefitnessTelef.setOnClickListener(this);
        anytimefitnessWeb = view.findViewById(R.id.anytimefitnessWeb);
        anytimefitnessWeb.setOnClickListener(this);
        anytimefitnessMap = view.findViewById(R.id.anytimefitnessMap);
        anytimefitnessMap.setOnClickListener(this);

        //palacefitness
        palacefitnessTelef = view.findViewById(R.id.palacefitnessTelef);
        palacefitnessTelef.setOnClickListener(this);
        palacefitnessWeb = view.findViewById(R.id.palacefitnessWeb);
        palacefitnessWeb.setOnClickListener(this);
        palacefitnessMap = view.findViewById(R.id.palacefitnessMap);
        palacefitnessMap.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.CNGWeb){
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cngranollers.org/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.CNGTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 938 70 45 99"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.CNGMap) {
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }else if (view.getId() == R.id.anytimefitnessWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.anytimefitness.es/gimnasio/sp-0014/gimnasio-granollers-catalu%C3%B1a-granollers/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.anytimefitnessTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 620 80 12 18"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.anytimefitnessMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }else if (view.getId() == R.id.palacefitnessWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://palacefitness.es/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.palacefitnessTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 679 61 22 94"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.palacefitnessMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }
    }
}