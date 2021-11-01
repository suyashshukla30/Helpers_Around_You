package com.trackme.helpersaroundyou;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.hbb20.CountryCodePicker;

public class Login extends AppCompatActivity {

    CountryCodePicker ccp;
    EditText etPhoneNo;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etPhoneNo = findViewById(R.id.etPhoneNo);
        ccp = findViewById(R.id.ccp);
        ccp.registerCarrierNumberEditText(etPhoneNo);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this , VerifyOTP.class);
                intent.putExtra("mobile",ccp.getFullNumberWithPlus().replace(" ",""));
                startActivity(intent);
            }
        });
    }
}