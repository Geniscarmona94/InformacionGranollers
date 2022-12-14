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
 * Use the {@link fastfood#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fastfood extends Fragment implements View.OnClickListener{
    //mcdonals
    ImageView mcdonalsWeb;
    ImageView mcdonalsTelef;
    ImageView mcdonalsMap;

    //burger
    ImageView burgerWeb;
    ImageView burgerTelef;
    ImageView burgerMap;

    //kfc
    ImageView kfcWeb;
    ImageView kfcTelef;
    ImageView kfcMap;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fastfood() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fastfood.
     */
    // TODO: Rename and change types and number of parameters
    public static fastfood newInstance(String param1, String param2) {
        fastfood fragment = new fastfood();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
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
        return inflater.inflate(R.layout.fragment_fastfood, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //mcdonals
        mcdonalsTelef = view.findViewById(R.id.mcdonalsTelef);
        mcdonalsTelef.setOnClickListener(this);
        mcdonalsWeb = view.findViewById(R.id.mcdonalsWeb);
        mcdonalsWeb.setOnClickListener(this);
        mcdonalsMap = view.findViewById(R.id.mcdonalsMap);
        mcdonalsMap.setOnClickListener(this);

        //burger
        burgerTelef = view.findViewById(R.id.burgerTelef);
        burgerTelef.setOnClickListener(this);
        burgerWeb = view.findViewById(R.id.burgerWeb);
        burgerWeb.setOnClickListener(this);
        burgerMap = view.findViewById(R.id.burgerMap);
        burgerMap.setOnClickListener(this);

        //kfc
        kfcTelef = view.findViewById(R.id.kfcTelef);
        kfcTelef.setOnClickListener(this);
        kfcWeb = view.findViewById(R.id.kfcWeb);
        kfcWeb.setOnClickListener(this);
        kfcMap = view.findViewById(R.id.kfcMap);
        kfcMap.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.kfcWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kfc.es/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.kfcTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 938 79 51 07"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.kfcMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 41.611788941477066, 2.3026851696495476"));
            startActivity(mapIntent);
        }else if (view.getId() == R.id.burgerWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.burgerking.es/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.burgerTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 676 64 51 26"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.burgerMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 41.59720900376729, 2.282367531234525"));
            startActivity(mapIntent);
        }else if (view.getId() == R.id.mcdonalsWeb) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mcdonalds.es/"));
            startActivity(webIntent);
        }else if (view.getId() == R.id.mcdonalsTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 615 73 65 34"));
            startActivity(telfIntent);
        }else if (view.getId() == R.id.mcdonalsMap){
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 41.5972930503227, 2.2831401935694178"));
            startActivity(mapIntent);
        }
    }
}