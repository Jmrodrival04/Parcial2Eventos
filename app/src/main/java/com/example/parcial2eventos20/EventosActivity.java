package com.example.parcial2eventos20;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import java.util.ArrayList;

public class EventosActivity extends AppCompatActivity {

    private Button btnAgregarEvento;
    private ListView listaEventos;
    private ArrayList<String> eventos;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        btnAgregarEvento = findViewById(R.id.btnAgregarEvento);
        listaEventos = findViewById(R.id.listaEventos);

        // Inicializar lista y adaptador
        eventos = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, eventos);
        listaEventos.setAdapter(adapter);

        // Agregar evento
        btnAgregarEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAgregarEventoDialog();
            }
        });
    }

    private void showAgregarEventoDialog() {
        // Crear el diálogo
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogView = getLayoutInflater().inflate(R.layout.dialog_agregar_evento, null);

        // Referencias a los EditText y el botón del diálogo
        final EditText etNombreEvento = dialogView.findViewById(R.id.etNombreEvento);
        final EditText etDescripcionEvento = dialogView.findViewById(R.id.etDescripcionEvento);
        final EditText etFechaEvento = dialogView.findViewById(R.id.etFechaEvento);
        final EditText etPrecioEvento = dialogView.findViewById(R.id.etPrecioEvento);
        final Button btnGuardarEvento = dialogView.findViewById(R.id.btnGuardarEvento);

        // Configurar el diseño del diálogo
        builder.setView(dialogView);
        AlertDialog dialog = builder.create();
        dialog.show();

        // Lógica del botón "Guardar Evento"
        btnGuardarEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los valores ingresados
                String nombre = etNombreEvento.getText().toString();
                String descripcion = etDescripcionEvento.getText().toString();
                String fecha = etFechaEvento.getText().toString();
                String precio = etPrecioEvento.getText().toString();

                // Validar campos
                if (nombre.isEmpty() || descripcion.isEmpty() || fecha.isEmpty() || precio.isEmpty()) {
                    Toast.makeText(EventosActivity.this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Agregar el evento a la lista
                    String evento = nombre + " - " + descripcion + " - " + fecha + " - " + precio;
                    eventos.add(evento);
                    adapter.notifyDataSetChanged();
                    dialog.dismiss();
                    Toast.makeText(EventosActivity.this, "Evento agregado correctamente", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
