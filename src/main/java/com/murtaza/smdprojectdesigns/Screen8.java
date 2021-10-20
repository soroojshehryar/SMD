package com.murtaza.smdprojectdesigns;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Screen8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_screen8);

        Spinner dropdown = findViewById(R.id.language);
        String[] items = new String[] {"English", "Urdu", "French", "Spanish", "German"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(Screen8.this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }
}