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

public class peluqueria extends Fragment implements View.OnClickListener{

    //aduho
    ImageView aduhoWeb;
    ImageView aduhoTelef;
    ImageView aduhoMap;

    //elsalon
    ImageView elsalonWeb;
    ImageView elsalonTelef;
    ImageView elsalonMap;

    //urbanbeauty
    ImageView urbanbeautyWeb;
    ImageView urbanbeautyTelef;
    ImageView urbanbeautyMap;

    public peluqueria() {
        // Required empty public constructor
    }

    public static peluqueria newInstance() {
        peluqueria fragment = new peluqueria();
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
        return inflater.inflate(R.layout.fragment_peluqueria, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //aduho
        aduhoWeb = view.findViewById(R.id.aduhoWeb);
        aduhoWeb.setOnClickListener(this);
        aduhoTelef = view.findViewById(R.id.aduhoTelef);
        aduhoTelef.setOnClickListener(this);
        aduhoMap = view.findViewById(R.id.aduhoMap);
        aduhoMap.setOnClickListener(this);

        //elsalon
        elsalonTelef = view.findViewById(R.id.elsalonTelef);
        elsalonTelef.setOnClickListener(this);
        elsalonWeb = view.findViewById(R.id.elsalonWeb);
        elsalonWeb.setOnClickListener(this);
        elsalonMap = view.findViewById(R.id.elsalonMap);
        elsalonMap.setOnClickListener(this);

        //urbanbeauty
        urbanbeautyTelef = view.findViewById(R.id.urbanbeautyTelef);
        urbanbeautyTelef.setOnClickListener(this);
        urbanbeautyWeb = view.findViewById(R.id.urbanbeautyWeb);
        urbanbeautyWeb.setOnClickListener(this);
        urbanbeautyMap = view.findViewById(R.id.urbanbeautyMap);
        urbanbeautyMap.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.aduhoWeb){
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://aduho.com/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.aduhoTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 938 70 14 87"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.aduhoMap) {
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 41.61003629560505, 2.2832452496669435")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }else if (view.getId() == R.id.elsalonWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://elsalon.netlify.app/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.elsalonTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 938 44 33 39"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.elsalonMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 41.613504934180405, 2.290713253387624")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }else if (view.getId() == R.id.urbanbeautyWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.urbanbeautygranollers.com/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.urbanbeautyTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 938 79 31 75"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.urbanbeautyMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 41.60626226815018, 2.289762097791617")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }
    }
}