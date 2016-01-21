package com.mongotester.daointerface;

import org.bson.Document;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongotester.entities.DBAbo;
import com.mongotester.usermanager.Collections;

public interface IDAOBase {

	public DBObject getWithField(String findField, String findData);
	public DBObject getAll();
	
	public void setItem(DBObject object);
	
	public DBObject updateWithField(String findField, String findData, DBObject object);
	public DBObject updateAll(String findField, String findData, DBObject object);
	
	public MongoDatabase connectDB(String host, int ip);
	public void closeDB();
	
	public MongoCollection<Document> selectCol(Collections col);
}
