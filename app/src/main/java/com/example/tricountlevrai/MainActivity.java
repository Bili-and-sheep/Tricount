package com.example.tricountlevrai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TRICOUNT_KEY = "tricount";
    private ArrayList<Tricount> tricountList;
    private ImageView imageViewTricount, imageViewCreditCard, imageViewProfile;
    private TextView textViewTricount, textViewCreditCard, textViewProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView tricountRecyclerView = findViewById(R.id.tricountRecyclerView);
        tricountRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        tricountList = new ArrayList<>();
        loadTricounts(); // Load Tricounts

        TricountAdapter tricountAdapter = new TricountAdapter(tricountList, new TricountAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Tricount tricount) {
                Intent intent = new Intent(MainActivity.this, DetailsTricountActivity.class);
                intent.putExtra(TRICOUNT_KEY, tricount); // Pass the Tricount object to details activity
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

        // Link ImageView and TextView to their respective IDs
        imageViewTricount = findViewById(R.id.ImageViewIconTricount);
        imageViewCreditCard = findViewById(R.id.ImageViewIconCreditCard);
        imageViewProfile = findViewById(R.id.ImageViewIconProfile);

        textViewTricount = findViewById(R.id.ImageViewTextTricount);
        textViewCreditCard = findViewById(R.id.ImageViewTextCreditCard);
        textViewProfile = findViewById(R.id.ImageViewTextProfile);

        // Assign click listeners for icons
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

        // Assign click listeners for text views
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

    // Methods to open different activities
    private void openTricountActivity() {
        Intent intent = new Intent(this, Tricount.class);
        startActivity(intent);
    }

    private void openCreditCardActivity() {
        Intent intent = new Intent(this, CBActivity.class);
        startActivity(intent);
    }

    private void openProfileActivity() {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    // Load Tricounts (example static data)
    private void loadTricounts() {
        tricountList.add(new Tricount("Tricount Mariage", "Fête"));
        tricountList.add(new Tricount("Tricount 2", "Type B"));
    }
}