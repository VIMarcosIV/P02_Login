package org.iesch.p02_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import org.iesch.p02_login.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button btnLogin = binding.btnLogin;

        binding.btnLogin.setOnClickListener(v -> {
            String email = binding.email.getText().toString();
            String password = binding.password.getText().toString();
            Intent GoToLoggedActivity = new Intent(this, HomeActivity.class);
            GoToLoggedActivity.putExtra("email", email);
            GoToLoggedActivity.putExtra("password", password);
            if (binding.email.getText().toString().isEmpty() || binding.password.getText().toString().isEmpty()) {
                Toast.makeText(this, R.string.Toast, Toast.LENGTH_SHORT).show();
            }else{
                startActivity(GoToLoggedActivity);
            }
        });
    }

}