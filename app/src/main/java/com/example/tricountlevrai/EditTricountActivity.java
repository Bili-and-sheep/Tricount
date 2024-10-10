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

public class EditTricountActivity extends AppCompatActivity {
    private EditText tricountNameEditText;
    private EditText tricountTypeEditText;
    private Button saveButton;
    private Tricount tricount;
    private ImageView imageViewTricount, imageViewCreditCard, imageViewProfile;
    private TextView textViewTricount, textViewCreditCard, textViewProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tricount);

        tricountNameEditText = findViewById(R.id.tricountName);
        tricountTypeEditText = findViewById(R.id.tricountType);
        saveButton = findViewById(R.id.saveButton);

        imageViewTricount = findViewById(R.id.ImageViewIconTricount);
        imageViewCreditCard = findViewById(R.id.ImageViewIconCreditCard);
        imageViewProfile = findViewById(R.id.ImageViewIconProfile);

        textViewTricount = findViewById(R.id.ImageViewTextTricount);
        textViewCreditCard = findViewById(R.id.ImageViewTextCreditCard);
        textViewProfile = findViewById(R.id.ImageViewTextProfile);

        tricount = (Tricount) getIntent().getSerializableExtra("tricount");

        tricountNameEditText.setText(tricount.getName());
        tricountTypeEditText.setText(tricount.getType());

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tricount.setName(tricountNameEditText.getText().toString());
                tricount.setType(tricountTypeEditText.getText().toString());

                Toast.makeText(EditTricountActivity.this, "Modifications enregistrées", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(EditTricountActivity.this, MainActivity.class);
                startActivity(intent);
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
        Intent intent = new Intent(EditTricountActivity.this, Tricount.class);
        startActivity(intent);
    }

    private void openCreditCardActivity() {
        Intent intent = new Intent(EditTricountActivity.this, CBActivity.class);
        startActivity(intent);
    }

    private void openProfileActivity() {
        Intent intent = new Intent(EditTricountActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}