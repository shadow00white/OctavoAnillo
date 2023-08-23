package com.example.septimoanillo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.septimoanillo.moldes.MoldeRestaurante;

import java.util.ArrayList;


import adaptadores.AdaptadorRestaurante;

public class ListaRestaurante extends AppCompatActivity {

    ArrayList <MoldeRestaurante>  ListaRestaurante= new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurante);
        recyclerView=findViewById(R.id.Listadinamicarestaurante);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatosR();
        AdaptadorRestaurante adaptadorRestaurante=new AdaptadorRestaurante(ListaRestaurante);
        recyclerView.setAdapter(adaptadorRestaurante);

    }
    public void llenarListaConDatosR (){
        ListaRestaurante.add(new MoldeRestaurante("Cascadas y Sabores","Josh Prieto", "3265617845","50.000$",R.drawable.restaurante1,"Bandeja Paisa"));
        ListaRestaurante.add(new MoldeRestaurante("Mesa del Cañón","Josh Prieto", "3265617845","50.000$",R.drawable.restaurante1,"Bandeja Paisa"));
        ListaRestaurante.add(new MoldeRestaurante("Rincón Gastronómico ","Josh Prieto", "3265617845","50.000$",R.drawable.restaurante1,"Bandeja Paisa"));
        ListaRestaurante.add(new MoldeRestaurante("Delicias del Rio","Josh Prieto", "3265617845","50.000$",R.drawable.restaurante1,"Bandeja Paisa"));
        ListaRestaurante.add(new MoldeRestaurante(" Carbón y Le{a","Josh Prieto", "3265617845","50.000$",R.drawable.restaurante1,"Bandeja Paisa"));
    }
}