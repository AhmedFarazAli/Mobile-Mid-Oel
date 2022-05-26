package com.github.mobileoel;
//https://github.com/AhmedFarazAli

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class Garage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);
        TextView TextView = findViewById(R.id.textView9);
        TextView.setPaintFlags(TextView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);//// For underline Garage
    }
}