package com.example.tricountlevrai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CreateTricountActivity extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextType;
    private EditText editTextParticipants;
    private ImageView imageViewTricount, imageViewCreditCard, imageViewProfile;
    private TextView textViewTricount, textViewCreditCard, textViewProfile;

    // List to hold Tricount objects
    public static ArrayList<Tricount> tricountList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_tricount);

        editTextName = findViewById(R.id.tricountName);
        editTextType = findViewById(R.id.tricountType);
        editTextParticipants = findViewById(R.id.tricountParticipants);
        Button buttonCreate = findViewById(R.id.createButton);

        imageViewTricount = findViewById(R.id.ImageViewIconTricount);
        imageViewCreditCard = findViewById(R.id.ImageViewIconCreditCard);
        imageViewProfile = findViewById(R.id.ImageViewIconProfile);

        textViewTricount = findViewById(R.id.ImageViewTextTricount);
        textViewCreditCard = findViewById(R.id.ImageViewTextCreditCard);
        textViewProfile = findViewById(R.id.ImageViewTextProfile);

        buttonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tricountName = editTextName.getText().toString().trim();
                String tricountType = editTextType.getText().toString().trim();
                String tricountParticipants = editTextParticipants.getText().toString().trim();

                // Validate inputs
                if (tricountName.isEmpty() || tricountType.isEmpty() || tricountParticipants.isEmpty()) {
                    Toast.makeText(CreateTricountActivity.this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Create a new Tricount object
                Tricount newTricount = new Tricount(0, tricountName, "date_now", tricountType);
                // Add the new Tricount to the list
                tricountList.add(newTricount);

                // Show success message
                Toast.makeText(CreateTricountActivity.this, "Tricount créé avec succès", Toast.LENGTH_SHORT).show();

                // Redirect to Tricounts list activity
                Intent intent = new Intent(CreateTricountActivity.this, TricountAdapter.class); // Ensure this class exists
                startActivity(intent);
                finish(); // Finish the current activity
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

        ImageButton imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void openTricountActivity() {
        Intent intent = new Intent(CreateTricountActivity.this, Tricount.class);
        startActivity(intent);
    }

    private void openCreditCardActivity() {
        Intent intent = new Intent(CreateTricountActivity.this, CBActivity.class);
        startActivity(intent);
    }

    private void openProfileActivity() {
        Intent intent = new Intent(CreateTricountActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}