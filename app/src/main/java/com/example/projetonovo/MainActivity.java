package com.example.projetonovo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void somar(View view){
        int valor1 = Integer.parseInt(TxtNum1.getText().toString());
        int valor2 = Integer.parseInt(TxtNum2.getText().toString());

        String resultado = String.valueOf(valor1 + valor2);

        txtResult.setText(resultado);
    }
}