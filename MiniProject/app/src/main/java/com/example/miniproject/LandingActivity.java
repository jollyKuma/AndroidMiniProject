package com.example.miniproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }
    public void Login(View view){
        Intent intent = new Intent(LandingActivity.this ,LoginActivity.class);
        LandingActivity.this.startActivity(intent);
    }
    public  void  Register(View view){
        Intent intent = new Intent(LandingActivity.this, RegisterActivity.class);
        LandingActivity.this.startActivity(intent);
    }
}
