package com.example.septimoanillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.septimoanillo.moldes.MoldeRestaurante;
import com.example.septimoanillo.moldes.MoldeTurismo;

public class AmpliandoSitioTurismo extends AppCompatActivity {

    MoldeTurismo moldeTurismo;
    ImageView FotoAmpliandoTurismo;
    TextView NombreAmpliandoTurismo;
    TextView  PrecioAmpliandoTurismo;
    TextView  AmpliadocelularTurismo;
    TextView  comentarioAmpliandoTurismo;
    ImageView FotoAmpliandoTurismo2;
    ImageView FotoAmpliandoTurismo3;
    RatingBar valoracionampliandoturismo;
    Button botonamppliandoTurismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_sitio_turismo);

        FotoAmpliandoTurismo = findViewById(R.id.FotoAmpliandoTurismo);
        NombreAmpliandoTurismo = findViewById(R.id.NombreAmpliandoTurismo);
        PrecioAmpliandoTurismo = findViewById(R.id.PrecioAmpliandoTurismo);
        AmpliadocelularTurismo = findViewById(R.id.AmpliadocelularTurismo);
        comentarioAmpliandoTurismo = findViewById(R.id.comentarioAmpliandoTurismo);
        FotoAmpliandoTurismo2 = findViewById(R.id.FotoAmpliandoTurismo2);
        FotoAmpliandoTurismo3 = findViewById(R.id.FotoAmpliandoTurismo3);
        valoracionampliandoturismo = findViewById(R.id.valoracionampliandoturismo);

        moldeTurismo = (MoldeTurismo) getIntent().getSerializableExtra("datosturismo");

        // Cargando la información en los componentes gráficos
        FotoAmpliandoTurismo.setImageResource(moldeTurismo.getFoto());
        NombreAmpliandoTurismo.setText(moldeTurismo.getNombre());
        PrecioAmpliandoTurismo.setText(moldeTurismo.getPrecio());
        AmpliadocelularTurismo.setText(moldeTurismo.getTelefono());
        comentarioAmpliandoTurismo.setText(moldeTurismo.getComentario());
        FotoAmpliandoTurismo2.setImageResource(moldeTurismo.getFotoAdicional()));
        FotoAmpliandoTurismo3.setImageResource(moldeTurismo.getFotoAdicional2());
        valoracionampliandoturismo.setRating(moldeTurismo.getValoracion());
    }

}


;