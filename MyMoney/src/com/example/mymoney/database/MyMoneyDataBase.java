package com.example.mymoney.database;

import java.util.HashMap;

import android.app.SearchManager;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;



public class MyMoneyDataBase {

//	private static final String TAG = "DictionaryDatabase";
//
//	//The columns we'll include in the dictionary table
//	public static final String KEY_VALUE = SearchManager.SUGGEST_COLUMN_TEXT_1;
//	public static final String KEY_DATE = SearchManager.SUGGEST_COLUMN_TEXT_2;
//
//	private static final String DATABASE_NAME = "mymoney";
//	private static final String FTS_VIRTUAL_TABLE = "FTSmymoney";
//	private static final int DATABASE_VERSION = 1;
//
//	private final MyMoneyOpenHelper mDatabaseOpenHelper;
//	private static final HashMap<String,String> mColumnMap = buildColumnMap();
//
//	/*
//	 * Constructor
//	 * @param context The Context within which to work, used to create the DB
//	 */
//	public MyMoneyDataBase(Context context) {
//		mDatabaseOpenHelper = new MyMoneyOpenHelper(context);
//	}
//
//	/**
//	 * Builds a map for all columns that may be requested, which will be given to the 
//	 * SQLiteQueryBuilder. This is a good way to define aliases for column names, but must include 
//	 * all columns, even if the value is the key. This allows the ContentProvider to request
//	 * columns w/o the need to know real column names and create the alias itself.
//	 */
//	private static HashMap<String,String> buildColumnMap() {
//		HashMap<String,String> map = new HashMap<String,String>();
//		map.put(KEY_VALUE, KEY_VALUE);
//		map.put(KEY_DATE, KEY_DATE);
//		map.put(BaseColumns._ID, "rowid AS " +
//				BaseColumns._ID);
//		map.put(SearchManager.SUGGEST_COLUMN_INTENT_DATA_ID, "rowid AS " +
//				SearchManager.SUGGEST_COLUMN_INTENT_DATA_ID);
//		map.put(SearchManager.SUGGEST_COLUMN_SHORTCUT_ID, "rowid AS " +
//				SearchManager.SUGGEST_COLUMN_SHORTCUT_ID);
//		return map;
//	}
//
//	private static class MyMoneyOpenHelper extends SQLiteOpenHelper
//	{
//
//		private final Context mHelperContext;
//		private SQLiteDatabase mDatabase;
//
//		MyMoneyOpenHelper(Context context){
//			super(context, DATABASE_NAME, null, DATABASE_VERSION);
//			mHelperContext = context;
//		}
//
//
//		@Override
//		public void onCreate(SQLiteDatabase db) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public void onUpgrade(SQLiteDatabase db, int oldVersion,
//				int newVersion) {
//			// TODO Auto-generated method stub
//
//		}
//
//	}

}
