package com.hackinroms.maritime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by USER on 7/8/2016.
 */
public class Login extends AppCompatActivity {

    private static final String TAG = Login.class.getSimpleName();
    private Button btnLogin;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btnLogin=(Button)findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(Login.this, MainActivity.class);
                startActivity(ii);
            }
        });
    }
}
