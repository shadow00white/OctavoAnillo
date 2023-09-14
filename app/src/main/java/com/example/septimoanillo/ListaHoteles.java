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
        ListaHoteles.add(new MoldeHotel("Refugio","80.000$","3005629122",R.drawable.hotel1," Elegancia y serenidad se fusionan. Vistas asombrosas, atención impecable y escape perfecto para relajarse.",R.drawable.refugio2, R.drawable.refugio3, 2f));
        ListaHoteles.add(new MoldeHotel("Ecotel","100.000$","3217229715",R.drawable.hotelmulata2,"El Hotel Mulata: Una joya oculta con servicio impecable, vistas impresionantes y comodidad inigualable.",R.drawable.mulata2,R.drawable.mulata21,3f));
        ListaHoteles.add(new MoldeHotel("Parador","200.000$","3217229715",R.drawable.hotelparador3,"Experiencia excepcional, servicio atento, comodidad de primer nivel y vistas deslumbrantes. ¡Recomendado absolutamente!",R.drawable.parador2,R.drawable.parador3,5f));
        ListaHoteles.add(new MoldeHotel("Rio Claro","150.000$","3217229715",R.drawable.hotelrioclaro4,"El Hotel Río Claro ofrece encanto rústico, naturaleza exuberante y una serenidad inigualable. Una escapada inolvidable.",R.drawable.rio2,R.drawable.rio3,4f));
        ListaHoteles.add(new MoldeHotel("Leña seca","70.000$","3217229715",R.drawable.refugio5," Ambiente acogedor, personal amable, deliciosa comida y vistas impresionantes. Una estancia memorable y relajante.",R.drawable.lena2,R.drawable.lena3,4.5f));


    }

}