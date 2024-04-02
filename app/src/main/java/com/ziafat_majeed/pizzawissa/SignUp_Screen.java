package com.ziafat_majeed.pizzawissa;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.ziafat_majeed.pizzawissa.databinding.ActivityLoginScreenBinding;
import com.ziafat_majeed.pizzawissa.databinding.ActivitySignupScreenBinding;


public class SignUp_Screen extends AppCompatActivity {

    ActivitySignupScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_screen);

        binding= ActivitySignupScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.Signupbtn.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
        });
        binding.loginText.setOnClickListener(v -> {
            startActivity(new Intent(this, Login_Screen.class));
        });


    }
}