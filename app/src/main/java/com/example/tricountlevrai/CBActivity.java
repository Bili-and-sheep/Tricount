package com.example.tricountlevrai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CBActivity extends AppCompatActivity {

    private EditText numeroCardEditText, ccvEditText, dateExpiEditText;
    private Button saveButton;
    private ImageView imageViewTricount, imageViewCreditCard, imageViewProfile;
    private TextView textViewTricount, textViewCreditCard, textViewProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbactivity);

        numeroCardEditText = findViewById(R.id.numero_card);
        ccvEditText = findViewById(R.id.ccv);
        dateExpiEditText = findViewById(R.id.date_expi);
        saveButton = findViewById(R.id.saveButton);

        imageViewTricount = findViewById(R.id.ImageViewIconTricount);
        imageViewCreditCard = findViewById(R.id.ImageViewIconCreditCard);
        imageViewProfile = findViewById(R.id.ImageViewIconProfile);

        textViewTricount = findViewById(R.id.ImageViewTextTricount);
        textViewCreditCard = findViewById(R.id.ImageViewTextCreditCard);
        textViewProfile = findViewById(R.id.ImageViewTextProfile);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numeroCard = numeroCardEditText.getText().toString();
                String ccv = ccvEditText.getText().toString();
                String dateExpi = dateExpiEditText.getText().toString();

                if (validateCB(numeroCard, ccv, dateExpi)) {
                    // Sauvegarder les informations de la carte
                    CB cb = new CB(numeroCard, ccv, dateExpi);
                    // Logique de sauvegarde : base de données ou autre stockage
                    Toast.makeText(CBActivity.this, "Carte bancaire sauvegardée avec succès", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CBActivity.this, "Veuillez vérifier les informations saisies", Toast.LENGTH_SHORT).show();
                }
            }
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
    }

    private void openTricountActivity() {
        Intent intent = new Intent(CBActivity.this, Tricount.class);
        startActivity(intent);
    }

    private void openCreditCardActivity() {
        Intent intent = new Intent(CBActivity.this, CBActivity.class);
        startActivity(intent);
    }

    private void openProfileActivity() {
        Intent intent = new Intent(CBActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    private boolean validateCB(String numeroCard, String ccv, String dateExpi) {
        // Validation simple (à étendre selon les besoins)
        return numeroCard.length() == 16 && ccv.length() == 3 && !dateExpi.isEmpty();
    }
}