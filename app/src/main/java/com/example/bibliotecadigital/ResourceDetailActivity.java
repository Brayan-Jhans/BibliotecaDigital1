package com.example.bibliotecadigital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ResourceDetailActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText Titulotv;
    private EditText Autortv;
    private EditText Descripciontv;
    private Button botonBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource_detalle);

        Titulotv = findViewById(R.id.Titulotv);
        Autortv = findViewById(R.id.Autortv);
        Descripciontv = findViewById(R.id.Descripciontv);
        botonBuscar = findViewById(R.id.botonBuscar);

        botonBuscar.setOnClickListener(this);

        // Obtener los datos del recurso seleccionado
        String title = getIntent().getStringExtra("title");
        String author = getIntent().getStringExtra("author");
        String description = getIntent().getStringExtra("description");

        // Mostrar los detalles del recurso en la interfaz de usuario
        Titulotv.setText(title);
        Autortv.setText(author);
        Descripciontv.setText(description);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.botonBuscar) {
            buscarLibro();
        }
    }

    private void buscarLibro() {
        // Lógica para buscar el libro según los criterios ingresados en los EditText
        String titulo = Titulotv.getText().toString();
        String autor = Autortv.getText().toString();
        String descripcion = Descripciontv.getText().toString();

        // Aquí puedes realizar la búsqueda real y mostrar los resultados como desees
        // Por ejemplo, puedes iniciar una nueva actividad o mostrar un Toast con los resultados
        // En este ejemplo, simplemente mostraremos los criterios de búsqueda en un Toast
        String mensaje = "Búsqueda de libro\nTítulo: " + titulo + "\nAutor: " + autor + "\nDescripción: " + descripcion;
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }
}
