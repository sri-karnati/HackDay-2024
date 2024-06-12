package com.example.farmnavigator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class JBuilding extends AppCompatActivity {

    boolean circle1ButtonClicked = false;
    boolean circle2ButtonClicked = false;
    boolean circle3ButtonClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.j_layout);

        TextView circleButton1Text = findViewById(R.id.circle1Text);
        TextView circleButton2Text = findViewById(R.id.circle2Text);
        TextView circleButton3Text = findViewById(R.id.circle3Text);

        circleButton1Text.setAlpha(0f);
        circleButton2Text.setAlpha(0f);
        circleButton3Text.setAlpha(0f);


        Button circle1Button = findViewById(R.id.circleButton1);
        Button circle2Button = findViewById(R.id.circleButton2);
        Button circle3Button = findViewById(R.id.circleButton3);

        circle1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!circle1ButtonClicked) {
                    circleButton1Text.setAlpha(1f);
                    circle1ButtonClicked = true;
                } else {
                    circleButton1Text.setAlpha(0f);
                    circle1ButtonClicked = false;
                }
            }
        });

        circle2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!circle2ButtonClicked) {
                    circleButton2Text.setAlpha(1f);
                    circle2ButtonClicked = true;
                } else {
                    circleButton2Text.setAlpha(0f);
                    circle2ButtonClicked = false;
                }
            }
        });

        circle3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!circle3ButtonClicked) {
                    circleButton3Text.setAlpha(1f);
                    circle3ButtonClicked = true;
                } else {
                    circleButton3Text.setAlpha(0f);
                    circle3ButtonClicked = false;
                }
            }
        });

        circleButton1Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentText = circleButton1Text.getText().toString();
                if (currentText.equals("Available")) {
                    circleButton1Text.setBackgroundColor(Color.parseColor("#808080"));
                    circleButton1Text.setText("Reserved");
                } else {
                    circleButton1Text.setBackgroundColor(Color.parseColor("#006400"));
                    circleButton1Text.setText("Available");
                }
            }
        });

        circleButton2Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentText = circleButton2Text.getText().toString();
                if (currentText.equals("Available")) {
                    circleButton2Text.setBackgroundColor(Color.parseColor("#808080"));
                    circleButton2Text.setText("Reserved");
                } else {
                    circleButton2Text.setBackgroundColor(Color.parseColor("#006400"));
                    circleButton2Text.setText("Available");
                }
            }
        });

        circleButton3Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentText = circleButton3Text.getText().toString();
                if (currentText.equals("Available")) {
                    circleButton3Text.setBackgroundColor(Color.parseColor("#808080"));
                    circleButton3Text.setText("Reserved");
                } else {
                    circleButton3Text.setBackgroundColor(Color.parseColor("#006400"));
                    circleButton3Text.setText("Available");
                }
            }
        });

        ImageView backButtonJ = findViewById(R.id.j_back_button);

        backButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(JBuilding.this, FloorActivity.class));
            }
        });

       Button requestAccessButton = findViewById(R.id.request_access_button);
        requestAccessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(JBuilding.this, FormSubmission.class));
            }
        });

        TextView j1Button = findViewById(R.id.circle1GuideMe);
        TextView j2Button = findViewById(R.id.circle2TextGuideMe);
        TextView j3Button = findViewById(R.id.circle3TextGuideMe);

        j1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JBuilding.this, RoomDirections.class);
                intent.putExtra("Image id", 0);
                startActivity(intent);
            }
        });

        j2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JBuilding.this, RoomDirections.class);
                intent.putExtra("Image id", 1);
                startActivity(intent);
            }
        });

        j3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JBuilding.this, RoomDirections.class);
                intent.putExtra("Image id", 2);
                startActivity(intent);
            }
        });

    }
}