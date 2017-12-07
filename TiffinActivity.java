package com.example.admin.tiffiny;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TiffinActivity extends AppCompatActivity {

    ImageView imgtiffin;
    TextView txtservicename,txtvendorname,txtprice,txttime,txtroti,txtsabzi,txtrice,txtdal,txtswfr,txtextras,txtcutoff;
    String tiffinid[]=new String[1];
    TiffinyDBhelper helper;
    SQLiteDatabase db;
    Button btncustomize,btnordernow,btnaddtocart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiffin);

        imgtiffin=(ImageView)findViewById(R.id.imgtiffin);
        btncustomize=(Button)findViewById(R.id.btncustomize);
        btnordernow=(Button)findViewById(R.id.btnordernow);
        btnaddtocart=(Button)findViewById(R.id.btnaddtocart);

        txtservicename=(TextView)findViewById(R.id.txttiffinby);
        txtvendorname=(TextView)findViewById(R.id.txtvendorname);
        txtprice=(TextView)findViewById(R.id.txtprice);
        txttime=(TextView)findViewById(R.id.txttime);
        txtroti=(TextView)findViewById(R.id.txtroti);
        txtsabzi=(TextView)findViewById(R.id.txtsabzi);
        txtrice=(TextView)findViewById(R.id.txtrice);
        txtdal=(TextView)findViewById(R.id.txtdal);
        txtswfr=(TextView)findViewById(R.id.txtswfr);
        txtextras=(TextView)findViewById(R.id.txtextras);
        txtcutoff=(TextView)findViewById(R.id.txtcutoff);


        helper=new TiffinyDBhelper(this);
        db=helper.getReadableDatabase();

        Intent intshowtiffin=getIntent();
       boolean b= intshowtiffin.hasExtra("tiffinid");
        String id=intshowtiffin.getStringExtra("tiffinid");
        tiffinid[0]=id;
      //  System.out.println(intshowtiffin.getStringExtra("tiffinid"));
        String columnstf[]={"tid","tservicename","tvendorname","tprice","tlunchordinner","troti","tsabzi","trice","tdal","tsweetorfarsan","textras","tcutofftime"};

        Cursor ctf=db.query("tiffin",columnstf,"tid=?",tiffinid,null,null,null);
        ctf.moveToFirst();
        //String a=ctf.getString(0);
        txtservicename.setText(ctf.getString(1));
       txtvendorname.setText(ctf.getString(2));
        txtprice.setText(ctf.getString(3)+"  Rs. ");
        txttime.setText(ctf.getString(4));
        txtroti.setText(ctf.getString(5));
        txtsabzi.setText(ctf.getString(6));
        txtrice.setText(ctf.getString(7));
        txtdal.setText(ctf.getString(8));
        txtswfr.setText(ctf.getString(9));
        txtextras.setText(ctf.getString(10));
        txtcutoff.setText(ctf.getString(11));

        Intent intcustomize=new Intent(TiffinActivity.this,CustomizeActivity.class);
        Intent intaddtocart=new Intent(TiffinActivity.this,CartActivity.class);
        Intent intordernow=new Intent(TiffinActivity.this,OrdernowActivity.class);

        btncustomize.setOnClickListener(v -> {
            intcustomize.putExtra("tiffinid",id);
            startActivity(intcustomize);

        });

        btnordernow.setOnClickListener(v -> {
            startActivity(intordernow);

        });

        btnaddtocart.setOnClickListener(v -> {
            startActivity(intaddtocart);

        });

    }
}
