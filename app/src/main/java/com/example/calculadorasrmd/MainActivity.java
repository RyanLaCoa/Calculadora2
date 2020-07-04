package com.example.calculadorasrmd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView resultado;
    Button suma;
    Button resta;
    Button multiplicar;
    Button division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.edtnumero1);
        num2 = (EditText)findViewById(R.id.edtnumero2);
        resultado = (TextView)findViewById(R.id.textoresultado);
        suma = (Button)findViewById(R.id.btnsuma);
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              resultado.setText( suma(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString())  ) + "");

            }
        });
        resta = (Button)findViewById(R.id.btnresta);
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText( resta(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString())  ) + "");
            }
        });
        multiplicar = (Button)findViewById(R.id.btnmultiplicar);
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText( multiplicar(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString())  ) + "");
            }
        });
        division = (Button)findViewById(R.id.btndivision);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText( division(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString())  ) + "");
            }
        });
        public double suma (int a, int b) {
            return a+b;
        }
        public double resta (int a, int b) {
            return a-b;
        }
        public double multiplicar (int a, int b) {
            return a*b;
        }
        public double division (int a, int b) {
            int resultado = 0;
            if (b!=0) {
                resultado = a/b;
        }
    }
}