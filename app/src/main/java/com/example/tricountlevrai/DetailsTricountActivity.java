package com.example.tricountlevrai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsTricountActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView typeTextView;
    private Button editTricountButton;
    private Button addParticipantButton;
    private Button deleteTricountButton;
    private ImageView imageViewTricount, imageViewCreditCard, imageViewProfile;
    private TextView textViewTricount, textViewCreditCard, textViewProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_tricount);

        nameTextView = findViewById(R.id.tricountNameTextView);
        typeTextView = findViewById(R.id.tricountTypeTextView);
        addParticipantButton = findViewById(R.id.addParticipantButton);
        editTricountButton = findViewById(R.id.editTricountButton);
        deleteTricountButton = findViewById(R.id.deleteTricountButton);

        imageViewTricount = findViewById(R.id.ImageViewIconTricount);
        imageViewCreditCard = findViewById(R.id.ImageViewIconCreditCard);
        imageViewProfile = findViewById(R.id.ImageViewIconProfile);

        textViewTricount = findViewById(R.id.ImageViewTextTricount);
        textViewCreditCard = findViewById(R.id.ImageViewTextCreditCard);
        textViewProfile = findViewById(R.id.ImageViewTextProfile);

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
        Intent intent = new Intent(DetailsTricountActivity.this, Tricount.class);
        startActivity(intent);
    }

    private void openCreditCardActivity() {
        Intent intent = new Intent(DetailsTricountActivity.this, CBActivity.class);
        startActivity(intent);
    }

    private void openProfileActivity() {
        Intent intent = new Intent(DetailsTricountActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}