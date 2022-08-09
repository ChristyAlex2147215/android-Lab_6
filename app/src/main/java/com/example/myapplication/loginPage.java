package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.util.Log;

public class loginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }
    public void signIn(View view)
    {
        //user name
        EditText t1=(EditText)findViewById(R.id.username);
        String value=String.valueOf(t1.getText());
        //password
        EditText t2=(EditText)findViewById(R.id.password);
        String value2=String.valueOf(t2.getText());
        //checking condition
        if (value.equals("christy") && value2.equals("alex"))
        {
            Intent i1=new Intent(this,MainActivity.class);
            i1.putExtra("username",value);
            startActivity(i1);
        }
        else
        {
            Log.i("Not valid credentials","Oncreate method");
        }



    }
}