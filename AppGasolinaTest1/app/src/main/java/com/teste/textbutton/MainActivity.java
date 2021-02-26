package com.teste.textbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calcular(View view) {

        TextInputEditText precoGasolina = findViewById(R.id.gasolina);
        TextInputEditText precoAlcool = findViewById(R.id.alcool);
        TextView resultado = findViewById(R.id.resultado);

        String gasolina = precoGasolina.getText().toString();
        String alcool = precoAlcool.getText().toString();
        Double valorAlcool = Double.parseDouble(alcool);
        Double valorGasolina = Double.parseDouble(gasolina);
        Boolean camposValidados = validarcampos(gasolina,alcool);

        if (camposValidados){

            if (valorAlcool/valorGasolina >= 0.7){
                resultado.setText("Melhor abastercer gasolina");}
            else {resultado.setText("Melhor abastecer alcool");}
        }

        else {resultado.setText("Prenecha os dados primeiro");}

    }

        public Boolean validarcampos (String pAlcool, String pGasolina){
        Boolean camposValidados = true;

        if (pAlcool.equals("")){camposValidados = false;}
        else if (pGasolina.equals("")){camposValidados=false;}
        return  camposValidados;

        }


}