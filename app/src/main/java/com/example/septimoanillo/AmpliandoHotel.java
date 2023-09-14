package com.example.septimoanillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.septimoanillo.moldes.MoldeHotel;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;
    ImageView FotoAmpliandoHotel1;
    TextView  NombreAmpliandoHotel;
    TextView  PrecioAmpliandoHotel;
    TextView  Ampliadocelularhotel;
    TextView   ResenaAmpliandohotel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);
        FotoAmpliandoHotel1=findViewById(R.id.FotoAmpliandoHotel1);
        NombreAmpliandoHotel=findViewById(R.id.NombreAmpliandoHotel);
        PrecioAmpliandoHotel=findViewById(R.id.PrecioAmpliandoHotel);
        Ampliadocelularhotel=findViewById(R.id.Ampliadocelularhotel);
        moldeHotel=(MoldeHotel)getIntent().getSerializableExtra("datoshotel");



    //Cargando la info en los componentes graficos

        FotoAmpliandoHotel1.setImageResource(moldeHotel.getFoto());
        NombreAmpliandoHotel.setText(moldeHotel.getNombre());
        PrecioAmpliandoHotel.setText(moldeHotel.getPrecio());
        Ampliadocelularhotel.setText(moldeHotel.getTelefono());
         
    }
}