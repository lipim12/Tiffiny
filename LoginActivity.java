package com.example.admin.tiffiny;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {

    EditText loginuname,loginpwd;
    Button btnloginactual;
    TiffinyDBhelper helplogin;
    SQLiteDatabase db;

    String username,userpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginuname=(EditText)findViewById(R.id.loginuname);
        loginpwd=(EditText)findViewById(R.id.loginpwd);
        btnloginactual=(Button)findViewById(R.id.btnLogInactual);




        helplogin=new TiffinyDBhelper(this);
        db=helplogin.getReadableDatabase();
        btnloginactual.setOnClickListener((v -> {


            username=loginuname.getText().toString();
            userpwd=loginpwd.getText().toString();


           if(!(username.isEmpty() || userpwd.isEmpty())) {
               String columns[] = {"uname", "upwd"};
               String select[] = {username, userpwd};
               Cursor c1 = db.query("user", columns, "uname=? and upwd=?", select, null, null, null, null);


               Intent int2 = new Intent(LoginActivity.this, WelcomeActivity.class);

               if (c1.getCount() != 0) {
                   startActivity(int2);
               }

           }


        }));
    }
}
