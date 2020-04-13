package alamin.c.islamicapp.Adapters;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class AyatSavedDatabaseHelper extends SQLiteOpenHelper {

        private  static  final  String DATABASE_NAME="Ayats.db";
        private  static  final  String TABLE_NAME="SavedAyats";
        private  static  final  String ID="_id";
        private  static  final  String English="English";
        private  static  final  String Bangla="Bangla";
        private  static  final  String AyatSerial="AyatSerial";
        private  static  final  String Arabic="Arabic";
        private  static  final  String SuraName="SuraName";
        private  static  final  String Translate="Translate";
        private  static  final  int VERSION_NUMBER=15;
        private  static  final  String CREATE_TABLE="CREATE TABLE "+TABLE_NAME+"("+ID+" INTEGER PRIMARY KEY AUTOINCREMENT ,"+English+"  VARCHAR,"+Bangla+" VARCHAR, "+AyatSerial+" VARCHAR,"+Arabic+" VARCHAR ,"+SuraName+" VARCHAR,"+Translate+" VARCHAR);";

        private  static  final  String DROP_TABLE="DROP TABLE IF EXISTS "+TABLE_NAME;
        private  Context context;
         private  static  final  String GETVALUE="SELECT * FROM "+TABLE_NAME;



    public AyatSavedDatabaseHelper(@Nullable Context context) {
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


    public long insertData(String bangla,String english,String ayatSerial,String arabic,String suraName,String translate){

       SQLiteDatabase sqLiteDatabase= this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Bangla,bangla);
        contentValues.put(English,english);
        contentValues.put(AyatSerial,ayatSerial);
        contentValues.put(Arabic,arabic);
        contentValues.put(SuraName,suraName);
        contentValues.put(Translate,translate);


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
