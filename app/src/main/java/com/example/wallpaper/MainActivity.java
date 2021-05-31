package com.example.wallpaper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private DatabaseReference reference,artref,teddyref,bicycleref,bikesref,bollywoodref,carref,natureref,rainref,godref,wildliferef,flowersref,engineeringref,animationref,robotref,riverref;
    private FirebaseDatabase db;
    private WallpaperAdapter adapter;
    private ArrayList<String> list;
    private String message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = FirebaseDatabase.getInstance();
        recyclerView = findViewById(R.id.recyclerview);
        progressBar = findViewById(R.id.progressbar);
        artref = FirebaseDatabase.getInstance().getReference().child("Wallpaper/Art");
        teddyref = FirebaseDatabase.getInstance().getReference().child("Wallpaper/Teddy");
        bicycleref = FirebaseDatabase.getInstance().getReference().child("Wallpaper/Bicycle");
        bikesref = FirebaseDatabase.getInstance().getReference().child("Wallpaper/Bike");
        bollywoodref = FirebaseDatabase.getInstance().getReference().child("Wallpaper/Bollywood");
        carref = FirebaseDatabase.getInstance().getReference().child("Wallpaper/Car");
        natureref = FirebaseDatabase.getInstance().getReference().child("Wallpaper/Nature");
        rainref = FirebaseDatabase.getInstance().getReference().child("Wallpaper/Rain");
        godref = FirebaseDatabase.getInstance().getReference().child("Wallpaper/God");
        wildliferef = FirebaseDatabase.getInstance().getReference().child("Wallpaper/Wildlife");
        flowersref = FirebaseDatabase.getInstance().getReference().child("Wallpaper/Flower");
        engineeringref = FirebaseDatabase.getInstance().getReference().child("Wallpaper/Engineering");
        animationref = FirebaseDatabase.getInstance().getReference().child("Wallpaper/Animation");
        robotref = FirebaseDatabase.getInstance().getReference().child("Wallpaper/Robot");
        riverref = FirebaseDatabase.getInstance().getReference().child("Wallpaper/River");


        Intent intent = getIntent();
        message = intent.getStringExtra("message");

        getdata(message);

    }

    private void getdata(String message) {

        //when art clicked
        if(message.equals("art")){

            artref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    progressBar.setVisibility(View.GONE);
                    list = new ArrayList<>();

                    for(DataSnapshot shot : snapshot.getChildren()){
                        String data = shot.getValue().toString();
                        list.add(data);
                    }
                    recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
                    adapter = new WallpaperAdapter(list,MainActivity.this);
                    recyclerView.setAdapter(adapter);
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Error:", Toast.LENGTH_SHORT).show();
                }
            });
        }
        //when teddy clicked
        if(message.equals("teddy")){

            teddyref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    progressBar.setVisibility(View.GONE);
                    list = new ArrayList<>();

                    for(DataSnapshot shot : snapshot.getChildren()){
                        String data = shot.getValue().toString();
                        list.add(data);
                    }
                    recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
                    adapter = new WallpaperAdapter(list,MainActivity.this);
                    recyclerView.setAdapter(adapter);
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Error:", Toast.LENGTH_SHORT).show();
                }
            });
        }
        //when bicycle cliked
        if(message.equals("bicycle")){

            bicycleref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    progressBar.setVisibility(View.GONE);
                    list = new ArrayList<>();

                    for(DataSnapshot shot : snapshot.getChildren()){
                        String data = shot.getValue().toString();
                        list.add(data);
                    }
                    recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
                    adapter = new WallpaperAdapter(list,MainActivity.this);
                    recyclerView.setAdapter(adapter);
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Error:", Toast.LENGTH_SHORT).show();
                }
            });
        }
        //when bike clicked
        if(message.equals("bike")){

            bikesref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    progressBar.setVisibility(View.GONE);
                    list = new ArrayList<>();

                    for(DataSnapshot shot : snapshot.getChildren()){
                        String data = shot.getValue().toString();
                        list.add(data);
                    }
                    recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
                    adapter = new WallpaperAdapter(list,MainActivity.this);
                    recyclerView.setAdapter(adapter);
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Error:", Toast.LENGTH_SHORT).show();
                }
            });
        }
        //when bollywood clicked
        if(message.equals("bollywood")){

            bollywoodref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    progressBar.setVisibility(View.GONE);
                    list = new ArrayList<>();

                    for(DataSnapshot shot : snapshot.getChildren()){
                        String data = shot.getValue().toString();
                        list.add(data);
                    }
                    recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
                    adapter = new WallpaperAdapter(list,MainActivity.this);
                    recyclerView.setAdapter(adapter);
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Error:", Toast.LENGTH_SHORT).show();
                }
            });
        }
        //when cars clicked
        if(message.equals("car")){

            carref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    progressBar.setVisibility(View.GONE);
                    list = new ArrayList<>();

                    for(DataSnapshot shot : snapshot.getChildren()){
                        String data = shot.getValue().toString();
                        list.add(data);
                    }
                    recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
                    adapter = new WallpaperAdapter(list,MainActivity.this);
                    recyclerView.setAdapter(adapter);
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Error:", Toast.LENGTH_SHORT).show();
                }
            });
        }
        //when nature clicked
        if(message.equals("nature")){

            natureref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    progressBar.setVisibility(View.GONE);
                    list = new ArrayList<>();

                    for(DataSnapshot shot : snapshot.getChildren()){
                        String data = shot.getValue().toString();
                        list.add(data);
                    }
                    recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
                    adapter = new WallpaperAdapter(list,MainActivity.this);
                    recyclerView.setAdapter(adapter);
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Error:", Toast.LENGTH_SHORT).show();
                }
            });
        }
        //when rain clicked
        if(message.equals("rain")){

            rainref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    progressBar.setVisibility(View.GONE);
                    list = new ArrayList<>();

                    for(DataSnapshot shot : snapshot.getChildren()){
                        String data = shot.getValue().toString();
                        list.add(data);
                    }
                    recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
                    adapter = new WallpaperAdapter(list,MainActivity.this);
                    recyclerView.setAdapter(adapter);
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Error:", Toast.LENGTH_SHORT).show();
                }
            });
        }
        //when gods clicked
        if(message.equals("god")){

            godref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    progressBar.setVisibility(View.GONE);
                    list = new ArrayList<>();

                    for(DataSnapshot shot : snapshot.getChildren()){
                        String data = shot.getValue().toString();
                        list.add(data);
                    }
                    recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
                    adapter = new WallpaperAdapter(list,MainActivity.this);
                    recyclerView.setAdapter(adapter);
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Error:", Toast.LENGTH_SHORT).show();
                }
            });
        }
        //when wildlife clicked
        if(message.equals("wildlife")){

            wildliferef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    progressBar.setVisibility(View.GONE);
                    list = new ArrayList<>();

                    for(DataSnapshot shot : snapshot.getChildren()){
                        String data = shot.getValue().toString();
                        list.add(data);
                    }
                    recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
                    adapter = new WallpaperAdapter(list,MainActivity.this);
                    recyclerView.setAdapter(adapter);
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Error:", Toast.LENGTH_SHORT).show();
                }
            });
        }
        //when flowers clicked
        if(message.equals("flowers")){

            flowersref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    progressBar.setVisibility(View.GONE);
                    list = new ArrayList<>();

                    for(DataSnapshot shot : snapshot.getChildren()){
                        String data = shot.getValue().toString();
                        list.add(data);
                    }
                    recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
                    adapter = new WallpaperAdapter(list,MainActivity.this);
                    recyclerView.setAdapter(adapter);
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Error:", Toast.LENGTH_SHORT).show();
                }
            });
        }
        //when engineering clicked
        if(message.equals("engineering")){

            engineeringref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    progressBar.setVisibility(View.GONE);
                    list = new ArrayList<>();

                    for(DataSnapshot shot : snapshot.getChildren()){
                        String data = shot.getValue().toString();
                        list.add(data);
                    }
                    recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
                    adapter = new WallpaperAdapter(list,MainActivity.this);
                    recyclerView.setAdapter(adapter);
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Error:", Toast.LENGTH_SHORT).show();
                }
            });
        }
        //when animation clicked
        if(message.equals("animation")){

            animationref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    progressBar.setVisibility(View.GONE);
                    list = new ArrayList<>();

                    for(DataSnapshot shot : snapshot.getChildren()){
                        String data = shot.getValue().toString();
                        list.add(data);
                    }
                    recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
                    adapter = new WallpaperAdapter(list,MainActivity.this);
                    recyclerView.setAdapter(adapter);
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Error:", Toast.LENGTH_SHORT).show();
                }
            });
        }
        //when robots clicked
        if(message.equals("robots")){

            robotref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    progressBar.setVisibility(View.GONE);
                    list = new ArrayList<>();

                    for(DataSnapshot shot : snapshot.getChildren()){
                        String data = shot.getValue().toString();
                        list.add(data);
                    }
                    recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
                    adapter = new WallpaperAdapter(list,MainActivity.this);
                    recyclerView.setAdapter(adapter);
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Error:", Toast.LENGTH_SHORT).show();
                }
            });
        }
        //when rivers clicked
        if(message.equals("rivers")){

            riverref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    progressBar.setVisibility(View.GONE);
                    list = new ArrayList<>();

                    for(DataSnapshot shot : snapshot.getChildren()){
                        String data = shot.getValue().toString();
                        list.add(data);
                    }
                    recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,3));
                    adapter = new WallpaperAdapter(list,MainActivity.this);
                    recyclerView.setAdapter(adapter);
                    progressBar.setVisibility(View.GONE);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Error:", Toast.LENGTH_SHORT).show();
                }
            });
        }


    }
}