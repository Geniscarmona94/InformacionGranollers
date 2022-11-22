package com.example.informaciongranollers.controlador;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.informaciongranollers.MainActivity;
import com.example.informaciongranollers.R;
import com.example.informaciongranollers.fragments.autoescuela;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link chino#newInstance} factory method to
 * create an instance of this fragment.
 */
public class chino extends Fragment implements View.OnClickListener{

    //atarasii
    ImageView atarasiWeb;
    ImageView atarasiTelef;
    ImageView atarasiMap;

    //wagaya
    ImageView wagayaWeb;
    ImageView wagayaTelef;
    ImageView wagayaMap;

    //solNaixent
    ImageView solNaixentWeb;
    ImageView solNaixentTelef;
    ImageView solNaixentMap;

    //nuevoPekin
    ImageView nuevoPekinWeb;
    ImageView nuevoPekinTelef;
    ImageView nuevoPekinMap;

    public chino() {
        // Required empty public constructor
    }


    public static chino newInstance() {
        chino fragment = new chino();
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
        return inflater.inflate(R.layout.fragment_chino, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //atarasii
        atarasiTelef = view.findViewById(R.id.atarasiTelef);
        atarasiTelef.setOnClickListener(this);
        atarasiWeb = view.findViewById(R.id.atarasiWeb);
        atarasiWeb.setOnClickListener(this);
        atarasiMap = view.findViewById(R.id.atarasiMap);
        atarasiMap.setOnClickListener(this);

        //wagaya
        wagayaTelef = view.findViewById(R.id.wagayaTelef);
        wagayaTelef.setOnClickListener(this);
        wagayaWeb = view.findViewById(R.id.wagayaWeb);
        wagayaWeb.setOnClickListener(this);
        wagayaMap = view.findViewById(R.id.wagayaMap);
        wagayaMap.setOnClickListener(this);

        //solNaixent
        solNaixentTelef = view.findViewById(R.id.solNaixentTelef);
        solNaixentTelef.setOnClickListener(this);
        solNaixentWeb = view.findViewById(R.id.solNaixentWeb);
        solNaixentWeb.setOnClickListener(this);
        solNaixentMap = view.findViewById(R.id.solNaixentMap);
        solNaixentMap.setOnClickListener(this);

        //nuevoPekin
        nuevoPekinTelef = view.findViewById(R.id.nuevoPekinTelef);
        nuevoPekinTelef.setOnClickListener(this);
        nuevoPekinWeb = view.findViewById(R.id.nuevoPekinWeb);
        nuevoPekinWeb.setOnClickListener(this);
        nuevoPekinMap = view.findViewById(R.id.nuevoPekinMap);
        nuevoPekinMap.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.atarasiWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.atarasiisushi.es/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.atarasiTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 689 87 56 85"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.atarasiMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }else if (view.getId() == R.id.wagayaWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wagaya.es/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.wagayaTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 931 58 34 81"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.wagayaMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }else if (view.getId() == R.id.solNaixentWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://solnaixent.es/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.solNaixentTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 938 79 51 07"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.solNaixentMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }else if (view.getId() == R.id.nuevoPekinWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.just-eat.es/restaurants-chinonuevopekin/menu"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.nuevoPekinTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 938 46 76 70"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.nuevoPekinMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: ")); //no se como poner la ubicación en latitud y longuitud
            startActivity(mapIntent);
        }
    }

}