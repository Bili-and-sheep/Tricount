package com.example.tricount;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView tricountRecyclerView;
    private TricountAdapter tricountAdapter;
    private ArrayList<Tricount> tricountList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tricountRecyclerView = findViewById(R.id.tricountRecyclerView);
        tricountRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        tricountList = new ArrayList<>();
        loadTricounts(); // Charge les Tricounts

        tricountAdapter = new TricountAdapter(tricountList, new TricountAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Tricount tricount) {
                Intent intent = new Intent(MainActivity.this, DetailsTricountActivity.class);
                intent.putExtra("tricount", tricount); // Passer l'objet Tricount à l'activité des détails
                startActivity(intent);
            }
        });

        tricountRecyclerView.setAdapter(tricountAdapter);

        Button createTricountButton = findViewById(R.id.createTricountButton);
        createTricountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateTricountActivity.class);
                startActivity(intent);
            }
        });
    }

    private void loadTricounts() {
        // Ajoute des Tricounts à la liste (remplacer cela par un chargement dynamique plus tard)
        tricountList.add(new Tricount("Tricount 1", "Type A"));
        tricountList.add(new Tricount("Tricount 2", "Type B"));
    }
}
