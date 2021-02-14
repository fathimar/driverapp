package com.example.driverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class UserActivity extends AppCompatActivity {
EditText username,password;
    String apiurl="http://192.168.1.20/project/bustracking/api/userlogin_api.php";

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
       // Toast.makeText(this,getpass+getuser,Toast.LENGTH_LONG).show();
        sendtoServer();
        Intent i=new Intent(this,ViewtrackActivity.class);
        startActivity(i);
    }

    private void sendtoServer() {


        StringRequest stringRequest=new StringRequest(Request.Method.POST, apiurl,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {

                        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {

                        Log.d("error=> ",volleyError.toString());

                        Toast.makeText(getApplicationContext(),volleyError.toString(),Toast.LENGTH_LONG).show();


                    }
                })
        {

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String,String> params=new HashMap<>();

                params.put("username",username.getText().toString());
                params.put("password",password.getText().toString());


                return params;
            }


        };

        RequestQueue requestQueue= Volley.newRequestQueue(getApplicationContext());
        requestQueue.add(stringRequest);

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
