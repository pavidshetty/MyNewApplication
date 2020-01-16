package com.example.mynewapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import android.widget.ProgressBar;

import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;




    public class Register extends AppCompatActivity {
        ProgressBar progressBar;
        EditText email;
        EditText password;
        EditText phone;
        EditText postal;
        EditText name;
        Button CreateAnAccount;

        FirebaseAuth firebaseAuth;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);

            progressBar = findViewById(R.id.progressBar);
            email = findViewById(R.id.email);
            password = findViewById(R.id.password);
            phone = findViewById(R.id.phone);
            postal = findViewById(R.id.postal);
            name = findViewById(R.id.name);
            CreateAnAccount = findViewById(R.id.clicksignin);

            firebaseAuth = FirebaseAuth.getInstance();

            this.setTitle("New User? Register here");

            CreateAnAccount.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    progressBar.setVisibility(View.VISIBLE);
                    firebaseAuth.createUserWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    progressBar.setVisibility(View.GONE);
                                    if (task.isSuccessful()) {
                                        Toast.makeText(Register.this, "Congratulations, your account has been created.", Toast.LENGTH_SHORT).show();

                                    } else {
                                        Toast.makeText(Register.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                                    }
                                }
                            });
                }
            });


        }
        public void regist(View view) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }

    };

