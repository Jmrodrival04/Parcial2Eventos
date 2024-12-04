package com.example.parcial2eventos20;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class HorarioActivity extends AppCompatActivity {

    private EditText etAsignatura, etDia, etHora;
    private Button btnAgregarHorario;
    private ListView listaHorarios;
    private ArrayList<String> horarios;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario);

        etAsignatura = findViewById(R.id.etAsignatura);
        etDia = findViewById(R.id.etDia);
        etHora = findViewById(R.id.etHora);
        btnAgregarHorario = findViewById(R.id.btnAgregarHorario);
        listaHorarios = findViewById(R.id.listaHorarios);

        horarios = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, horarios);
        listaHorarios.setAdapter(adapter);

        btnAgregarHorario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String asignatura = etAsignatura.getText().toString();
                String dia = etDia.getText().toString();
                String hora = etHora.getText().toString();

                if (asignatura.isEmpty() || dia.isEmpty() || hora.isEmpty()) {
                    Toast.makeText(HorarioActivity.this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    String horario = asignatura + " - " + dia + " - " + hora;
                    horarios.add(horario);
                    adapter.notifyDataSetChanged();
                    etAsignatura.setText("");
                    etDia.setText("");
                    etHora.setText("");
                    Toast.makeText(HorarioActivity.this, "Horario agregado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
