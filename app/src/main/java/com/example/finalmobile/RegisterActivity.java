package com.example.finalmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    EditText editFullnameRegister, editEmailRegister, editPasswordRegister;
    CheckBox checkBoxAgree;
    TextView btnRegisterToLogin;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editFullnameRegister = findViewById(R.id.editFullnameRegister);
        editEmailRegister = findViewById(R.id.editEmailRegister);
        editPasswordRegister = findViewById(R.id.editPasswordRegister);
        checkBoxAgree = findViewById(R.id.checkBoxAgree);
        btnRegisterToLogin = findViewById(R.id.btnRegisterToLogin);
        btnRegister = findViewById(R.id.btnRegister);

        //Click Login to direct to Login Activity
        Intent intentLogin = new Intent(this, LoginActivity.class);
        btnRegisterToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentLogin);
            }
        });
    }
}