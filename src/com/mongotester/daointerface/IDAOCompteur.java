package com.mongotester.daointerface;

import com.mongodb.BasicDBObject;
import com.mongotester.entities.DBCompteur;

public interface IDAOCompteur extends IDAOBase{

	public BasicDBObject parser(DBCompteur compteur);
	public DBCompteur parser(BasicDBObject compteur);
}
