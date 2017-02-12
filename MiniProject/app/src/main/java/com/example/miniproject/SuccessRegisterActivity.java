package com.example.miniproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SuccessRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_register);
    }

    public void Login(View view){
        Intent intent = new Intent(SuccessRegisterActivity.this ,LoginActivity.class);
        SuccessRegisterActivity.this.startActivity(intent);
    }
}
