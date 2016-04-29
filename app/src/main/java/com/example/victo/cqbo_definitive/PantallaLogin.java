package com.example.victo.cqbo_definitive;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class PantallaLogin extends AppCompatActivity {

    private EditText usernameField,passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT);
        setContentView(R.layout.login);
        //Declaracion de variables
        usernameField = (EditText)findViewById(R.id.email_user);
        passwordField = (EditText)findViewById(R.id.password_user);

    }
    public void loginPost(View view){
        String username = usernameField.getText().toString();
        String password = passwordField.getText().toString();
        new SigninActivity(this,1).execute(username,password);
    }
    public void register(View view) {
        Intent i = new Intent(this, RegistroUsuario.class );
        startActivity(i);
    }
}
