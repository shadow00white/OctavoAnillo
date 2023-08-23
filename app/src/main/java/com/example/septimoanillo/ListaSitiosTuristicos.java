package com.example.septimoanillo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.septimoanillo.moldes.MoldeHotel;
import com.example.septimoanillo.moldes.MoldeRestaurante;
import com.example.septimoanillo.moldes.MoldeTurismo;

import java.util.ArrayList;


import adaptadores.AdaptadorTurismo;

public class ListaSitiosTuristicos extends AppCompatActivity {

    ArrayList<MoldeTurismo> ListaTurismo=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios_turisticos);
        recyclerView=findViewById(R.id.Listadinamicaturismo);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));


        llenarListaConDatosT();
        AdaptadorTurismo adaptadorTurismo = new AdaptadorTurismo(ListaTurismo);
        recyclerView.setAdapter(adaptadorTurismo);
    }
    public void    llenarListaConDatosT(){
        ListaTurismo.add( new MoldeTurismo("Garrocha","info@rioclaroreservanatural.com", "3008428286", "200.000$",R.drawable.sitioturistico1 ));
        ListaTurismo.add( new MoldeTurismo("Caminanata en Cuevas","info@rioclaroreservanatural.com", "3008565232", "150.000$",R.drawable.sitioturistico2));
        ListaTurismo.add( new MoldeTurismo("Rafting","info@rioclaroreservanatural.com", "3008565532", "80.000$",R.drawable.sitioturistico4));
        ListaTurismo.add( new MoldeTurismo("Espeolologia","info@rioclaroreservanatural.com", "3008565532", "100.000$",R.drawable.sitioturistico5));
        ListaTurismo.add( new MoldeTurismo("Avistamiento de aves","info@rioclaroreservanatural.com", "3008565532", "170.000$",R.drawable.sitioturistico6jpg));

    }

}



