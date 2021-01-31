package com.example.driverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ViewtrackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewtrack);
    }

    public void viewbusclickevent(View view) {

    }

    public void trackbusclickevent(View view) {
        Intent i=new Intent(this,SearchbusActivity.class);
        startActivity(i);
    }
}