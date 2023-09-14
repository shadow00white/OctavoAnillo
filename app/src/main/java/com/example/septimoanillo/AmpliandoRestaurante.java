package com.example.septimoanillo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.septimoanillo.moldes.MoldeHotel;
import com.example.septimoanillo.moldes.MoldeRestaurante;
import com.example.septimoanillo.moldes.MoldeTurismo;

public class AmpliandoRestaurante extends AppCompatActivity {

    MoldeRestaurante moldeRestaurante;
    ImageView  AmpliandoRestauranteFoto;
    TextView NombreAmpliandoRestaurante;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);
        AmpliandoRestauranteFoto=findViewById(R.id.AmpliandoRestauranteFoto);
        NombreAmpliandoRestaurante=findViewById(R.id.NombreAmpliandoRestaurante);
        moldeRestaurante=(MoldeRestaurante) getIntent().getSerializableExtra("datosrestaurante");
        Toast.makeText(this, moldeRestaurante.getNombreRestaurante(), Toast.LENGTH_LONG).show();

        AmpliandoRestauranteFoto.setImageResource(moldeRestaurante.getFoto());
        NombreAmpliandoRestaurante.setText(moldeRestaurante.getNombreRestaurante());


    }
}