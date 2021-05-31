package com.example.wallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.io.IOException;

public class FullImageActivity extends AppCompatActivity {
    private ImageView fullimage;
    private Button applybtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        fullimage = findViewById(R.id.fullimage);
        applybtn = findViewById(R.id.applybtn);

        Glide.with(this).load(getIntent().getStringExtra("Image")).into(fullimage);
        
        applybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBackground();
            }
        });
    }

    private void setBackground() {
        Bitmap bitmap = ((BitmapDrawable)fullimage.getDrawable()).getBitmap();
        WallpaperManager manager = WallpaperManager.getInstance(getApplicationContext());
        try {
            manager.setBitmap(bitmap);
            Toast.makeText(this, "Wallpaper Updated", Toast.LENGTH_SHORT).show();
            Intent wallpaperupdated = new Intent(FullImageActivity.this,MainActivity.class);
            startActivity(wallpaperupdated);
        } catch (IOException e) {
            Toast.makeText(this, "Error : "+e.getMessage(), Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }

    }
}