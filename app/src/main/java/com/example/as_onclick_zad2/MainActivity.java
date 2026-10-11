package com.example.as_onclick_zad2;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvCounter;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCounter = findViewById(R.id.tvCounter);

        // Pierwszy sposób: lambda bezpośrednio przy przycisku.
        findViewById(R.id.btnPlus).setOnClickListener(v -> {
            counter++;
            updateCounter();
        });
    }

    private void updateCounter() {
        tvCounter.setText(String.valueOf(counter));
    }
}
