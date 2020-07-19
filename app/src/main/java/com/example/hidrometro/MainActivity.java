package com.example.hidrometro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnCadastrarLeituras, btnConsultarLeituras, btnEncerrar;
    private Intent it;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCadastrarLeituras = findViewById(R.id.btnCadastrarLeituras);
        btnConsultarLeituras = findViewById(R.id.btnConsultarLeituras);
        btnEncerrar = findViewById(R.id.btnEncerrar);

        btnCadastrarLeituras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it = new Intent(MainActivity.this, Cadastrar.class);
                startActivity(it);
            }
        });

        btnConsultarLeituras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it = new Intent(MainActivity.this, Consultar.class);
                startActivity(it);
            }
        });

        btnEncerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });
    }

}