package com.example.admin.tiffiny;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by admin on 6/9/2017.
 */

public class TiffinyDBhelper extends SQLiteOpenHelper
{


    public TiffinyDBhelper(Context context) {
        super(context, "Tiffiny.db", null, 3);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("create table user (uid integer primary key autoincrement,uname text,upwd text)");
        db.execSQL("create table tiffin (tid text primary key,tservicename text,tvendorname text,tprice integer,tlunchordinner text,tdal text,troti text,tsabzi text,trice text,tsweetorfarsan text,textras text,tcutofftime text)");

        ContentValues tiffin1details=new ContentValues();
        tiffin1details.put("tid","1");
        tiffin1details.put("tservicename","Annapurna Lunch");
        tiffin1details.put("tvendorname","Annapurna");
        tiffin1details.put("tprice",70);
        tiffin1details.put("tlunchordinner","Lunch");
        tiffin1details.put("tdal","Mung Dal");
        tiffin1details.put("troti","Chapati");
        tiffin1details.put("tsabzi","Mix Vegetable");
        tiffin1details.put("trice","Jeera Rice");
        tiffin1details.put("tsweetorfarsan","Khaman");
        tiffin1details.put("textras","Papad and Mangopickel");
        tiffin1details.put("tcutofftime","8 A.M");
        db.insert("tiffin",null,tiffin1details);

        ContentValues tiffin2details=new ContentValues();
        tiffin2details.put("tid","2");
        tiffin2details.put("tservicename","Foodella Lunch");
        tiffin2details.put("tvendorname","Foodella");
        tiffin2details.put("tprice",75);
        tiffin2details.put("tlunchordinner","Lunch");
        tiffin2details.put("tdal","Tadka Dal");
        tiffin2details.put("troti","Butter Roti");
        tiffin2details.put("tsabzi","Chana Masala");
        tiffin2details.put("trice","Poolav");
        tiffin2details.put("tsweetorfarsan","------");
        tiffin2details.put("textras","Papad,Lemonpickel");
        tiffin2details.put("tcutofftime","9 A.M");
        db.insert("tiffin",null,tiffin2details);

        ContentValues tiffin3details=new ContentValues();
        tiffin3details.put("tid","3");
        tiffin3details.put("tservicename","Foodella Dinner");
        tiffin3details.put("tvendorname","Foodella");
        tiffin3details.put("tprice",65);
        tiffin3details.put("tlunchordinner","Dinner");
        tiffin3details.put("tdal","Mung Dal");
        tiffin3details.put("troti","Chapati");
        tiffin3details.put("tsabzi","Bhindi");
        tiffin3details.put("trice","Jeera Rice");
        tiffin3details.put("tsweetorfarsan","------");
        tiffin3details.put("textras","Papad,Buttermilk");
        tiffin3details.put("tcutofftime","8:30 A.M");
        db.insert("tiffin",null,tiffin3details);

        ContentValues tiffin4details=new ContentValues();
        tiffin4details.put("tid","4");
        tiffin4details.put("tservicename","Annapurna Dinner");
        tiffin4details.put("tvendorname","Annapurna");
        tiffin4details.put("tprice",75);
        tiffin4details.put("tlunchordinner","Dinner");
        tiffin4details.put("tdal","Tadka dal");
        tiffin4details.put("troti","Butter roti");
        tiffin4details.put("tsabzi","Paneer Tikka");
        tiffin4details.put("trice","jeera rice");
        tiffin4details.put("tsweetorfarsan","Samosa");
        tiffin4details.put("textras","Papad,Mangopickel");
        tiffin4details.put("tcutofftime","6 P.M");
        db.insert("tiffin",null,tiffin4details);

        ContentValues tiffin5details=new ContentValues();
        tiffin5details.put("tid","5");
        tiffin5details.put("tservicename","Swasthi Lunch");
        tiffin5details.put("tvendorname","Swasthi");
        tiffin5details.put("tprice",60);
        tiffin5details.put("tlunchordinner","Lunch");
        tiffin5details.put("tdal","Curry");
        tiffin5details.put("troti","Naan roti");
        tiffin5details.put("tsabzi","Dum Aloo");
        tiffin5details.put("trice","Poolav");
        tiffin5details.put("tsweetorfarsan","------");
        tiffin5details.put("textras","Buttermilk");
        tiffin5details.put("tcutofftime","8:30 A.M");
        db.insert("tiffin",null,tiffin5details);

        ContentValues tiffin6details=new ContentValues();
        tiffin6details.put("tid","6");
        tiffin6details.put("tservicename","Swarnam Lunch");
        tiffin6details.put("tvendorname","Swarnam Foods");
        tiffin6details.put("tprice",70);
        tiffin6details.put("tlunchordinner","Lunch");
        tiffin6details.put("tdal","Saambhar");
        tiffin6details.put("troti","Idli");
        tiffin6details.put("tsabzi","-----");
        tiffin6details.put("trice","------");
        tiffin6details.put("tsweetorfarsan","Sweet");
        tiffin6details.put("textras","Coconut Chutney");
        tiffin6details.put("tcutofftime","9 A.M");
        db.insert("tiffin",null,tiffin6details);

        ContentValues tiffin7details=new ContentValues();
        tiffin7details.put("tid","7");
        tiffin7details.put("tservicename","Swarnam Dinner");
        tiffin7details.put("tvendorname","Swarnam Foods");
        tiffin7details.put("tprice",70);
        tiffin7details.put("tlunchordinner","Dinner");
        tiffin7details.put("tdal","Saambhar");
        tiffin7details.put("troti","Dosa");
        tiffin7details.put("tsabzi","------");
        tiffin7details.put("trice","------");
        tiffin7details.put("tsweetorfarsan","Sweet");
        tiffin7details.put("textras","Coconut Chutney");
        tiffin7details.put("tcutofftime","6:30 P.M");
        db.insert("tiffin",null,tiffin7details);

        ContentValues tiffin8details=new ContentValues();
        tiffin8details.put("tid","8");
        tiffin8details.put("tservicename","Rasodu Lunch");
        tiffin8details.put("tvendorname","Rasodu");
        tiffin8details.put("tprice",75);
        tiffin8details.put("tlunchordinner","Lunch");
        tiffin8details.put("tdal","Curry");
        tiffin8details.put("troti","Chapati");
        tiffin8details.put("tsabzi","Aloo Bengan");
        tiffin8details.put("trice","Jeera Rice");
        tiffin8details.put("tsweetorfarsan","Dhokla");
        tiffin8details.put("textras","Papad,Buttermilk");
        tiffin8details.put("tcutofftime","8:30 A.M");
        db.insert("tiffin",null,tiffin8details);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists user");
        db.execSQL("drop table if exists tiffin");
        onCreate(db);
    }
}
