package com.example.septimoanillo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.septimoanillo.moldes.MoldeHotel;
import com.example.septimoanillo.moldes.MoldeRestaurante;
import com.example.septimoanillo.moldes.MoldeTurismo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.AbstractCollection;
import java.util.ArrayList;


import adaptadores.AdaptadorHoteles;
import adaptadores.AdaptadorTurismo;

public class ListaSitiosTuristicos extends AppCompatActivity {

    ArrayList<MoldeTurismo> ListaTurismo=new ArrayList<>();
    RecyclerView recyclerView;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios_turisticos);
        recyclerView=findViewById(R.id.Listadinamicaturismo);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));


        llenarListaConDatosT();
        AdaptadorTurismo adaptadorTurismo = new AdaptadorTurismo(ListaTurismo);
        recyclerView.setAdapter(adaptadorTurismo);

        db.collection("sitios")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                String nombreSitio = document.getString("nombre");
                                String precioSitio = document.getString("precio");
                                String DescripcionSitio=document.getString("descripcion");
                                String TelefonoSitio=document.getString("telefono");

                                Toast.makeText(ListaSitiosTuristicos.this, nombreSitio, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaSitiosTuristicos.this, precioSitio, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaSitiosTuristicos.this, DescripcionSitio, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaSitiosTuristicos.this, TelefonoSitio, Toast.LENGTH_SHORT).show();
                                // Aquí puedes crear un objeto MoldeHotel con los datos y agregarlo a la lista
                                // Ejemplo:

                            }

                            // Una vez que hayas agregado todos los hoteles a listaHoteles, configura el adaptador
                            AdaptadorTurismo adaptadorTurismo = new AdaptadorTurismo (ListaTurismo);
                            recyclerView.setAdapter(adaptadorTurismo);

                        } else {
                            Toast.makeText(ListaSitiosTuristicos.this, "Error al obtener datos", Toast.LENGTH_SHORT).show();
                        }
                    }
                });


    }
    public void    llenarListaConDatosT(){
        ListaTurismo.add( new MoldeTurismo("Garrocha","info@rioclaroreservanatural.com", "3008428286", "200.000$",R.drawable.sitioturistico1,"Un emocionante desafío de destreza y valentía que te hace sentir volar por los aires",R.drawable.ampliandositio10,R.drawable.ampliandositio0,4f));
        ListaTurismo.add( new MoldeTurismo("Caminanata en Cuevas","info@rioclaroreservanatural.com", "3008565232", "150.000$",R.drawable.sitioturistico2,"una aventura subterránea que despierta maravillas naturales y misterios ocultos",R.drawable.ampliandositio2,R.drawable.ampliandositio3,4f));
        ListaTurismo.add( new MoldeTurismo("Rafting","info@rioclaroreservanatural.com", "3008565532", "80.000$",R.drawable.sitioturistico4,"Adrenalina pura mientras navegas aguas turbulentas rodeado de paisajes impresionantes y amigos aventureros",R.drawable.ampliandositio4,R.drawable.ampliandositio5,3f));
        ListaTurismo.add( new MoldeTurismo("Espeolologia","info@rioclaroreservanatural.com", "3008565532", "100.000$",R.drawable.sitioturistico5,"La espeleología revela un mundo subterráneo de maravillas ocultas y misterios geológicos fascinantes por descubrir",R.drawable.ampliandositio6,R.drawable.ampliandositio7,5f));
        ListaTurismo.add( new MoldeTurismo("Avistamiento de aves","info@rioclaroreservanatural.com", "3008565532", "170.000$",R.drawable.sitioturistico6jpg,"Una experiencia tranquila y gratificante que te conecta con la naturaleza y la biodiversidad",R.drawable.ampliandositio8,R.drawable.aves2,5f));

    }

}



