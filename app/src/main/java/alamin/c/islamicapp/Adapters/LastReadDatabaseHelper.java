package alamin.c.islamicapp.Adapters;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class LastReadDatabaseHelper extends SQLiteOpenHelper {

        private  static  final  String DATABASE_NAME="LastRead.db";
        private  static  final  String TABLE_NAME="Lastreadlist";
        private  static  final  String ID="_id";
        private  static  final  String Serial="Serial";
        private  static  final  String Name="Name";
        private  static  final  String Url="url";
        private  static  final  int VERSION_NUMBER=10;
        private  static  final  String CREATE_TABLE="CREATE TABLE "+TABLE_NAME+"("+ID+" INTEGER PRIMARY KEY AUTOINCREMENT ,"+Serial+" int(400),"+Name+" VARCHAR(50), "+Url+" VARCHAR(500));";
        private  static  final  String DROP_TABLE="DROP TABLE IF EXISTS "+TABLE_NAME;
        private  Context context;
         private  static  final  String GETVALUE="SELECT * FROM "+TABLE_NAME;



    public LastReadDatabaseHelper(@Nullable Context context) {
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


    public long insertData(String serial,String name,String url){

       SQLiteDatabase sqLiteDatabase= this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Serial,serial);
        contentValues.put(Name,name);
        contentValues.put(Url,url);

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
