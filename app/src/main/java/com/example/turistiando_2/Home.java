package com.example.turistiando_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //ZONA DE ATRIBUTOS
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonTurismo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonTurismo=findViewById(R.id.botonsitiosturisticos);

        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "hice click", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
