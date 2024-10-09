package com.example.tricountlevrai;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CreateTricountActivity extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextType;
    private EditText editTextParticipants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_tricount);

        editTextName = findViewById(R.id.tricountName);
        editTextType = findViewById(R.id.tricountType);
        editTextParticipants = findViewById(R.id.tricountParticipants);
        Button buttonCreate = findViewById(R.id.createButton);

        buttonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tricountName = editTextName.getText().toString();
                String tricountType = editTextType.getText().toString();
                String tricountParticipants = editTextParticipants.getText().toString();

                if (tricountName.isEmpty() || tricountType.isEmpty()) {
                    Toast.makeText(CreateTricountActivity.this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Créez un nouveau Tricount
                Tricount newTricount = new Tricount(0, tricountName, "date_now", tricountType); // Créez votre instance avec les valeurs appropriées
                // Ajoutez la logique pour enregistrer ce Tricount dans votre liste ou autre
                Toast.makeText(CreateTricountActivity.this, "Tricount créé avec succès", Toast.LENGTH_SHORT).show();
                finish(); // Retour à l'activité précédente
            }
        });
    }
}
