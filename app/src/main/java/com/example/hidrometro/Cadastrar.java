package com.example.hidrometro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.NumberPicker;
import android.widget.TextView;

public class Cadastrar extends AppCompatActivity {

    private NumberPicker picker[] = new NumberPicker[8];
    private TextView txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        picker[0] = findViewById(R.id.numberpicker1);
        picker[1] = findViewById(R.id.numberpicker2);
        picker[2] = findViewById(R.id.numberpicker3);
        picker[3] = findViewById(R.id.numberpicker4);
        picker[4] = findViewById(R.id.numberpicker5);
        picker[5] = findViewById(R.id.numberpicker6);
        picker[6] = findViewById(R.id.numberpicker7);
        picker[7] = findViewById(R.id.numberpicker8);

        txt1 = findViewById(R.id.txtLeituraInicial);
        txt2 = findViewById(R.id.txtLeituraFinal);

        txt1.setText(R.string.label_leitura_inicial);
        txt2.setText(R.string.label_leitura_final);

        for (NumberPicker pickers:picker) {
            configuraNumberPicker(pickers);
        }

        Log.i("teste", Integer.toString(picker[0].getValue()));

    }

    public void configuraNumberPicker(NumberPicker picker) {
        picker.setMaxValue(9);
        picker.setMinValue(0);
    }
}