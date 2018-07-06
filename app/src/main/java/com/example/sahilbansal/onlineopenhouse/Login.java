package com.example.sahilbansal.onlineopenhouse;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {
String username;
    EditText uid;
    EditText password;
String pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        uid = (EditText)findViewById(R.id.uid);
        password = (EditText)findViewById(R.id.password);
        Button login = (Button)findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username =  uid.getText().toString();
                pass = password.getText().toString();
                if(username.isEmpty() || pass.isEmpty())
                {
                    Toast.makeText(Login.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(Login.this, "access granted", Toast.LENGTH_SHORT).show();
                   BlankFragment blankFragment = new BlankFragment();
                   getSupportFragmentManager().beginTransaction().replace(R.id.layout , blankFragment).addToBackStack(null).commit();
                }
            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
