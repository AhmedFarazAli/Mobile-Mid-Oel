package com.github.mobileoel;
//https://github.com/AhmedFarazAli

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class Carpark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpark);
        TextView TextView = findViewById(R.id.textView10);
        TextView.setPaintFlags(TextView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);//// For underline carpark
    }
}