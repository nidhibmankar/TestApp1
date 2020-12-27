package com.example.testapp.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.testapp.HomeActivity;
import com.example.testapp.R;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    TextInputEditText etName,etBussinessnamee,etMail,etMobile,etPass;
    Button login,forgetbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etName = (TextInputEditText)findViewById(R.id.username);
        etBussinessnamee = (TextInputEditText)findViewById(R.id.businessname);
        etMail = (TextInputEditText)findViewById(R.id.email);
        etMobile = (TextInputEditText)findViewById(R.id.mobile);
        etPass = (TextInputEditText)findViewById(R.id.password);

        login = (Button)findViewById(R.id.btnLogin);
        forgetbtn = (Button)findViewById(R.id.forgetpass);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name,Bussinessname,Mob,email,pass;

                name = etName.getText().toString();
                Bussinessname = etBussinessnamee.getText().toString();
                Mob = etMobile.getText().toString();
                email = etMail.getText().toString();
                pass = etPass.getText().toString();


                if (name.equals("")){
                    Toast.makeText(MainActivity.this,"Username is required",Toast.LENGTH_SHORT).show();
                }
                if (Bussinessname.equals("")){
                    Toast.makeText(MainActivity.this,"Businessname is required",Toast.LENGTH_SHORT).show();
                }
                if (Mob.equals("")){
                    Toast.makeText(MainActivity.this,"Mobile no. is required",Toast.LENGTH_SHORT).show();
                }
                if (email.equals("")){
                    Toast.makeText(MainActivity.this,"Email is required",Toast.LENGTH_SHORT).show();
                }
                if (pass.equals("")){
                    Toast.makeText(MainActivity.this,"Password is required",Toast.LENGTH_SHORT).show();
                }
                else{
                    //Auth
                }
            }
        });

        forgetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(MainActivity.this, GoogleMapScreen.class);
              startActivity(s);
                finish();
            }
        });
    }
}