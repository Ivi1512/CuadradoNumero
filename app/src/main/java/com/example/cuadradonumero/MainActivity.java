package com.example.cuadradonumero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtNumero = null;
    private TextView txtResultado = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNumero = (EditText)findViewById(R.id.edtNumero);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
    }

    public void CalcularCuadrado(View v) {
       // Button boton = (Button) v;
       // boton.setText("Cambio el texto");
        String textonumero = String.valueOf(edtNumero.getText());
        double numero = Double.valueOf(textonumero);
        double resultado = numero * numero;
        txtResultado.setText(String.valueOf(resultado));
        //Toast.makeText(this, "El cuadrado vale " + String.valueOf(resultado), Toast.LENGTH_LONG).show();

    }
}