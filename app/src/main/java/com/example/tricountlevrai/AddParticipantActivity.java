package com.example.tricountlevrai;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddParticipantActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextEmail;
    private EditText editTextAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_participant);

        editTextName = findViewById(R.id.participantName);
        Button buttonAddParticipant = findViewById(R.id.addParticipantButton);

        buttonAddParticipant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String participantName = editTextName.getText().toString();


                if (TextUtils.isEmpty(participantName)) {
                    Toast.makeText(AddParticipantActivity.this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(AddParticipantActivity.this, "Participant ajouté", Toast.LENGTH_SHORT).show();
                    finish();
                    Intent mainIntent = new Intent(AddParticipantActivity.this, MainActivity.class);
                    startActivity(mainIntent);

                }
            }
        });
    }
}