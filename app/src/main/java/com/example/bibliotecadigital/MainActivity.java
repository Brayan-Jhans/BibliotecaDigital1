package com.example.bibliotecadigital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText usuarioTextView;
    private EditText contrasenaTextView;
    private Button botonRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.session);

        usuarioTextView = findViewById(R.id.usuarioTextView);
        contrasenaTextView = findViewById(R.id.contrasenaTextView);
        botonRegistrar = findViewById(R.id.botonRegistrar);

        botonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = usuarioTextView.getText().toString();
                String contrasena = contrasenaTextView.getText().toString();

                // Validar si el usuario y contraseña están vacíos
                if (usuario.isEmpty() || contrasena.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Ingrese usuario y contraseña", Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(MainActivity.this, "Usuario registrado correctamente", Toast.LENGTH_SHORT).show();


                    Intent intent = new Intent(MainActivity.this, ResourceDetailActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
