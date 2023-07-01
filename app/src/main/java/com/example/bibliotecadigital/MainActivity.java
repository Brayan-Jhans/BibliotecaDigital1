package com.example.bibliotecadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText usuarioTextView;
    private EditText contrasenaTextView;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.session);

        usuarioTextView = findViewById(R.id.Usuariotv);
        contrasenaTextView = findViewById(R.id.Contraseñatv);
        boton = findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para el botón "INICIAR"
                // Aquí puedes realizar las acciones necesarias al hacer clic en el botón
            }
        });
    }
}
