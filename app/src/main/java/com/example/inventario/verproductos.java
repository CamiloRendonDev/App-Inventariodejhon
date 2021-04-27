package com.example.inventario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class verproductos extends AppCompatActivity {

    Button btnverproductos;
    ListView lvproducto;
    Mesero mimesero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verproductos);
    }
}