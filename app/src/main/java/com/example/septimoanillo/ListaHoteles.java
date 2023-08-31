package com.example.septimoanillo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.septimoanillo.moldes.MoldeHotel;

import java.util.ArrayList;

import adaptadores.AdaptadorHoteles;

public class ListaHoteles extends AppCompatActivity {


    ArrayList <MoldeHotel> ListaHoteles=new ArrayList<>();
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView=findViewById(R.id.Listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorHoteles adaptadorHoteles=new AdaptadorHoteles(ListaHoteles);
        recyclerView.setAdapter(adaptadorHoteles);


    }

    public void llenarListaConDatos(){
        ListaHoteles.add(new MoldeHotel("Refugio","80.000$","3005629122",R.drawable.hotel1));
        ListaHoteles.add(new MoldeHotel("Ecotel","100.000$","3217229715",R.drawable.hotelmulata2));
        ListaHoteles.add(new MoldeHotel("Parador","200.000$","3217229715",R.drawable.hotelparador3));
        ListaHoteles.add(new MoldeHotel("Rio Claro","150.000$","3217229715",R.drawable.hotelrioclaro4));
        ListaHoteles.add(new MoldeHotel("Leña seca","70.000$","3217229715",R.drawable.refugio5));

    }

}