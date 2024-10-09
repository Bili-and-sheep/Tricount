package com.example.tricountlevrai;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CBActivity extends AppCompatActivity {

    private EditText numeroCardEditText, ccvEditText, dateExpiEditText;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbactivity);

        numeroCardEditText = findViewById(R.id.numero_card);
        ccvEditText = findViewById(R.id.ccv);
        dateExpiEditText = findViewById(R.id.date_expi);
        saveButton = findViewById(R.id.saveButton);

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
    }

    private boolean validateCB(String numeroCard, String ccv, String dateExpi) {
        // Validation simple (à étendre selon les besoins)
        return numeroCard.length() == 16 && ccv.length() == 3 && !dateExpi.isEmpty();
    }
}