package com.example.mahmoudapp;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;





    public class SignupActivity  {
        private EditText editTextUsername, editTextPassword;
        private Button btnLogin;
        private TextView txtSignupLink;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.clone(savedInstanceState);
            setContentView(R.layout.activity_login);

            editTextUsername = findViewById(R.id.editTextUsername);
            editTextPassword = findViewById(R.id.editTextPassword);
            btnLogin = findViewById(R.id.btnLogin);
            txtSignupLink = findViewById(R.id.txtSignupLink);

            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle login button click
                    // Implement authentication logic here
                }
            });

            txtSignupLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Redirect to SignupActivity
                    Intent intent = new Intent(LoginActivity.class, SignupActivity.this);
                    startActivity(intent);
                }
            });
        }
}
