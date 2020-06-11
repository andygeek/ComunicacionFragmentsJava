package com.andygeek.comunicacionfragmentsjava;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecibeFragment extends Fragment {

    TextView txt_recibe;

    public RecibeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recibe, container, false);
        txt_recibe = v.findViewById(R.id.txt_recibir);
        return v;
    }

    public void recibir(String mensaje){
        txt_recibe.setText(mensaje);
    }
}
