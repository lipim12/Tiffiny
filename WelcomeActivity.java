package com.example.admin.tiffiny;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    ImageView imgcombo;
    ImageView imgtiffin10,imgtiffin11,imgtiffin12,imgtiffin13,imgtiffin14,imgtiffin15,imgtiffin16,imgtiffin17;
    TextView txttiffin10,txttiffin11,txttiffin12,txttiffin13,txttiffin14,txttiffin15,txttiffin16,txttiffin17;
    TiffinyDBhelper helper1;
    SQLiteDatabase db1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        imgcombo=(ImageView)findViewById(R.id.imgcombo);

        imgtiffin10=(ImageView)findViewById(R.id.imgtiffin10);
        imgtiffin11=(ImageView)findViewById(R.id.imgtiffin11);
        imgtiffin12=(ImageView)findViewById(R.id.imgtiffin12);
        imgtiffin13=(ImageView)findViewById(R.id.imgtiffin13);
        imgtiffin14=(ImageView)findViewById(R.id.imgtiffin14);
        imgtiffin15=(ImageView)findViewById(R.id.imgtiffin15);
        imgtiffin16=(ImageView)findViewById(R.id.imgtiffin16);
        imgtiffin17=(ImageView)findViewById(R.id.imgtiffin17);


        txttiffin10=(TextView)findViewById(R.id.txttiffin10);
        txttiffin11=(TextView)findViewById(R.id.txttiffin11);
        txttiffin12=(TextView)findViewById(R.id.txttiffin12);
        txttiffin13=(TextView)findViewById(R.id.txttiffin13);
        txttiffin14=(TextView)findViewById(R.id.txttiffin14);
        txttiffin15=(TextView)findViewById(R.id.txttiffin15);
        txttiffin16=(TextView)findViewById(R.id.txttiffin16);
        txttiffin17=(TextView)findViewById(R.id.txttiffin17);

        helper1=new TiffinyDBhelper(this);
        db1=helper1.getReadableDatabase();
        boolean b;//=db1.isOpen();
        String columns[]={"tservicename","tprice","tlunchordinner"};
        Cursor c1=db1.query("tiffin",columns,null,null,null,null,null);
        c1.moveToFirst();


        txttiffin10.setText("Tiffin Name :\t" + c1.getString(0)+"\nPrice :\t" + c1.getString(1) +"\nLunch/Dinner :\t"+c1.getString(2));

        c1.moveToNext();
        txttiffin11.setText("Tiffin Name :\t"+c1.getString(0)+"\nPrice :\t" + c1.getString(1) +" Rs.\nLunch/Dinner :\t"+c1.getString(2));
        c1.moveToNext();
        txttiffin12.setText("Tiffin Name :\t"+c1.getString(0)+"\nPrice :\t" + c1.getString(1) +" Rs.\nLunch/Dinner :\t"+c1.getString(2));
        c1.moveToNext();
        txttiffin13.setText("Tiffin Name :\t"+c1.getString(0)+"\nPrice :\t" + c1.getString(1) +" Rs.\nLunch/Dinner :\t"+c1.getString(2));
        c1.moveToNext();
        txttiffin14.setText("Tiffin Name :\t"+c1.getString(0)+"\nPrice :\t" + c1.getString(1) +" Rs.\nLunch/Dinner :\t"+c1.getString(2));
        c1.moveToNext();
        txttiffin15.setText("Tiffin Name :\t"+c1.getString(0)+"\nPrice :\t" + c1.getString(1) +" Rs.\nLunch/Dinner :\t"+c1.getString(2));
        c1.moveToNext();
        txttiffin16.setText("Tiffin Name :\t"+c1.getString(0)+"\nPrice :\t" + c1.getString(1) +" Rs.\nLunch/Dinner :\t"+c1.getString(2));
        c1.moveToNext();
        txttiffin17.setText("Tiffin Name :\t"+c1.getString(0)+"\nPrice :\t" + c1.getString(1) +" Rs.\nLunch/Dinner :\t"+c1.getString(2));



        Intent intspecifitiffin=new Intent(WelcomeActivity.this,TiffinActivity.class);

        imgtiffin10.setOnClickListener(v -> {


            intspecifitiffin.putExtra("tiffinid","1");
            startActivity(intspecifitiffin);

        });

        imgtiffin11.setOnClickListener(v -> {

            intspecifitiffin.putExtra("tiffinid","2");
            startActivity(intspecifitiffin);

        });

        imgtiffin12.setOnClickListener(v -> {

            intspecifitiffin.putExtra("tiffinid","3");
            startActivity(intspecifitiffin);

        });

        imgtiffin13.setOnClickListener(v -> {

            intspecifitiffin.putExtra("tiffinid","4");
            startActivity(intspecifitiffin);

        });

        imgtiffin14.setOnClickListener(v -> {

            intspecifitiffin.putExtra("tiffinid","5");
            startActivity(intspecifitiffin);

        });

        imgtiffin15.setOnClickListener(v -> {

            intspecifitiffin.putExtra("tiffinid","6");
            startActivity(intspecifitiffin);

        });

        imgtiffin16.setOnClickListener(v -> {

            intspecifitiffin.putExtra("tiffinid","7");
            startActivity(intspecifitiffin);

        });

        imgtiffin17.setOnClickListener(v -> {

            intspecifitiffin.putExtra("tiffinid","8");
            startActivity(intspecifitiffin);

        });
    }
}
