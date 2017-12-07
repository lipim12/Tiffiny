package com.example.admin.tiffiny;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {

    EditText edituname;
    EditText editpwd;
    String uname;
    String pwd;
    Button btnsignup,btnlogin;
    TiffinyDBhelper helper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         edituname = (EditText) findViewById(R.id.edituname);
         editpwd = (EditText) findViewById(R.id.editpwd);

        btnsignup=(Button) findViewById(R.id.btnsignup);

        btnlogin=(Button) findViewById(R.id.btnLogIn);
        //editbar.setText("hello user");

         helper=new TiffinyDBhelper(this);
         db= helper.getWritableDatabase();

        btnlogin.setOnClickListener((v -> {

            Intent intlogin=new Intent(MainActivity.this,LoginActivity.class);
            startActivity(intlogin);


                })
        );
    }

    public void invokeSignUp(View v)
    {

        uname=edituname.getText().toString();
        pwd=editpwd.getText().toString();

        if(!(uname.isEmpty() || pwd.isEmpty())) {
            ContentValues values = new ContentValues();

            values.put("uname", uname);
            values.put("upwd", pwd);

            long row = db.insert("user", null, values);
            System.out.println("rows inserted : - " + row);

            db = helper.getReadableDatabase();
            String columns[] = {"uid", "uname", "upwd"};
            Cursor c = db.query("user", columns, null, null, null, null, null);


            Intent intwelcome=new Intent(MainActivity.this,WelcomeActivity.class);

            startActivity(intwelcome);

        }


    }

}