package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	//������������䶨��Ϊ����
	/**
	 * Province�������
	 */
	public static final String CREATE_PROVINCE = "create table Province (" 
	        + "id integer primary key autoincrement, "
			+ "privince_name text, "
	        + "province_code text)";
	
	/**
	 * City�������
	 */
	public static final String CREATE_CITY  = "create table City ("
			+ "id integer primary key autoincrement, "
			+ " city_name text, "
			+ " city_code text, "
			+"province_id integer)";
	
	/**
	 * Country�������
	 */
	public static final String CREATE_COUNTRY ="create table Country ("
	        + "id interger primary key autoincrement, "
			+ "country_name text, "
	        + "country_code text, "
			+ "city_id integer)";
	
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE); //����province��
		db.execSQL(CREATE_CITY);     //����city��
		db.execSQL(CREATE_COUNTRY);  //����country��
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
