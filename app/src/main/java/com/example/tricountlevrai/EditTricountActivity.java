package com.example.tricountlevrai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EditTricountActivity extends AppCompatActivity {
    private EditText tricountNameEditText;
    private EditText tricountTypeEditText;
    private Button saveButton;
    private Tricount tricount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tricount);

        tricountNameEditText = findViewById(R.id.tricountName);
        tricountTypeEditText = findViewById(R.id.tricountType);
        saveButton = findViewById(R.id.saveButton);

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
    }
}