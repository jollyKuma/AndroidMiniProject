package com.example.miniproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void SuccessRegister(View view){
        Intent intent = new Intent(RegisterActivity.this ,SuccessRegisterActivity.class);
        RegisterActivity.this.startActivity(intent);
    }
}
