package com.example.informaciongranollers.controlador;

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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link pizza#newInstance} factory method to
 * create an instance of this fragment.
 */
public class pizza extends Fragment implements View.OnClickListener{
    //ilsapore
    ImageView ilsaporeWeb;
    ImageView ilsaporeTelef;
    ImageView ilsaporeMap;

    //lamezzaluna
    ImageView lamezzalunaWeb;
    ImageView lamezzalunaTelef;
    ImageView lamezzalunaMap;

    //tagliatella
    ImageView tagliatellaWeb;
    ImageView tagliatellaTelef;
    ImageView tagliatellaMap;

    //elitaliano
    ImageView elitalianoWeb;
    ImageView elitalianoTelef;
    ImageView elitalianoMap;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public pizza() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment pizza.
     */
    // TODO: Rename and change types and number of parameters
    public static pizza newInstance(String param1, String param2) {
        pizza fragment = new pizza();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pizza, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //ilsapore
        ilsaporeTelef = view.findViewById(R.id.ilsaporeTelef);
        ilsaporeTelef.setOnClickListener(this);
        ilsaporeWeb = view.findViewById(R.id.ilsaporeWeb);
        ilsaporeWeb.setOnClickListener(this);
        ilsaporeMap = view.findViewById(R.id.ilsaporeMap);
        ilsaporeMap.setOnClickListener(this);

        //elitaliano
        elitalianoTelef = view.findViewById(R.id.elitalianoTelef);
        elitalianoTelef.setOnClickListener(this);
        elitalianoWeb = view.findViewById(R.id.elitalianoWeb);
        elitalianoWeb.setOnClickListener(this);
        elitalianoMap = view.findViewById(R.id.elitalianoMap);
        elitalianoMap.setOnClickListener(this);

        //tagliatella
        tagliatellaTelef = view.findViewById(R.id.tagliatellaTelef);
        tagliatellaTelef.setOnClickListener(this);
        tagliatellaWeb = view.findViewById(R.id.tagliatellaWeb);
        tagliatellaWeb.setOnClickListener(this);
        tagliatellaMap = view.findViewById(R.id.tagliatellaMap);
        tagliatellaMap.setOnClickListener(this);

        //lamezzaluna
        lamezzalunaTelef = view.findViewById(R.id.lamezzalunaTelef);
        lamezzalunaTelef.setOnClickListener(this);
        lamezzalunaWeb = view.findViewById(R.id.lamezzalunaWeb);
        lamezzalunaWeb.setOnClickListener(this);
        lamezzalunaMap = view.findViewById(R.id.lamezzalunaMap);
        lamezzalunaMap.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.lamezzalunaWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://lamezzaluna.es/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.lamezzalunaTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 938 79 52 23"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.lamezzalunaMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }else if (view.getId() == R.id.tagliatellaWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.latagliatella.es/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.tagliatellaTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 938 60 48 99"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.tagliatellaMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }else if (view.getId() == R.id.elitalianoWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ubereats.com/es/store/el-italiano/9Jy-zenzST2WE4p-qaSYlA"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.elitalianoTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 931 29 63 46"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.elitalianoMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }else if (view.getId() == R.id.ilsaporeWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(" http://www.ilsaporeitaliano.es/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.ilsaporeTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 938 40 15 32"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.ilsaporeMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }
    }
}