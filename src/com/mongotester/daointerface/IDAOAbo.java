package com.mongotester.daointerface;

import com.mongodb.BasicDBObject;
import com.mongotester.entities.DBAbo;

public interface IDAOAbo extends IDAOBase {

	public BasicDBObject parser(DBAbo abo);
	public DBAbo parser(BasicDBObject abo);
}
