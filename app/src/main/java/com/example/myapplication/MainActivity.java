package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//public static final String Mes="my message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Log.i(Mes,"Oncreate method");
        setContentView(R.layout.activity_main);
        //for getting the text from the user name
        Intent i=getIntent();
        String s=i.getStringExtra("username");
        StringBuffer sbuff=new StringBuffer();
        sbuff.append(s).append(", ");
        sbuff.append("Welcome to my app");
        System.out.println(s);
        TextView tv2=(TextView)findViewById(R.id.tv2);
        tv2.setText(sbuff);
    }
    @Override
    protected  void onResume()
    {
        super.onResume();
        Toast.makeText(getApplicationContext(),"Resuming App",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected  void onStart()
    {
        super.onStart();
        Toast.makeText(getApplicationContext(),"Starting App",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected  void onPause()
    {
        super.onPause();
        Toast.makeText(getApplicationContext(),"Pausing App",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected  void onStop()
    {
        super.onStop();
        Toast.makeText(getApplicationContext(),"Stopping App",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void  onRestart()
    {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"Restarting App",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Destroyed App",Toast.LENGTH_SHORT).show();

    }

    public void furniList(View v)
    {
        //ImageView imv1=(ImageView)findViewById(R.id.iv1);
        Intent i1 = new Intent(this, furnitures.class);
        startActivity(i1);
    }

}