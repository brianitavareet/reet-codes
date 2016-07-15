package com.hackinroms.maritime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by USER on 7/8/2016.
 */
public class Login extends AppCompatActivity {

    private static final String TAG = Login.class.getSimpleName();
    private Button btnLogin;
    private EditText loginEmailtxt;
    private EditText loginPasswordTxt;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btnLogin=(Button)findViewById(R.id.btn_login);
        loginEmailtxt=(EditText)findViewById(R.id.login_email);
        loginPasswordTxt=(EditText)findViewById(R.id.login_password);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String EMAIL=loginEmailtxt.getText().toString();
                String PASSWORD=loginPasswordTxt.getText().toString();

                if(EMAIL.isEmpty()){
                    loginEmailtxt.setError("Please enter username");
                }else if(PASSWORD.isEmpty()){
                    loginPasswordTxt.setError("Please enter password");
                }else{
                    if(!EMAIL.equals("pprinka") || !PASSWORD.equals("pprinka")){
                        Toast.makeText(Login.this, "Wrong username or password", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(Login.this, "Login successful!", Toast.LENGTH_LONG).show();
                        Intent ii=new Intent(Login.this, MainActivity.class);
                        startActivity(ii);
                        finish();
                    }
                }
            }
        });
    }
}
