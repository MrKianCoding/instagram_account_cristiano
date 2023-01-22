package com.example.instagram_account_cristiano;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ImageView imageViewProfile;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setItemIconTintList(null);

        imageViewProfile = findViewById(R.id.imageViewProfile);
        Glide.with(this).load(R.drawable.profile_picture).circleCrop().into(imageViewProfile);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));

        List<PhotoModel> photoModelList = new ArrayList<>();

        photoModelList.add(0,new PhotoModel(
                this.getResources().getDrawable(R.drawable.photo_1),"video")
        );

        photoModelList.add(1,new PhotoModel(
                this.getResources().getDrawable(R.drawable.photo_2),"video")
        );

        photoModelList.add(2,new PhotoModel(
                this.getResources().getDrawable(R.drawable.photo_3),"multiple")
        );
        photoModelList.add(3,new PhotoModel(
                this.getResources().getDrawable(R.drawable.photo_4),"multiple")
        );
        photoModelList.add(4,new PhotoModel(
                this.getResources().getDrawable(R.drawable.photo_5),"video")
        );
        photoModelList.add(5,new PhotoModel(
                this.getResources().getDrawable(R.drawable.photo_6),"video")
        );
        photoModelList.add(6,new PhotoModel(
                this.getResources().getDrawable(R.drawable.photo_7),"multiple")
        );
        photoModelList.add(7,new PhotoModel(
                this.getResources().getDrawable(R.drawable.photo_8),"multiple")
        );
        photoModelList.add(8,new PhotoModel(
                this.getResources().getDrawable(R.drawable.photo_9),"multiple")
        );
        photoModelList.add(9,new PhotoModel(
                this.getResources().getDrawable(R.drawable.photo_10),"multiple")
        );

        photoModelList.add(10,new PhotoModel(
                this.getResources().getDrawable(R.drawable.photo_11),"multiple")
        );
        photoModelList.add(11,new PhotoModel(
                this.getResources().getDrawable(R.drawable.photo_12),"image")
        );

        recyclerView.setAdapter(new PhotoAdapter(photoModelList));

    }
}