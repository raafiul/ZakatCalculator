package com.rafiul.zakatcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ZakatPoriciti extends AppCompatActivity {

    LinearLayout z1, z2, z3, z4, z5, z6,z7, z8, z9,z10, z11, z12;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zakat_poriciti);
        // ++++++++++++++++++++++++++++++++++
        z1 = findViewById(R.id.zakat1);
        z2 = findViewById(R.id.zakat2);
        z3 = findViewById(R.id.zakat3);
        z4 = findViewById(R.id.zakat4);
        z5 = findViewById(R.id.zakat5);
        z6 = findViewById(R.id.zakat6);
        z7 = findViewById(R.id.zakat7);
        z8 = findViewById(R.id.zakat8);
        z9 = findViewById(R.id.zakat9);
        z10 = findViewById(R.id.zakat10);
        z11 = findViewById(R.id.zakat11);
        z12 = findViewById(R.id.zakat12);





        // +++++++++++++++++++++++++++++


        z1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ZakatPoriciti.this, Z1.class);
                startActivity(i);


            }
        });

        z2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ZakatPoriciti.this, Z2.class);
                startActivity(i);
            }
        });


        z3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ZakatPoriciti.this, Z3.class);
                startActivity(i);

            }
        });

        z4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ZakatPoriciti.this, z4.class);
                startActivity(i);
            }
        });


        z5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ZakatPoriciti.this, Z5.class);
                startActivity(i);
            }
        });



        z6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ZakatPoriciti.this, Z6.class);
                startActivity(i);
            }
        });


        z7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ZakatPoriciti.this, Z7.class);
                startActivity(i);
            }
        });

        z8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ZakatPoriciti.this, Z8.class);
                startActivity(i);
            }
        });



        z9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ZakatPoriciti.this, Z9.class);
                startActivity(i);
            }
        });


        z10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ZakatPoriciti.this, Z10.class);
                startActivity(i);
            }
        });


        z11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ZakatPoriciti.this, Z11.class);
                startActivity(i);
            }
        });


        z12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ZakatPoriciti.this, Z12.class);
                startActivity(i);
            }
        });
    }
}