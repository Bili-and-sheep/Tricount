package com.example.tricountlevrai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MesDepensesActivity extends AppCompatActivity {

    private RecyclerView recyclerViewMesDepenses;
    private DepenseAdapter depenseAdapter;
    private List<Depense> depenseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mes_depenses);

        recyclerViewMesDepenses = findViewById(R.id.recyclerViewMesDepenses);
        Button buttonAjouterDepense = findViewById(R.id.buttonAjouterDepense);

        // Initialiser la liste des dépenses
        depenseList = new ArrayList<>();
        // Exemple de données (vous pouvez remplacer cela par vos données réelles)
        depenseList.add(new Depense("Repas cérémonies", 3935));
        depenseList.add(new Depense("J'ai pas d'idée", -936));

        // Configurer RecyclerView
        depenseAdapter = new DepenseAdapter(depenseList);
        recyclerViewMesDepenses.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewMesDepenses.setAdapter(depenseAdapter);

        // Gestion du bouton d'ajout de dépense
        buttonAjouterDepense.setOnClickListener(v -> {
            Toast.makeText(MesDepensesActivity.this, "Ajouter une dépense", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MesDepensesActivity.this, AddDepenseActivity.class);
            startActivity(intent);
        });
    }
}
