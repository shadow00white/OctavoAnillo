package com.example.septimoanillo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.septimoanillo.moldes.MoldeHotel;
import com.example.septimoanillo.moldes.MoldeRestaurante;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.AbstractCollection;
import java.util.ArrayList;


import adaptadores.AdaptadorHoteles;
import adaptadores.AdaptadorRestaurante;

public class ListaRestaurante extends AppCompatActivity {

    ArrayList <MoldeRestaurante>  ListaRestaurante= new ArrayList<>();
    RecyclerView recyclerView;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurante);
        recyclerView=findViewById(R.id.Listadinamicarestaurante);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatosR();
        AdaptadorRestaurante adaptadorRestaurante=new AdaptadorRestaurante(ListaRestaurante);
        recyclerView.setAdapter(adaptadorRestaurante);

        db.collection("restaurantes")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            AbstractCollection<MoldeRestaurante> listaRestaurante;
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                String nombreRestaurante = document.getString("nombre");
                                String precioRestaurante = document.getString("precio");
                                String DescripcionRestaurante=document.getString("descripcion");
                                String TelefonoRestaurante=document.getString("telefono");

                                Toast.makeText(ListaRestaurante.this, nombreRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestaurante.this, precioRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestaurante.this, DescripcionRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestaurante.this, TelefonoRestaurante, Toast.LENGTH_SHORT).show();
                                // Aquí puedes crear un objeto MoldeHotel con los datos y agregarlo a la lista
                                // Ejemplo:

                            }

                            // Una vez que hayas agregado todos los hoteles a listaHoteles, configura el adaptador
                            AdaptadorRestaurante adaptadorRestaurante = new AdaptadorRestaurante(ListaRestaurante);
                            recyclerView.setAdapter(adaptadorRestaurante);

                        } else {
                            Toast.makeText(ListaRestaurante.this, "Error al obtener datos", Toast.LENGTH_SHORT).show();
                        }
                    }
                });



    }
    public void llenarListaConDatosR (){
        ListaRestaurante.add(new MoldeRestaurante("Cascada y Sabor", "3265617845","50.000$","Bandeja Paisa",R.drawable.restaurante1,"El restaurante Cascada y Sabor ofrece sabores auténticos en un entorno natural que deleita los sentidos",R.drawable.ampliandoresta1,R.drawable.ampliandoresta2,4f ));
        ListaRestaurante.add(new MoldeRestaurante("Mesa del Cañón", "89561235","50.000$","Carne a la llanera",R.drawable.restaurante, "Una experiencia gastronómica única que combina sabor y ambiente con maestría excepcional",R.drawable.mesadel1,R.drawable.mesadel2,4f));
        ListaRestaurante.add(new MoldeRestaurante("Rincón Gastronómico ", "389654124","50.000$","Ramen criollo",R.drawable.restaurante3,"Un destino culinario que deslumbra con sus platos exquisitos y atmósfera acogedora",R.drawable.rincongastro1,R.drawable.rincongastro2,4f));
        ListaRestaurante.add(new MoldeRestaurante("Delicias del Rio", "3265623120","50.000$","Variedad del sabor ",R.drawable.restaurante4," Un festín de sabores frescos que te transporta a las orillas de la naturaleza",R.drawable.deliciadelrio1,R.drawable.deliciadelrio2,5f));
        ListaRestaurante.add(new MoldeRestaurante(" Carbón y Leña", "89512356","50.000$"," Sal al Mar",R.drawable.restaurante5,"Carbon y Leña: Donde la brasa y la pasión culinaria se unen para crear platos irresistibles",R.drawable.rincongastro1,R.drawable.rincongastro2,4f));
    }
}

// Falta agregar datos a la lista restaurante// terminar molde sitiosturismo. 