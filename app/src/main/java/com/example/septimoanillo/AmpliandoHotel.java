package com.example.septimoanillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.septimoanillo.moldes.MoldeHotel;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;
    ImageView FotoAmpliandoHotel1;
    TextView  NombreAmpliandoHotel;
    TextView  PrecioAmpliandoHotel;
    TextView  Ampliadocelularhotel;
    TextView  comentarioAmpliandohotel;
    ImageView FotoAmpliandoHotel2;
    ImageView FotoAmpliandoHotel3;
    RatingBar valoracionampliandohotel;
    Button botonampliandohotel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);
        FotoAmpliandoHotel1=findViewById(R.id.FotoAmpliandoHotel1);
        NombreAmpliandoHotel=findViewById(R.id.NombreAmpliandoHotel);
        PrecioAmpliandoHotel=findViewById(R.id.PrecioAmpliandoHotel);
        Ampliadocelularhotel=findViewById(R.id.Ampliadocelularhotel);
        comentarioAmpliandohotel = findViewById(R.id.comentarioAmpliandohotel);
        FotoAmpliandoHotel2 = findViewById(R.id.FotoAmpliandoHotel2);
        FotoAmpliandoHotel3 = findViewById(R.id.FotoAmpliandoHotel3);
        valoracionampliandohotel = findViewById(R.id.valoracionampliandohotel);

        botonampliandohotel = findViewById(R.id.botonampliandohotel);//organizar y crearlo en el set

        moldeHotel=(MoldeHotel)getIntent().getSerializableExtra("datoshotel");



    //Cargando la info en los componentes graficos

        FotoAmpliandoHotel1.setImageResource(moldeHotel.getFoto());
        NombreAmpliandoHotel.setText(moldeHotel.getNombre());
        PrecioAmpliandoHotel.setText(moldeHotel.getPrecio());
        Ampliadocelularhotel.setText(moldeHotel.getTelefono());
        comentarioAmpliandohotel.setText(moldeHotel.getComentario());
        FotoAmpliandoHotel2.setImageResource(moldeHotel.getFotoAdicional());
        FotoAmpliandoHotel3.setImageResource(moldeHotel.getFotoAdicional2());
        valoracionampliandohotel.setRating(moldeHotel.getValoracion());




    }
}