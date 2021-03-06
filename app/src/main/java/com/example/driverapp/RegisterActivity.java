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

public class RegisterActivity extends AppCompatActivity {
    EditText uname,phoneno,uemail,username,password;

    String apiurl="http://192.168.1.20/project/bustracking/api/userreg_api.php";
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
                params.put("name",uname.getText().toString());
                params.put("phno",phoneno.getText().toString());
                params.put("email",uemail.getText().toString());
                params.put("username",username.getText().toString());
                params.put("pwd",password.getText().toString());


                return params;
            }


        };

        RequestQueue requestQueue= Volley.newRequestQueue(getApplicationContext());
        requestQueue.add(stringRequest);

    }

    public void regclickevent(View view) {

       // Toast.makeText(this,getname+getphoneno+getemail+getpass+getuser,Toast.LENGTH_LONG).show();
        sendtoServer();

    }

    public void registerclickevent(View view) {

    }

    public void registerevent(View view) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}