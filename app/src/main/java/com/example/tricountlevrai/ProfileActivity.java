package com.example.tricountlevrai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private EditText usernameEditText, emailEditText, phoneEditText;
    private Button saveProfileButton, logoutButton;
    private ImageView profileImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        usernameEditText = findViewById(R.id.username);
        emailEditText = findViewById(R.id.email);
        phoneEditText = findViewById(R.id.phone);
        saveProfileButton = findViewById(R.id.saveProfileButton);
        logoutButton = findViewById(R.id.logoutButton);

        // Simuler la récupération des données de l'utilisateur à partir de la base de données ou des préférences partagées
        loadUserProfile();

        // Bouton de sauvegarde des informations de profil
        saveProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveUserProfile();
            }
        });

        // Bouton de déconnexion
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Simuler la déconnexion
                logoutUser();
            }
        });
    }

    private void loadUserProfile() {
        // Exemple fictif de chargement de données utilisateur
        usernameEditText.setText("Jean Dupont");
        emailEditText.setText("jean.dupont@example.com");
        phoneEditText.setText("0123456789");
    }

    private void saveUserProfile() {
        String username = usernameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String phone = phoneEditText.getText().toString();

        // Logique de sauvegarde des informations de l'utilisateur
        // Par exemple : envoyer les informations à un serveur ou les stocker localement

        Toast.makeText(this, "Profil sauvegardé avec succès !", Toast.LENGTH_SHORT).show();
    }

    private void logoutUser() {
        // Simuler une déconnexion (rediriger vers la page de connexion)
        Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
        startActivity(intent);
        finish(); // Terminer l'activité actuelle
    }
}