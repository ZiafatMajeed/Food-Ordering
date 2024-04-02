package com.ziafat_majeed.pizzawissa;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.ziafat_majeed.pizzawissa.databinding.ActivityLoginScreenBinding;

import kotlinx.coroutines.MainCoroutineDispatcher;

public class Login_Screen extends AppCompatActivity {

    ActivityLoginScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding= ActivityLoginScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.loginBtn.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
        });

        binding.registertext.setOnClickListener(v -> {
            startActivity(new Intent(this, SignUp_Screen.class));
        });

    }
}