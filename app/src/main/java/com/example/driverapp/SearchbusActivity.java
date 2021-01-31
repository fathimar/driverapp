package com.example.driverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SearchbusActivity extends AppCompatActivity {
    EditText bname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchbus);
        bname=(EditText)findViewById(R.id.busname);

    }

    public void searchbusclickevent(View view) {

        String getbus=bname.getText().toString();
Toast.makeText(this,getbus,Toast.LENGTH_LONG).show();


    }
}