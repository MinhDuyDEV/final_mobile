package com.example.finalmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText editEmailLogin, editPasswordLogin;
    TextView btnForgetPass, btnLoginToRegister;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editEmailLogin = findViewById(R.id.editEmailLogin);
        editPasswordLogin = findViewById(R.id.editPasswordLogin);
        btnForgetPass = findViewById(R.id.btnForgetPass);
        btnLoginToRegister = findViewById(R.id.btnLoginToRegister);
        btnLogin = findViewById(R.id.btnLogin);

        //Click register to direct to Register Activity
        Intent intentRegister = new Intent(this, RegisterActivity.class);
        btnLoginToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentRegister);
            }
        });
    }


}