package com.example.farmnavigator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

public class FloorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Reached floor", "Reached f");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_floor);
        ArrayList<String> buildingList = new ArrayList<>();
        buildingList.add("Select Building");
        buildingList.add("J");
        buildingList.add("K");
        buildingList.add("L");
        buildingList.add("N");
        Spinner buildingSpinner = findViewById(R.id.buildingSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, buildingList);
        buildingSpinner.setAdapter(adapter);
        buildingSpinner.setSelection(0);
        buildingSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = buildingList.get(i);
                switch (selectedItem) {
                    case "J":
                        // Switch to the desired activity for "J" (Replace YourJActivity.class with your actual activity class)
                        Intent jIntent = new Intent(FloorActivity.this, JBuilding.class);
                        startActivity(jIntent);
                        break;
                    case "K":
                        // Handle selection for "K"
                        break;
                    case "L":
                        // Handle selection for "L"
                        break;
                    case "N":
                        // Handle selection for "N"
                        break;
                    default:
                        // Handle default case
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ImageView backButton = findViewById(R.id.floor_back_button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FloorActivity.this, StartScreen.class));
            }
        });
    }
}