package com.example.k;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;



import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private Button login,signup,customer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);
        signup = findViewById(R.id.signup);
        customer = findViewById(R.id.customer);


        login.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, login_activity.class)));
        signup.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, sign_up_activity.class)));
        customer.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, customerActivity.class)));


    }

    }
