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
        ListaRestaurante.add(new MoldeRestaurante("Cascada y Sabor","Josh Prieto", "3265617845","50.000$",R.drawable.restaurante1,"Bandeja Paisa"));
        ListaRestaurante.add(new MoldeRestaurante("Mesa del Cañón","Josh Prieto", "89561235","50.000$",R.drawable.restaurante,"Carne a la llanera"));
        ListaRestaurante.add(new MoldeRestaurante("Rincón Gastronómico ","", "389654124","50.000$",R.drawable.restaurante3,"Ramen criollo"));
        ListaRestaurante.add(new MoldeRestaurante("Delicias del Rio","Jairo la parrilla", "3265623120","50.000$",R.drawable.restaurante4,"Variedad del sabor "));
        ListaRestaurante.add(new MoldeRestaurante(" Carbón y Leña","Doña Paella", "89512356","50.000$",R.drawable.restaurante5," Sal al Mar"));
    }
}

// Falta agregar datos a la lista restaurante// terminar molde sitiosturismo. 