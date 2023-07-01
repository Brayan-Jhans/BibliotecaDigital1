package com.example.bibliotecadigital;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResourceDetailActivity extends AppCompatActivity {

    private TextView Titulotv;
    private TextView Autortv;
    private TextView Descripciontv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource_detalle);

        Titulotv = findViewById(R.id.Titulotv);
        Autortv = findViewById(R.id.Autortv);
        Descripciontv = findViewById(R.id.Descripciontv);

        // Obtener los datos del recurso seleccionado
        String title = getIntent().getStringExtra("title");
        String author = getIntent().getStringExtra("author");
        String description = getIntent().getStringExtra("description");

        // Mostrar los detalles del recurso en la interfaz de usuario
        Titulotv.setText(title);
        Autortv.setText(author);
        Descripciontv.setText(description);
    }
}

