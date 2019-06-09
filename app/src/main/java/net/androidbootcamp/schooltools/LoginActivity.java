package net.androidbootcamp.schooltools;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import net.androidbootcamp.schooltools.database.LoginDataSource;


public class LoginActivity extends AppCompatActivity {
    EditText mTextUserName;
    EditText mTextPassword;
    Button mBtnLogin;
    TextView mTVRegister;

    LoginDataSource mLoginDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mTextUserName = (EditText)findViewById(R.id.etUsername);
        mTextPassword = (EditText)findViewById(R.id.etPassword);
        mBtnLogin = (Button)findViewById(R.id.btnLogin);
        mTVRegister = (TextView)findViewById(R.id.tvRegister);
        mTVRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(registerIntent);
            }
        });
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuIntent = new Intent (LoginActivity.this, MenuActivity.class);
                startActivity(menuIntent);
            }
        });
      mLoginDataSource = new LoginDataSource(this);
      mLoginDataSource.open();




    }

    @Override
    protected void onPause() {
        super.onPause();
        mLoginDataSource.close();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mLoginDataSource.open();
    }
}
