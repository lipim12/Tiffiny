package com.example.admin.tiffiny;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

public class CustomizeActivity extends AppCompatActivity {


    TextView txttiffinby,txtvendor,txtprice,txttime,txtmenu1,txtmenu2,txtmenu3,txtmenu4,txttotal;
    CheckBox chk1,chk2,chk3,chk4;
    TiffinyDBhelper helper;
    SQLiteDatabase db;
    Button btnorder,btncart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize);

        Spinner spinrotiqty=(Spinner)findViewById(R.id.spinrotiqty);

        ArrayAdapter<String> rotiadapter=new ArrayAdapter<String>(CustomizeActivity.this,R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.rotiquantity));
        rotiadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        spinrotiqty.setAdapter(rotiadapter);

        Spinner spinriceqty=(Spinner)findViewById(R.id.spinriceqty);

        ArrayAdapter<String> riceadapter=new ArrayAdapter<String>(CustomizeActivity.this,R.layout.support_simple_spinner_dropdown_item,getResources().getStringArray(R.array.ricequantity));
        riceadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        spinriceqty.setAdapter(riceadapter);

        txttiffinby=(TextView)findViewById(R.id.txtctiffinby);
        txtvendor=(TextView)findViewById(R.id.txtcvendorname);
        txtprice=(TextView)findViewById(R.id.txtcprice);
        txttime=(TextView)findViewById(R.id.txtctime);
        txtmenu1=(TextView)findViewById(R.id.txtmenu1);
        txtmenu2=(TextView)findViewById(R.id.txtmenu2);
        txtmenu3=(TextView)findViewById(R.id.txtmenu3);
        txtmenu4=(TextView)findViewById(R.id.txtmenu4);

        btnorder=(Button)findViewById(R.id.btnorder);
        btncart=(Button)findViewById(R.id.btncart);

        Intent intorder=new Intent(CustomizeActivity.this,OrdernowActivity.class);
        Intent intcart=new Intent(CustomizeActivity.this,CartActivity.class);

        btnorder.setOnClickListener(v -> {
            startActivity(intorder);

        });

        btncart.setOnClickListener(v -> {
            startActivity(intcart);

        });


        chk1=(CheckBox)findViewById(R.id.chk1);
        chk2=(CheckBox)findViewById(R.id.chk2);
        chk3=(CheckBox)findViewById(R.id.chk3);
        chk4=(CheckBox)findViewById(R.id.chk4);
        txttotal=(TextView)findViewById(R.id.txttotal);

        helper=new TiffinyDBhelper(this);
        db=helper.getReadableDatabase();

        Intent intc=getIntent();
        String tiffinid[]=new String[1];

        tiffinid[0]= intc.getStringExtra("tiffinid");
        String columnstf[]={"tid","tservicename","tvendorname","tprice","tlunchordinner","troti","tsabzi","trice","tdal","tsweetorfarsan","textras","tcutofftime"};

        Cursor ccusttf=db.query("tiffin",columnstf,"tid=?",tiffinid,null,null,null);
        ccusttf.moveToFirst();

        txttiffinby.setText(ccusttf.getString(1));
        txtvendor.setText(ccusttf.getString(2));
        txtprice.setText(ccusttf.getString(3));
        txttime.setText(ccusttf.getString(4));
        txtmenu1.setText("( "+ccusttf.getString(5)+" , "+ccusttf.getString(6)+")");
        txtmenu2.setText("( "+ccusttf.getString(7)+" , "+ccusttf.getString(8)+")");
        txtmenu3.setText("( "+ccusttf.getString(9)+" )");
        txtmenu4.setText("( "+ccusttf.getString(10)+" )");

        txttotal.setText(ccusttf.getString(3)+" Rs.");


/*

        boolean b1=chk1.isChecked();
        boolean b2=chk2.isChecked();
        boolean b3=chk3.isChecked();
        boolean b4=chk4.isChecked();
        int sum=0;
        if((b1 || b2))
        {
            txttotal.setText("Alert");
        }
        else
        {
            if(b1)
            {
                sum+=1;
            }
            if(b2)
            {
                sum+=1;
            }
            if(b3)
            {
                sum+=1;
            }
            if(b4)
            {
                sum+=1;
            }
        }
        int full;
        full=Integer.parseInt(ccusttf.getString(3));
        int half;
        half=Integer.parseInt(ccusttf.getString(3))/2;

        if(sum<=2)
        {
            txttotal.setText(half+" Rs.");
        }
        else
        {
            txttotal.setText(full+" Rs.");
        }
*/




    }
}
