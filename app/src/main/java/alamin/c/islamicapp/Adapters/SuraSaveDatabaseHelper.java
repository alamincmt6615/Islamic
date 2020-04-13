package alamin.c.islamicapp.Adapters;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SuraSaveDatabaseHelper extends SQLiteOpenHelper {

        private  static  final  String DATABASE_NAME="SavedSura.db";
        private  static  final  String TABLE_NAME="lastSura";
        private  static  final  String ID="_id";
        private  static  final  String SuraName="SuraName";
        private  static  final  String SuraSerial="Serial";
        private  static  final  String SuraTranslate="SuraTranslate";
        private  static  final  String SuraArabic="SuraArabic";
        private  static  final  int VERSION_NUMBER=11;
        private  static  final  String CREATE_TABLE="CREATE TABLE "+TABLE_NAME+"("+ID+" INTEGER PRIMARY KEY AUTOINCREMENT ,"+SuraName+" int(400),"+SuraSerial+" VARCHAR(50), "+SuraTranslate+" VARCHAR(500),"+SuraArabic+" VARCHAR(500));";
        private  static  final  String DROP_TABLE="DROP TABLE IF EXISTS "+TABLE_NAME;
        private  Context context;
         private  static  final  String GETVALUE="SELECT * FROM "+TABLE_NAME;



    public SuraSaveDatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION_NUMBER);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        
            try{
                sqLiteDatabase.execSQL(CREATE_TABLE);
                Toast.makeText(context, "onCreate", Toast.LENGTH_SHORT).show();
            }catch (Exception e){
             Toast.makeText(context, "Error : "+e, Toast.LENGTH_SHORT).show();
            }
 
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        try {
            sqLiteDatabase.execSQL(DROP_TABLE);
            onCreate(sqLiteDatabase);
        }catch (Exception e){
        Toast.makeText(context, "Something Wrong"+e, Toast.LENGTH_SHORT).show();
        }

    }


    public long insertData(String name,String serial,String translate,String arabic){

       SQLiteDatabase sqLiteDatabase= this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(SuraName,name);
        contentValues.put(SuraSerial,serial);
        contentValues.put(SuraTranslate,translate);
        contentValues.put(SuraArabic,arabic);


      long rowid=  sqLiteDatabase.insert(TABLE_NAME,null,contentValues);
        return rowid;



    }
    public Cursor displayalldata(){
        SQLiteDatabase sqLiteDatabase= this.getWritableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery(GETVALUE,null);
        return cursor;

    }
    public int deleteData(String id){
        SQLiteDatabase sqLiteDatabase= this.getWritableDatabase();
       return sqLiteDatabase.delete(TABLE_NAME,ID+" = ?",new String[]{id});

    }



}
