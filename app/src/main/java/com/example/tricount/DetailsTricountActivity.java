package com.example.tricount;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsTricountActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView typeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_tricount);

        nameTextView = findViewById(R.id.tricountNameTextView);
        typeTextView = findViewById(R.id.tricountTypeTextView);

        // Récupérer l'objet Tricount
        Tricount tricount = (Tricount) getIntent().getSerializableExtra("tricount");

        // Afficher les informations
        if (tricount != null) {
            nameTextView.setText(tricount.getName());
            typeTextView.setText(tricount.getType());
        }
    }
}