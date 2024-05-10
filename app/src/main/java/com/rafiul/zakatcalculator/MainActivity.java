package com.rafiul.zakatcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout zakatPorichiti, zakatCalculator, zakatQA, zakatFoundation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // +++++++++++++++++++++++++++++++++++++
        zakatPorichiti = findViewById(R.id.llzintorducing);
        zakatCalculator = findViewById(R.id.llzcal);
        zakatQA = findViewById(R.id.llZqanda);
        zakatFoundation = findViewById(R.id.llzfoundation);



        /// ====================================
        zakatPorichiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, ZakatPoriciti.class);
                startActivity(i);

            }
        });



        zakatCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, ZakatCalculator.class);
                startActivity(i);

            }
        });


        zakatQA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AboutUs.class);
                startActivity(i);
            }
        });



        zakatFoundation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ZakatFoundation.class);
                startActivity(i);
            }
        });
    }
}