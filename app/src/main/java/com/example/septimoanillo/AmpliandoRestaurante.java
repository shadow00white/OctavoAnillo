package com.example.septimoanillo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.septimoanillo.moldes.MoldeHotel;
import com.example.septimoanillo.moldes.MoldeRestaurante;
import com.example.septimoanillo.moldes.MoldeTurismo;

public class AmpliandoRestaurante extends AppCompatActivity {

    MoldeRestaurante moldeRestaurante;
    ImageView  AmpliandoRestauranteFoto;
    TextView NombreAmpliandoRestaurante;
    TextView  PrecioAmpliandoRestaurante;
    TextView  AmpliandocelulaRestaurante;
    TextView  ccomentarioAmpliandoRestaurante;
    ImageView FotoAmpliandoRestautante2;
    ImageView FotoAmpliandoRestaurante3;
    RatingBar valoracionampliandoRestaurante;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);

        AmpliandoRestauranteFoto = findViewById(R.id.AmpliandoRestauranteFoto);
        NombreAmpliandoRestaurante = findViewById(R.id.NombreAmpliandoRestaurante);
        PrecioAmpliandoRestaurante = findViewById(R.id.PrecioAmpliandoRestaurante);
        AmpliandocelulaRestaurante = findViewById(R.id.AmpliandocelulaRestaurante);
        ccomentarioAmpliandoRestaurante = findViewById(R.id.comentarioAmpliandoRestaurante);
        FotoAmpliandoRestautante2 = findViewById(R.id.FotoAmpliandoRestautante2);
        FotoAmpliandoRestaurante3 = findViewById(R.id.FotoAmpliandoRestaurante3);
        valoracionampliandoRestaurante = findViewById(R.id.valoracionampliandoRestaurante);


        moldeRestaurante = (MoldeRestaurante) getIntent().getSerializableExtra("datosrestaurante");

        // Cargando la información en los componentes gráficos
        AmpliandoRestauranteFoto.setImageResource(moldeRestaurante.getFoto());
        NombreAmpliandoRestaurante.setText(moldeRestaurante.getNombreRestaurante());
        PrecioAmpliandoRestaurante.setText(moldeRestaurante.getPrecio());
        AmpliandocelulaRestaurante.setText(moldeRestaurante.getTelefono());
        ccomentarioAmpliandoRestaurante.setText(moldeRestaurante.getComentario());
        FotoAmpliandoRestautante2.setImageResource(moldeRestaurante.getFotoAdicional());
        FotoAmpliandoRestaurante3.setImageResource(moldeRestaurante.getFotoAdicional2());
        valoracionampliandoRestaurante.setRating(moldeRestaurante.getValoracion());
    }
}