package com.example.septimoanillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.septimoanillo.moldes.MoldeHotel;
import com.example.septimoanillo.moldes.MoldeRestaurante;
import com.example.septimoanillo.moldes.MoldeTurismo;

public class AmpliandoRestaurante extends AppCompatActivity {

    MoldeRestaurante moldeRestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);

        moldeRestaurante=(MoldeRestaurante) getIntent().getSerializableExtra("datosrestaurante");
        Toast.makeText(this, moldeRestaurante.getNombreRestaurante(), Toast.LENGTH_LONG).show();
    }
}