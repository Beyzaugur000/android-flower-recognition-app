package com.example.bitirme2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Category2 extends AppCompatActivity {
    Button btnaciklama1 ,btnaciklama2, btndetection1,btndetection2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category2);

        btnaciklama1=findViewById(R.id.btnaciklama1);
        btnaciklama2=findViewById(R.id.btnaciklama2);
        btndetection1=findViewById(R.id.btndetection1);
        btndetection2=findViewById(R.id.btndetection2);

        btndetection1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  =new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
            }
        });

        btndetection2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  =new Intent(getApplicationContext(),MainActivity.class);

                startActivity(intent);
            }
        });
        btnaciklama1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  =new Intent(getApplicationContext(),MainActivity.class);

                startActivity(intent);
            }
        });
        btnaciklama2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  =new Intent(getApplicationContext(),MainActivity.class);

                startActivity(intent);
            }
        });
    }

}
