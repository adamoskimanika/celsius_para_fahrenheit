package com.example.ctof;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        TextView head = findViewById(R.id.txt_head);
        TextView info = findViewById(R.id.txt_info);
        TextView result = findViewById(R.id.txt_result);

        EditText edt = findViewById(R.id.edt_number);

        Button btn = findViewById(R.id.btn_calc);



        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
              if (edt.getText().toString().trim().equals("")){
                  Context contexto = getApplicationContext();
                  String texto = "INFORME UM VALOR";

                  int duracao = Toast.LENGTH_LONG;
                  Toast toast = Toast.makeText(contexto, texto,duracao);
                  toast.show();

              }
             else{
               double valor = 0;
               double resultado = 0;

               valor = Double.parseDouble(edt.getText().toString());

               resultado = (valor*1.8)+32;
                   result.setText(" " + resultado);
               }



            }
        });


    }
}