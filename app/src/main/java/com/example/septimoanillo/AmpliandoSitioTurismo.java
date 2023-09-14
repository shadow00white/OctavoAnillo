package com.example.septimoanillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.septimoanillo.moldes.MoldeRestaurante;
import com.example.septimoanillo.moldes.MoldeTurismo;

public class AmpliandoSitioTurismo extends AppCompatActivity {

    MoldeTurismo moldeTurismo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_sitio_turismo);

        moldeTurismo=(MoldeTurismo) getIntent().getSerializableExtra("datosturismo");
        Toast.makeText(this, moldeTurismo.getNombreTurismo(), Toast.LENGTH_LONG).show();

    }
}


;