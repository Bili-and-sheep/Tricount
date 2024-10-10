package com.example.tricountlevrai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DepenseActivity extends AppCompatActivity {

    private ImageView imageViewTricount, imageViewCreditCard, imageViewProfile;
    private TextView textViewTricount, textViewCreditCard, textViewProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_depense);

        imageViewTricount = findViewById(R.id.ImageViewIconTricount);
        imageViewCreditCard = findViewById(R.id.ImageViewIconCreditCard);
        imageViewProfile = findViewById(R.id.ImageViewIconProfile);

        textViewTricount = findViewById(R.id.ImageViewTextTricount);
        textViewCreditCard = findViewById(R.id.ImageViewTextCreditCard);
        textViewProfile = findViewById(R.id.ImageViewTextProfile);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageViewTricount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTricountActivity();
            }
        });

        imageViewCreditCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreditCardActivity();
            }
        });

        imageViewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfileActivity();
            }
        });

        // Gestion des clics sur les textes associés aux icônes
        textViewTricount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTricountActivity();
            }
        });

        textViewCreditCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreditCardActivity();
            }
        });

        textViewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfileActivity();
            }
        });

        Button mesDepensesButton = findViewById(R.id.buttonMesDepenses);
        Button depensesGroupesButton = findViewById(R.id.buttonDepensesGroupes);

        mesDepensesButton.setOnClickListener(v -> {
            Intent intent = new Intent(DepenseActivity.this, MesDepensesActivity.class);
            startActivity(intent);
        });

        depensesGroupesButton.setOnClickListener(v -> {
            Intent intent = new Intent(DepenseActivity.this, DepenseActivity.class);
            startActivity(intent);
        });
    }

    private void openTricountActivity() {
        Intent intent = new Intent(DepenseActivity.this, Tricount.class);
        startActivity(intent);
    }

    private void openCreditCardActivity() {
        Intent intent = new Intent(DepenseActivity.this, CBActivity.class);
        startActivity(intent);
    }

    private void openProfileActivity() {
        Intent intent = new Intent(DepenseActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}