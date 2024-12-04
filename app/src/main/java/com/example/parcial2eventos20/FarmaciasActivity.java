package com.example.parcial2eventos20;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class FarmaciasActivity extends AppCompatActivity {

    private ListView listaFarmacias;
    private ArrayList<Farmacia> farmacias;
    private ArrayList<String> nombresFarmacias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmacias);

        listaFarmacias = findViewById(R.id.listaFarmacias);
        farmacias = new ArrayList<>();
        nombresFarmacias = new ArrayList<>();

        cargarFarmacias();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nombresFarmacias);
        listaFarmacias.setAdapter(adapter);

        listaFarmacias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Farmacia farmacia = farmacias.get(position);
                String uri = "geo:0,0?q=" + Uri.encode(farmacia.getDireccion());
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }

    private void cargarFarmacias() {
        // Datos ficticios para las farmacias
        farmacias.add(new Farmacia("Farmacia 1", "123456789", "Plaza del Pilar, Zaragoza"));
        farmacias.add(new Farmacia("Farmacia 2", "987654321", "Avenida Goya, Zaragoza"));
        farmacias.add(new Farmacia("Farmacia 3", "654321987", "Calle Alfonso, Zaragoza"));

        for (Farmacia farmacia : farmacias) {
            nombresFarmacias.add(farmacia.getNombre() + " - " + farmacia.getTelefono());
        }
    }
}
