package net.androidbootcamp.schooltools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class RegisterActivity extends AppCompatActivity {
    EditText mTextUserName;
    EditText mTextPassword;
    Button mButtonRegister;
    EditText mTextFirstName;
    EditText mTextLastName;
    EditText mTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mTextUserName = (EditText)findViewById(R.id.etUsername);
        mTextPassword = (EditText)findViewById(R.id.etPassword);
        mButtonRegister = (Button)findViewById(R.id.btnRegister);
        mTextFirstName = (EditText)findViewById(R.id.etFirstName);
        mTextLastName = (EditText)findViewById(R.id.etLastName);
        mTextEmail = (EditText)findViewById(R.id.etEmail);
        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(LoginIntent);
            }
        });

    }
}
