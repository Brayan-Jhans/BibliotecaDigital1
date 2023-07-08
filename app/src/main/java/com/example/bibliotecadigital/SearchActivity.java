package com.example.bibliotecadigital;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {

    private TextView resultadosTextView;

    private Button searchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        resultadosTextView = findViewById(R.id.resultadosTextView);
        Button searchButton = findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String query = obtenerTextoConsulta();
                String resultados = buscarRecursos(query);
                mostrarResultados(resultados);
            }
        });
    }

    private String obtenerTextoConsulta() {
        EditText searchEditText = findViewById(R.id.searchEditText);
        return searchEditText.getText().toString();
    }
    private String buscarRecursos(String query) {
        return "Resultados de búsqueda para: " + query;
    }
    private void mostrarResultados(String resultados) {
        resultadosTextView.setText(resultados);
    }
}

