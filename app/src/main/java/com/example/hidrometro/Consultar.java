package com.example.hidrometro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Date;

public class Consultar extends AppCompatActivity {

    private ListView listConsultas;
    private TextView txtConsultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar);

        txtConsultar = findViewById(R.id.txtLeituras);
        listConsultas = findViewById(R.id.ListConsultas);

        txtConsultar.setText(R.string.label_leituras);
        Hidrometro h1 = new Hidrometro(new Date(), 1115, 1130);
        Hidrometro h2 = new Hidrometro(new Date(), 1130, 1150);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        arrayAdapter.add(h1.toString());
        arrayAdapter.add(h2.toString());

        listConsultas.setAdapter(arrayAdapter);
    }
}