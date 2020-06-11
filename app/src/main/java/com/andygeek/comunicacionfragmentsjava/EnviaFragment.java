package com.andygeek.comunicacionfragmentsjava;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class EnviaFragment extends Fragment {

    Comunicador comunicador;
    Button btn_enviar;
    EditText edt_enviar;


    public interface Comunicador{
        public void enviar(String mensaje);
    }

    public EnviaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_envia, container, false);
        edt_enviar = v.findViewById(R.id.edt_enviar);
        btn_enviar = v.findViewById(R.id.btn_enviar);

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comunicador.enviar(edt_enviar.getText().toString());
            }
        });

        return v;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        comunicador = (Comunicador) context;
    }
}
