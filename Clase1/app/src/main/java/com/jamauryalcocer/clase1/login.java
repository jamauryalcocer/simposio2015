package com.jamauryalcocer.clase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {


    EditText user,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText)findViewById(R.id.usuario);
        password = (EditText)findViewById(R.id.password);
    }

    public void Login(View view){
        if (user.getText().toString()=="david" && password.getText().toString()=="123456"){

            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Datos Ivalidos", Toast.LENGTH_LONG).show();
        }
    }
}
