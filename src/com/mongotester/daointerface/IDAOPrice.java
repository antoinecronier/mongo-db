package com.mongotester.daointerface;

import com.mongodb.BasicDBObject;
import com.mongotester.entities.DBPrice;

public interface IDAOPrice extends IDAOBase {

	public BasicDBObject parser(DBPrice price);
	public DBPrice parser(BasicDBObject price);
}
