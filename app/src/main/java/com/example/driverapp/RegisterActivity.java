package com.example.driverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText uname,phoneno,uemail,username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        uname=(EditText)findViewById(R.id.name);
        phoneno=(EditText)findViewById(R.id.phn);
        uemail=(EditText)findViewById(R.id.email);
        username=(EditText)findViewById(R.id.user);
        password=(EditText)findViewById(R.id.pass);

    }

    public void regclickevent(View view) {
        String getname=uname.getText().toString();
        String getphoneno=phoneno.getText().toString();
        String getemail=uemail.getText().toString();
        String getuser=username.getText().toString();
        String getpass=password.getText().toString();
        Toast.makeText(this,getname+getphoneno+getemail+getpass+getuser,Toast.LENGTH_LONG).show();

    }

    public void registerclickevent(View view) {

    }

    public void registerevent(View view) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}