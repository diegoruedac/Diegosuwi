package com.fabiansuarez.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public Void pantallalog (View vista) {
        Intent MyIntent = new Intent(this, LogInActivity.class);
        startActivity(MyIntent);


        return null;
    }
}