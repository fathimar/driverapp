package com.example.driverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UserActivity extends AppCompatActivity {
EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        username=(EditText)findViewById(R.id.user);
        password=(EditText)findViewById(R.id.pass);

    }

    public void usersclickevent(View view) {
        String getuser=username.getText().toString();
        String getpass=password.getText().toString();
        Toast.makeText(this,getpass+getuser,Toast.LENGTH_LONG).show();

        Intent i=new Intent(this,ViewtrackActivity.class);
        startActivity(i);
    }

    public void mainuser(View view) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);

        }

    public void regclickevent(View view) {
        Intent i=new Intent(this,RegisterActivity.class);
        startActivity(i);
    }



}
