package com.example.parcial2eventos20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnHorario, btnEventos, btnFarmacias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar botones
        btnHorario = findViewById(R.id.btn_horario);
        btnEventos = findViewById(R.id.btn_eventos);
        btnFarmacias = findViewById(R.id.btn_farmacias);

        // Navegar a Actividad Horarios
        btnHorario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HorarioActivity.class);
                startActivity(intent);
            }
        });

        // Navegar a Actividad Eventos
        btnEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EventosActivity.class);
                startActivity(intent);
            }
        });

        // Navegar a Actividad Farmacias
        btnFarmacias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FarmaciasActivity.class);
                startActivity(intent);
            }
        });
    }
}
