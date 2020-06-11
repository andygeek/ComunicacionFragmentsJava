package com.andygeek.comunicacionfragmentsjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements EnviaFragment.Comunicador {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void enviar(String mensaje) {
        RecibeFragment recibeFragment = (RecibeFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_recibe);
        recibeFragment.recibir(mensaje);
    }
}
