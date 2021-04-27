package com.example.inventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.firebase.FirebaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {



    private ImageButton ButtonNegocio1;
    private  ImageButton ButtonNegocio2;
    private  ImageButton ButtonInventario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ButtonInventario = findViewById(R.id.Buttoninventario);
        ButtonNegocio1 = findViewById(R.id.ButtonNegocio1);
        ButtonNegocio2 = findViewById(R.id.ButtonNegocio2);


        //Funcion de las ImagenButton

        ButtonInventario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,inventario.class));

            }
        });

        ButtonNegocio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,Negocio1.class));

            }
        });

        ButtonNegocio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,Negocio2.class));

            }
        });
}


}