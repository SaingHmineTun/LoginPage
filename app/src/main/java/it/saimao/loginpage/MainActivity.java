package it.saimao.loginpage;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String EMAIL = "test@gmail.com";
    private final String PASSWORD = "1234";
    private EditText etEmail, etPassword;
    private Button btLogin, btExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();
        initListeners();
    }

    private void initUi() {
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btLogin = findViewById(R.id.btLogin);
        btExit = findViewById(R.id.btExit);
    }

    private void initListeners() {
        btLogin.setOnClickListener(v -> login());
        btExit.setOnClickListener(v -> exit());
    }

    private void exit() {
        finish();
    }

    private void login() {
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();
        if (email.equals(EMAIL) && password.equals(PASSWORD)) {
            Toast.makeText(getApplicationContext(), "Login Success!", Toast.LENGTH_SHORT).show();
        } else {
            if (!email.equals(EMAIL)) {
                Toast.makeText(this, "Wrong Email Address", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Wrong Password", Toast.LENGTH_SHORT).show();
            }
        }
    }
}