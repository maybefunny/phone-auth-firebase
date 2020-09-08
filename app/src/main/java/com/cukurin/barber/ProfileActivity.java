package com.cukurin.barber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String idToken = getIntent().getStringExtra("idToken");
        TextView mTV = findViewById(R.id.idToken);

        mTV.setText(idToken);
    }
}
