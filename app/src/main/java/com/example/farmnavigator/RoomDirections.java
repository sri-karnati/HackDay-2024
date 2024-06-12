package com.example.farmnavigator;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class RoomDirections extends AppCompatActivity {
    int [] roomImgArray = {R.drawable.j1_directions, R.drawable.j2_directions,
            R.drawable.j3_directions};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_directions);

        ImageView imageView = findViewById(R.id.roomDirectionsImage);

        int myNumber = getIntent().getIntExtra("Image id", 0);

        imageView.setImageResource(roomImgArray[myNumber]);
    }
}