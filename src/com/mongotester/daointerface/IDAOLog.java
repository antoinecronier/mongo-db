package com.mongotester.daointerface;

import com.mongodb.BasicDBObject;
import com.mongotester.entities.DBLog;

public interface IDAOLog extends IDAOBase {

	public BasicDBObject parser(DBLog log);
	public DBLog parser(BasicDBObject log);
}
