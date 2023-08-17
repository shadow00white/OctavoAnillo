package com.example.septimoanillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HotelesHome extends AppCompatActivity {


    Button botonVermas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles_home);

        botonVermas=findViewById(R.id.botonhoteles);

        botonVermas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelesHome.this,ListaHoteles.class);
                startActivity(intent);
            }
        });


    }

}