package com.teste.appgasolina_test3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

    public void calcular (View view){
        TextView resultado = findViewById(R.id.textView2);
        TextInputEditText valorGasolina = findViewById(R.id.gasolina);
        TextInputEditText valorAlcool = findViewById(R.id.alcool);

        String vgasolina = valorGasolina.getText().toString();
        String valcool = valorAlcool.getText().toString();
        Boolean validar = refazer(vgasolina, valcool);

        if (validar) {

            Double numerosGasolina = Double.parseDouble(vgasolina);
            Double numeroAlcool = Double.parseDouble(valcool);
            Double resultadoDivisão = numeroAlcool/numerosGasolina;
            if (resultadoDivisão>=0.7) {resultado.setText("Melhor utilizar Gasolina");}
            else {resultado.setText("Melhor utilizar Alcool");}
           } else {resultado.setText("Preencha os dados");}}

        public Boolean refazer (String vgasolina,String valcool)
        {Boolean camposvalidos = true;

        if (valcool.equals("")){camposvalidos = false;}
        else if (vgasolina.equals("")){camposvalidos = false;} return camposvalidos;}

}