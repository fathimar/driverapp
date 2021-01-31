package com.example.driverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myclickevent(View view) {

        Intent i=new Intent(this,DriverActivity.class);
        startActivity(i);

    }

    public void userclickevent(View view) {
        Intent i=new Intent(this,UserActivity.class);
        startActivity(i);
    }
}