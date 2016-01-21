package com.mongotester.daomongo;

import com.mongodb.BasicDBObject;
import com.mongotester.daointerface.IDAOAbo;
import com.mongotester.entities.DBAbo;

public class DAOAbo extends DAOManager implements IDAOAbo {

	@Override
	public BasicDBObject parser(DBAbo abo) {
		BasicDBObject doc = new BasicDBObject
				(DBAbo.ID, abo.getId())
				.append(DBAbo.OPTARIT, abo.getOptarit())
				.append(DBAbo.ISOUSC, abo.getOptarit())
				.append(DBAbo.HHPHC, abo.getOptarit())
				.append(DBAbo.RETCLIENT, abo.getOptarit())
				.append(DBAbo.CONTRACT, abo.getOptarit())
				.append(DBAbo.OWNER, abo.getOptarit())
				.append(DBAbo.DATE_CREATED, abo.getOptarit())
				.append(DBAbo.DATE_FINISHED, abo.getOptarit())
				.append(DBAbo.COMPTEUR, abo.getOptarit())
				.append(DBAbo.PRICE, abo.getOptarit());
		return doc;
	}

	@Override
	public DBAbo parser(BasicDBObject abo) {
		DBAbo dbabo = new DBAbo();
		dbabo.setId(abo.getInt(DBAbo.ID));
		return dbabo;
	}

}
