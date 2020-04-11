package alamin.c.islamicapp.Adapters;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataAccess {
   private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private  static  DataAccess instance;
    Cursor c=null;


    private DataAccess(Context context){

        this.openHelper=new QuranDatabasehelper(context);

    }



    public static  DataAccess  getInstance(Context context){
        if(instance==null){
            instance=new DataAccess(context);
        }
        return  instance;
    }

    public void open(){
        this.db=openHelper.getReadableDatabase();
    }
    public void  close(){
        if(db!=null){
            this.db.close();
        }
    }



    public Cursor displaysura(){
        String GETVALUE="SELECT * FROM qp_sura";
        SQLiteDatabase sqLiteDatabase= openHelper.getWritableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery(GETVALUE,null);
        return cursor;

    }
    public Cursor getSura(int id){
        String GETVALUE="SELECT * FROM quran_verses where  sura_id = '"+id+"'";
        SQLiteDatabase sqLiteDatabase= openHelper.getWritableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery(GETVALUE,null);
        return cursor;

    }  public Cursor getSurawithPara(int id,int para){
        String GETVALUE="SELECT * FROM quran_verses where  sura_id = '"+id+"'  AND  para_hafizi ='"+para+"'";
        SQLiteDatabase sqLiteDatabase= openHelper.getWritableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery(GETVALUE,null);
        return cursor;

    }
    public Cursor getPara(){
        String GETVALUE="SELECT * FROM qp_para";
        SQLiteDatabase sqLiteDatabase= openHelper.getWritableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery(GETVALUE,null);
        return cursor;

    }





}
