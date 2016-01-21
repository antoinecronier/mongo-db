package com.mongotester.daomongo;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongotester.daointerface.IDAOBase;
import com.mongotester.entities.DBAbo;
import com.mongotester.usermanager.Collections;
import com.mongotester.usermanager.Constants;

public class DAOManager implements IDAOBase{

	private MongoClient myMongoCli;
	private MongoDatabase myDB;
	
	//#region Singleton
	protected DAOManager()
	{}
 
	private static DAOManager instance = null;
 
	public static DAOManager getInstance()
	{			
		if (instance == null)
		{ 	instance = new DAOManager();	
		}
		return instance;
	}
	//#end region
	
	@Override
	public DBObject getWithField(String findField, String findData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DBObject getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setItem(DBObject object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DBObject updateWithField(String findField, String findData,
			DBObject object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DBObject updateAll(String findField, String findData, DBObject object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MongoDatabase connectDB(String host, int ip) {
		myMongoCli = new MongoClient(host, ip);
		myDB = myMongoCli.getDatabase(Constants.DB_BASE);
		return myDB;
	}

	@Override
	public void closeDB() {
		myMongoCli.close();
	}

	@Override
	public MongoCollection<Document> selectCol(Collections col) {
		return myDB.getCollection(col.name());
	}
}
