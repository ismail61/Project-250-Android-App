package com.example.quran;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "user.db";
    private static final String TABLE_NAME = "user";
    private static final String ID = "_id";
    private static final String NAME = "Name";
    private static final String EMAIL = "Email";
    private static final String USER_NAME = "UserName";
    private static final String PASSWORD = "Password";
    private static final String CONFIRM_PASSWORd = "Confirm_password";
    private static final int Version = 1;
    private Context context;

    private static final String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+"("+ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+NAME+" VARCHAR(255) NOT NULL,"+EMAIL+" TEXT NOT NULL,"+USER_NAME+" VARCHAR(200) NOT NULL,"+PASSWORD+" TEXT NOT NULL,"+CONFIRM_PASSWORd+" TEXT NOT NULL);";

    private static final String DROP_TABLE = " DROP TABLE IF EXISTS "+TABLE_NAME;
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, Version);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try {
            sqLiteDatabase.execSQL(CREATE_TABLE);
            Toast.makeText(context,"Oncreate is called",Toast.LENGTH_LONG).show();

        }catch (Exception e){
            Toast.makeText(context,"Exception : "+e,Toast.LENGTH_LONG).show();

        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        try {
            Toast.makeText(context,"Onupgrade is called",Toast.LENGTH_LONG).show();
            sqLiteDatabase.execSQL(DROP_TABLE);
            onCreate(sqLiteDatabase);
        }catch (Exception e){
            Toast.makeText(context,"Exception : "+e,Toast.LENGTH_LONG).show();

        }
    }

    public long insertData(UserDetails_Getter_Setter_method userDetails) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(NAME,userDetails.getName());
        contentValues.put(EMAIL,userDetails.getEmail());
        contentValues.put(USER_NAME,userDetails.getSignup_username());
        contentValues.put(PASSWORD,userDetails.getSignup_password());
        contentValues.put(CONFIRM_PASSWORd,userDetails.getConfirm_password());
        long rowId = sqLiteDatabase.insert(TABLE_NAME,null,contentValues);
        return rowId;
    }

    public Boolean finduser(String username_, String password_) {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM "+TABLE_NAME,null);
        Boolean res = false;
        if(cursor.getCount()==0)
        {
            Toast.makeText(context,"No Data Found !",Toast.LENGTH_LONG).show();
        }
        else {
            while (cursor.moveToNext()){
                String username = cursor.getString(3);
                String password = cursor.getString(4);
                if(username.equals(username_) && password.equals(password_)){
                    res = true;
                    break;
                }
            }
        }
        return  res;
    }
}
