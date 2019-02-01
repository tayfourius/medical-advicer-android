package com.example.medical_req;

import android.R.string;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DataHolder {

	public static final String Desc = "desc";
	public static final String DescR = "descr";
	public static final String ID = "id";
	public static final String D_ID ="d_id";
	
	public static final String ID2 = "id";
	public static final String R_ID = "r_id";
	public static final String NAME = "name";
	public static final String YKTRH = "yktrh";
	public static final String YSBT = "ysbt";
	public static final String TDBIR ="tdbir";
	
	public static final String DATA_BASE_NAME = "MEDICAL";
	
	public static final String TABLE_NAME =  "INDICATION";
	public static final String TABLE2_NAME =  "DISEASES";
	
	public static final String TABLE1_CREATE = "create table INDICATION (id int not null , d_id int not null , desc text not null, descr text not null) ;";
	
	public static final String TABLE2_CREATE = "create table DISEASES (id int not null , r_id int not null , name text not null, yktrh text not null, ysbt text not null, tdbir text not null) ;";
	
	public static final int DATA_BASE_VERSION = 1;
	

	DataBaseHelper DBHelper;
	Context ctx;
	static SQLiteDatabase db;
	public DataHolder(Context ctx)
	{
		this.ctx=ctx;
		DBHelper=new DataBaseHelper(ctx);
		
	}
	
	
	private static class DataBaseHelper extends SQLiteOpenHelper
	{

		
		public DataBaseHelper(Context ctx) {
			super(ctx, DATA_BASE_NAME, null, DATA_BASE_VERSION);
			//onUpgrade(db, 0, 1);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			try
			{
				db.execSQL(TABLE1_CREATE);
				db.execSQL(TABLE2_CREATE);
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
		@Override
		public void onUpgrade(SQLiteDatabase db, int OldVersion , int NewVersion) {
			db.execSQL("DROP TABLE IF EXISTS INDICATION");
			db.execSQL("DROP TABLE IF EXISTS DISEASES");
			onCreate(db);
			
		}
		
	}
	
	public DataHolder open()
	{
		db= DBHelper.getWritableDatabase();
		return this;
	}
	public void close() {
		DBHelper.close();
	}
	public long insertData(int id, int d_id , String desc, String descr) {
	
		if(id == 0)
		{
			
			db.execSQL("DROP TABLE IF EXISTS INDICATION");
			db.execSQL(TABLE1_CREATE);
		}
		
		ContentValues content = new ContentValues();
		content.put(ID, id);
		content.put(D_ID, d_id);
		content.put(Desc, desc);
		content.put(DescR, descr);
		return  db.insertOrThrow(TABLE_NAME, null, content);
		
	}
public long insertData2(int id, int r_id ,String nam, String yktr7 , String ysbte, String tdbiir) {
		if(id==0)
		{
		db.execSQL("DROP TABLE IF EXISTS DISEASES");
		db.execSQL(TABLE2_CREATE);
		}
		ContentValues content = new ContentValues();
		content.put(ID, id);
		content.put(R_ID, r_id);
		content.put(NAME, nam);
		content.put(YKTRH, yktr7);
		content.put(YSBT, ysbte);
		content.put(TDBIR, tdbiir);
		
		return  db.insertOrThrow(TABLE2_NAME, null, content);
		
	}
	public Cursor returnData(String D_id)
	{
		
        //Cursor cursor = db.rawQuery("SELECT * FROM INDICATION", null);
        Cursor cursor =db.query(TABLE_NAME, new String []{ ID , D_ID , Desc , DescR} , "D_ID =="+D_id , null, null, null, null);
		return cursor;//db.query(TABLE_NAME, new String []{ ID , D_ID , Desc} , "D_ID == 3" , null, null, null, null);
		
		
	}
	public Cursor returnData2(String ii)
	{
		Cursor cursor =db.query(TABLE2_NAME, new String []{ ID , R_ID ,NAME , YKTRH, YSBT, TDBIR} , "R_ID =="+ii , null, null, null, null);
		//Cursor cursor = db.rawQuery("SELECT * FROM DISEASES", null);
		return cursor;//db.query(TABLE2_NAME, new String []{ ID , R_ID ,NAME , YKTRH, YSBT, TDBIR} , "ID =="+ii , null, null, null, null);
		
		
	}
	
	}