package com.example.septimoanillo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.septimoanillo.moldes.MoldeHotel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.AbstractCollection;
import java.util.ArrayList;

import adaptadores.AdaptadorHoteles;

public class ListaHoteles extends AppCompatActivity {


    ArrayList <MoldeHotel> ListaHoteles=new ArrayList<>();
    RecyclerView recyclerView;
    FirebaseFirestore db = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView=findViewById(R.id.Listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorHoteles adaptadorHoteles=new AdaptadorHoteles(ListaHoteles);
        recyclerView.setAdapter(adaptadorHoteles);
        db.collection("hoteles")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            AbstractCollection<MoldeHotel> listaHoteles;
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                String nombreHotel = document.getString("nombre");
                                String precioHotel = document.getString("precio");
                                String DescripcionHotel=document.getString("descripcion");
                                String Telefonohotel=document.getString("telefono");

                                Toast.makeText(ListaHoteles.this, nombreHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, precioHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, DescripcionHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this,Telefonohotel , Toast.LENGTH_SHORT).show();
                                // Aquí puedes crear un objeto MoldeHotel con los datos y agregarlo a la lista
                                // Ejemplo:

                            }

                            // Una vez que hayas agregado todos los hoteles a listaHoteles, configura el adaptador
                            AdaptadorHoteles adaptadorHotel = new AdaptadorHoteles(ListaHoteles);
                            recyclerView.setAdapter(adaptadorHotel);

                        } else {
                            Toast.makeText(ListaHoteles.this, "Error al obtener datos", Toast.LENGTH_SHORT).show();
                        }
                    }
                });



    }

    public void llenarListaConDatos(){
        ListaHoteles.add(new MoldeHotel("Refugio","80.000$","3005629122",R.drawable.hotel1," Elegancia y serenidad se fusionan. Vistas asombrosas, atención impecable y escape perfecto para relajarse.",R.drawable.refugio2, R.drawable.refugio3, 2f));
        ListaHoteles.add(new MoldeHotel("Ecotel","100.000$","3217229715",R.drawable.hotelmulata2,"  Una joya oculta con servicio impecable, vistas impresionantes y comodidad inigualable.",R.drawable.mulata2,R.drawable.mulata21,3f));
        ListaHoteles.add(new MoldeHotel("Parador","200.000$","3217229715",R.drawable.hotelparador3,"Experiencia excepcional, servicio atento, comodidad de primer nivel y vistas deslumbrantes. ¡Recomendado absolutamente!",R.drawable.parador2,R.drawable.parador3,5f));
        ListaHoteles.add(new MoldeHotel("Rio Claro","150.000$","3217229715",R.drawable.hotelrioclaro4,"El Hotel Río Claro ofrece encanto rústico, naturaleza exuberante y una serenidad inigualable. Una escapada inolvidable.",R.drawable.rio2,R.drawable.rio3,4f));
        ListaHoteles.add(new MoldeHotel("Leña seca","70.000$","3217229715",R.drawable.refugio5," Ambiente acogedor, personal amable, deliciosa comida y vistas impresionantes. Una estancia memorable y relajante.",R.drawable.lena2,R.drawable.lena3,4.5f));


    }

}