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
import android.widget.TextView;

import com.example.informaciongranollers.R;

public class autoescuela extends Fragment implements View.OnClickListener {

    TextView telefonoLiceu;

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

        telefonoLiceu = view.findViewById(R.id.liceuTelef);
        telefonoLiceu.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.liceuTelef) {
            Intent telfIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 678 63 15 64"));
            startActivity(telfIntent);
        }
    }

}