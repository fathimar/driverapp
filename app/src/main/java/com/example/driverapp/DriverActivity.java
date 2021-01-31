package com.example.driverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DriverActivity extends AppCompatActivity {
EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);
        username=(EditText)findViewById(R.id.user);
        password=(EditText)findViewById(R.id.pass);

    }

    public void driverclickevent(View view) {
        String getuser=username.getText().toString();
        String getpass=password.getText().toString();
        Toast.makeText(this,getpass+getuser,Toast.LENGTH_LONG).show();
    }

    public void driverevent(View view) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}