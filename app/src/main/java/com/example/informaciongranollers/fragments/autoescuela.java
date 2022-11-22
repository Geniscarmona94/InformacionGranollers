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
import android.widget.TextView;

import com.example.informaciongranollers.R;

public class autoescuela extends Fragment implements View.OnClickListener {

    //liceu
    ImageView liceuWeb;
    ImageView liceuTelef;
    ImageView liceuMap;

    //hoyvoy
    ImageView hoyvoyWeb;
    ImageView hoyvoyTelef;
    ImageView hoyvoyMap;

    //soy18
    ImageView soy18Web;
    ImageView soy18Telef;
    ImageView soy18Map;

    //autoescolaGranollers
    ImageView autoescolaGranollersWeb;
    ImageView autoescolaGranollersTelef;
    ImageView autoescolaGranollersMap;

    public autoescuela() {
        // Required empty public constructor
    }


    public static autoescuela newInstance() {
        autoescuela fragment = new autoescuela();
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
        return inflater.inflate(R.layout.fragment_autoescuela, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //liceu
        liceuWeb = view.findViewById(R.id.liceuWeb);
        liceuWeb.setOnClickListener(this);
        liceuTelef = view.findViewById(R.id.liceuTelef);
        liceuTelef.setOnClickListener(this);
        liceuMap = view.findViewById(R.id.liceuMap);
        liceuMap.setOnClickListener(this);

        //hoyvoy
        hoyvoyTelef = view.findViewById(R.id.hoyvoyTelef);
        hoyvoyTelef.setOnClickListener(this);
        hoyvoyWeb = view.findViewById(R.id.hoyvoyWeb);
        hoyvoyWeb.setOnClickListener(this);
        hoyvoyMap = view.findViewById(R.id.hoyvoyMap);
        hoyvoyMap.setOnClickListener(this);

        //soy18
        soy18Telef = view.findViewById(R.id.soy18Telef);
        soy18Telef.setOnClickListener(this);
        soy18Web = view.findViewById(R.id.soy18Web);
        soy18Web.setOnClickListener(this);
        soy18Map = view.findViewById(R.id.soy18Map);
        soy18Map.setOnClickListener(this);

        //autoescolaGranollers
        autoescolaGranollersTelef = view.findViewById(R.id.autoescolaGranollersTelef);
        autoescolaGranollersTelef.setOnClickListener(this);
        autoescolaGranollersWeb = view.findViewById(R.id.autoescolaGranollersWeb);
        autoescolaGranollersWeb.setOnClickListener(this);
        autoescolaGranollersMap = view.findViewById(R.id.autoescolaGranollersMap);
        autoescolaGranollersMap.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.liceuWeb){
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://autoescuelaliceu.com"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.liceuTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 678 63 15 64"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.liceuMap) {
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }else if (view.getId() == R.id.hoyvoyWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.hoy-voy.com"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.hoyvoyTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 938 46 77 22"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.hoyvoyMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }else if (view.getId() == R.id.soy18Web) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.soy18.com/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.soy18Telef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 932 20 70 16"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.soy18Map){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }else if (view.getId() == R.id.autoescolaGranollersWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.autoescolagranollers.com/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.autoescolaGranollersTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 938 79 48 27"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.autoescolaGranollersMap) {
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }
    }
}