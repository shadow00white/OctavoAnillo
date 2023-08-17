package com.example.septimoanillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SitiosHome extends AppCompatActivity {


    Button botonvermas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_home);

        botonvermas=findViewById(R.id.botonsitios);
        botonvermas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(SitiosHome.this,ListaSitiosTuristicos.class);
                startActivity(intent);
            }
        });
    }
}