package com.example.wallpaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.helper.widget.Flow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class HomePage extends AppCompatActivity {

    private CardView Art,Teddy,Bicycle,Bikes,Bollywood,Cars,Nature,Rain,God,Wildlife,Flowers,Engineering,Animation,Robots,Rivers;
    private FirebaseDatabase db;
    DatabaseReference dbref;
    private String message;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Art = findViewById(R.id.art);
        Teddy = findViewById(R.id.teddy);
        Bicycle = findViewById(R.id.bicycle);
        Bikes = findViewById(R.id.bikes);
        Bollywood = findViewById(R.id.bollywood);
        Cars = findViewById(R.id.cars);
        Nature = findViewById(R.id.nature);
        Rain = findViewById(R.id.rain);
        God = findViewById(R.id.god);
        Wildlife = findViewById(R.id.wildlife);
        Flowers = findViewById(R.id.flowers);
        Engineering = findViewById(R.id.engineering);
        Animation = findViewById(R.id.animation);
        Robots = findViewById(R.id.robot);
        Rivers = findViewById(R.id.rivers);

        db = FirebaseDatabase.getInstance();
        dbref = FirebaseDatabase.getInstance().getReference().child("Wallpaper");


        Art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = "art";
                Intent intent = new Intent(HomePage.this,MainActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);

            }
        });

        Teddy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = "teddy";
                Intent intent = new Intent(HomePage.this,MainActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);

            }
        });

        Bicycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = "bicycle";
                Intent intent = new Intent(HomePage.this,MainActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);

            }
        });

        Bikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = "bike";
                Intent intent = new Intent(HomePage.this,MainActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);

            }
        });

        Bollywood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = "bollywood";
                Intent intent = new Intent(HomePage.this,MainActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);

            }
        });

        Cars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = "car";
                Intent intent = new Intent(HomePage.this,MainActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);

            }
        });

        Nature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = "nature";
                Intent intent = new Intent(HomePage.this,MainActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);

            }
        });

        Rain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = "rain";
                Intent intent = new Intent(HomePage.this,MainActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);

            }
        });

        God.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = "god";
                Intent intent = new Intent(HomePage.this,MainActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);

            }
        });

        Wildlife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = "wildlife";
                Intent intent = new Intent(HomePage.this,MainActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);

            }
        });

        Flowers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = "flowers";
                Intent intent = new Intent(HomePage.this,MainActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);

            }
        });

        Engineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = "engineering";
                Intent intent = new Intent(HomePage.this,MainActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);

            }
        });

        Animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = "animation";
                Intent intent = new Intent(HomePage.this,MainActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);

            }
        });

        Robots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = "robots";
                Intent intent = new Intent(HomePage.this,MainActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);

            }
        });

        Rivers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = "rivers";
                Intent intent = new Intent(HomePage.this,MainActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);

            }
        });






    }
}