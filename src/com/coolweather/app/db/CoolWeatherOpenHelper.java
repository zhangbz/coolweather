package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	//将三条建表语句定义为常量
	/**
	 * Province表建表语句
	 */
	public static final String CREATE_PROVINCE = "create table Province (" 
	        + "id integer primary key autoincrement, "
			+ "privince_name text, "
	        + "province_code text)";
	
	/**
	 * City表建表语句
	 */
	public static final String CREATE_CITY  = "create table City ("
			+ "id integer primary key autoincrement, "
			+ " city_name text, "
			+ " city_code text, "
			+"province_id integer)";
	
	/**
	 * Country表建表语句
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
		db.execSQL(CREATE_PROVINCE); //创建province表
		db.execSQL(CREATE_CITY);     //创建city表
		db.execSQL(CREATE_COUNTRY);  //创建country表
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
