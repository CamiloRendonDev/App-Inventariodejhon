package com.example.inventario;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Paginaprinciapl extends AppCompatActivity {

    FirebaseDatabase mibasededatos;
    DatabaseReference mireferencia;

    EditText edcod;
    Button enviarcodigo;
    ArrayList<Mesero> Listameseros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paginaprinciapl);

        enviarcodigo=findViewById(R.id.Botoningresar);
        edcod=findViewById(R.id.ETNombremesero);

        mibasededatos= FirebaseDatabase.getInstance();
        mireferencia = mibasededatos.getReference();
        Listameseros = new ArrayList<>();

        mireferencia.child("Mesero").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.hasChildren()){
                    Listameseros.clear();
                    for(DataSnapshot mimesero:snapshot.getChildren()){
                        Mesero Unmesero  = mimesero.getValue(Mesero.class);
                        Listameseros.add(Unmesero);

                    }

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        enviarcodigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String codigo =  edcod.getText().toString();
                boolean correcto = false;


                for (Mesero mimesero : Listameseros){
                    if (codigo.equalsIgnoreCase(mimesero.id)){
                        correcto = true;
                    startActivity(new Intent(Paginaprinciapl.this,MainActivity.class));

                    }
                }
                if(!correcto){
                    Toast.makeText(Paginaprinciapl.this, "Nombre de usuario no existe", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Mesero camilo = new Mesero("camiloid123","Camilo");
        //mireferencia.child("Mesero").child(camilo.id).setValue(camilo);
    }
}