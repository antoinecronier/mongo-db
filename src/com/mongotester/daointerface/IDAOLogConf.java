package com.mongotester.daointerface;

import com.mongodb.BasicDBObject;
import com.mongotester.entities.DBLogConf;

public interface IDAOLogConf extends IDAOBase {

	public BasicDBObject parser(DBLogConf logConf);
	public DBLogConf parser(BasicDBObject logConf);
}
