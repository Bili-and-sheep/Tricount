package com.example.tricount;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tricount.Tricount;

public class DeleteTricountActivity extends AppCompatActivity {
    private Button deleteButton;
    private Tricount tricount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_tricount);

        deleteButton = findViewById(R.id.deleteButton);

        // Récupérer l'objet Tricount à partir de l'Intent
        tricount = (Tricount) getIntent().getSerializableExtra("tricount");

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Suppression du tricount
                // ...

                finish();
            }
        });
    }
}