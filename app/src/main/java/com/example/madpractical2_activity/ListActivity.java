package com.example.madpractical2_activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView centreImg = findViewById(R.id.imageView2);

        AlertDialog.Builder clickImg = new AlertDialog.Builder(ListActivity.this);
        clickImg.setTitle("Profile");
        clickImg.setMessage("MADness");
        clickImg.setPositiveButton("View", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent openMain = new Intent(ListActivity.this, MainActivity.class);
                openMain.putExtra("id", new Random().nextInt());
                startActivity(openMain);
            }
        });
        clickImg.setNegativeButton("Close", null);

        centreImg.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                AlertDialog alert = clickImg.create();
                alert.show();
            }
        });
    }
}