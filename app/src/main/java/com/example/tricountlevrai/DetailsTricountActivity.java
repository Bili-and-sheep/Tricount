package com.example.tricountlevrai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsTricountActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView typeTextView;
    private Button editTricountButton;
    private Button addParticipantButton;
    private Button deleteTricountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_tricount);

        nameTextView = findViewById(R.id.tricountNameTextView);
        typeTextView = findViewById(R.id.tricountTypeTextView);
        addParticipantButton = findViewById(R.id.addParticipantButton);
        editTricountButton = findViewById(R.id.editTricountButton);
        deleteTricountButton = findViewById(R.id.deleteTricountButton);

        Tricount tricount = (Tricount) getIntent().getSerializableExtra("tricount");

        if (tricount != null) {
            nameTextView.setText(tricount.getName());
            typeTextView.setText(tricount.getType());
        } else {
            nameTextView.setText("Aucun tricount sélectionné");
            typeTextView.setText("");
        }

        editTricountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Logique pour éditer le tricount
                Intent intent = new Intent(DetailsTricountActivity.this, EditTricountActivity.class);
                intent.putExtra("tricount", tricount);
                startActivity(intent);
            }
        });

        addParticipantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Logique pour ajouter un participant
                Intent intent = new Intent(DetailsTricountActivity.this, AddParticipantActivity.class);
                intent.putExtra("tricount", tricount);
                startActivity(intent);
            }
        });

        deleteTricountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Logique pour supprimer le tricount
                Toast.makeText(DetailsTricountActivity.this, "Tricount supprimé", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}