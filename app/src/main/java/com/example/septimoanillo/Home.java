package com.example.septimoanillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class Home extends AppCompatActivity {
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonSitios;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        botonHoteles = findViewById(R.id.botonhoteles);
        botonRestaurantes = findViewById(R.id.botonrestaurantes);
        botonSitios = findViewById(R.id.botonsitios);
        //detectando eventos
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHoteles=new Intent(Home.this,HotelesHome.class);
                startActivity(intentHoteles);
            }
        });
        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRestaurantes=new Intent(Home.this,RestaurantesHome.class);
                startActivity(intentRestaurantes);
            }
        });
        botonSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSitios=new Intent(Home.this,SitiosHome.class);
                startActivity(intentSitios);
            }
        });
    }

    public void cambiarIdioma(String idioma){

        Locale lenguaje=new Locale(idioma);
        Locale.setDefault(lenguaje);


        Configuration configuracionTelefono=getResources().getConfiguration();
        configuracionTelefono.locale=lenguaje;


        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int itemSeleccionado = item.getItemId();
        if (itemSeleccionado == R.id.opcion1) {
            this.cambiarIdioma("en");
            Intent intentIngles = new Intent(Home.this, Home.class);
            startActivity(intentIngles);
        } else if (itemSeleccionado == R.id.opcion2) {
            this.cambiarIdioma("es");
            Intent intentEspanol = new Intent(Home.this, Home.class);
            startActivity(intentEspanol);
        } else if (itemSeleccionado == R.id.opcion3) {
            this.cambiarIdioma("it");
            Intent intentItaliano = new Intent(Home.this, Home.class);
            startActivity(intentItaliano);
        } else if (itemSeleccionado == R.id.opcion4) {
            Intent intent = new Intent(Home.this, Acerca.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }


}