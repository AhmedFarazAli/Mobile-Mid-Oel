package com.github.mobileoel;
//https://github.com/AhmedFarazAli

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        TextView TextView = findViewById(R.id.dashboardtextview);
        TextView.setPaintFlags(TextView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);//// For underline dashboard
        Button buttonCamera = findViewById(R.id.button3);
        Button buttonRoom = findViewById(R.id.button5);
        Button buttonGarage= findViewById(R.id.button6);
        Button buttonCarpark= findViewById(R.id.button7);
        buttonCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Camera= new Intent(dashboard.this,Camera.class);
                startActivity(Camera);
            }
        });// for camera
        buttonRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Camera= new Intent(dashboard.this,Room.class);
                startActivity(Camera);
            }
        });// for rooms
        buttonGarage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Camera= new Intent(dashboard.this,Garage.class);
                startActivity(Camera);
            }
        });// for garage
        buttonCarpark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Camera= new Intent(dashboard.this,Carpark.class);
                startActivity(Camera);
            }
        });// for car park
    }
}