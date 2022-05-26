package com.github.mobileoel;
//https://github.com/AhmedFarazAli

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView TextView = (TextView) findViewById(R.id.textViewlogin);
        Button login=findViewById(R.id.loginbtn);

        TextView.setPaintFlags(TextView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);//// For underline login
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dashboard= new Intent(Login.this,dashboard.class);
                startActivity(dashboard);
            }
        });
    }
}