package com.ziafat_majeed.pizzawissa;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.ziafat_majeed.pizzawissa.databinding.WelcomeActivityBinding;

public class WelcomeActivity extends AppCompatActivity {

    WelcomeActivityBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.welcome_activity);
        binding=WelcomeActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.register.setOnClickListener(v -> {
            startActivity(new Intent(WelcomeActivity.this, SignUp_Screen.class));
            finish();
        });
        binding.login.setOnClickListener(v -> {
            startActivity(new Intent(WelcomeActivity.this, Login_Screen.class));
            finish();
        });

    }
}