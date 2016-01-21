package com.mongotester;

import java.util.ArrayList;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import static java.util.concurrent.TimeUnit.SECONDS;

public class main {

	public static void main(String[] args) {
		// To directly connect to a single MongoDB server (note that this will
		// not
		// auto-discover the primary even
		// if it's a member of a replica set:
		MongoClient myMongoCli = new MongoClient("localhost", 27017);

		// or, to connect to a replica set, with auto-discovery of the primary,
		// supply a seed list of members
		/*
		 * MongoClient mongoClient = new MongoClient(Arrays.asList(new
		 * ServerAddress("localhost", 27017), new ServerAddress("localhost",
		 * 27018), new ServerAddress("localhost", 27019)));
		 */
		DB db = myMongoCli.getDB("mydb");

		// Insert stuff in a collection
		DBCollection coll = db.getCollection("testCollection");
		BasicDBObject doc = new BasicDBObject("name", "MongoDB")
				.append("type", "database").append("count", 1)
				.append("info", new BasicDBObject("x", 203).append("y", 102));
		coll.insert(doc);

		// Retrieve first data from a collection
		DBObject myDoc = coll.findOne();
		System.out.println(myDoc);

		// Insert 100 data to a collection and print number of item in the
		// collection
		for (int i = 0; i < 100; i++) {
			coll.insert(new BasicDBObject("i", i));
		}
		System.out.println(coll.getCount());

		// Retrieve item from db
		BasicDBObject query = new BasicDBObject("i", 71);
		DBCursor cursor = coll.find(query);
		try {
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}
		} finally {
			cursor.close();
		}

		// Retrieve items from db
		query = new BasicDBObject("i", new BasicDBObject("$gt", 20).append(
				"$lte", 30));
		ArrayList<BasicDBObject> collRetrieve = new ArrayList<BasicDBObject>();
		cursor = coll.find(query);
		try {
			while (cursor.hasNext()) {
				collRetrieve.add((BasicDBObject) cursor.next());
			}
		} finally {
			cursor.close();
		}

		for (BasicDBObject basicDBObject : collRetrieve) {
			System.out.println(basicDBObject.get("i"));
		}

		// Retrieve max possible items in a period of time
		int items = coll.find().maxTime(1, SECONDS).count();

		// Run chained operation on db
		/*
		 * BulkWriteOperation builder = coll.initializeOrderedBulkOperation();
		 * builder.insert(new BasicDBObject("id", 1)); builder.insert(new
		 * BasicDBObject("id", 2)); builder.insert(new BasicDBObject("id", 3));
		 */
		DBObject document1 = new BasicDBObject();
		document1.put("id", "1");
		DBObject document2 = new BasicDBObject();
		document2.put("id", "2");
		DBObject document3 = new BasicDBObject();
		document2.put("id", "3");
		ArrayList<DBObject> documents = new ArrayList<DBObject>();
		documents.add(document1);
		documents.add(document2);
		documents.add(document3);
		coll.insert(documents);

		/*
		 * builder.find(new BasicDBObject("id", 1)).updateOne(new
		 * BasicDBObject("$set", new BasicDBObject("x", 2))); builder.find(new
		 * BasicDBObject("id", 2)).removeOne(); builder.find(new
		 * BasicDBObject("id", 3)).replaceOne(new BasicDBObject("_id",
		 * 3).append("x", 4));
		 */

		// BulkWriteResult result = builder.execute();

		// 2. Unordered bulk operation - no guarantee of order of operation
		/*
		 * builder = coll.initializeUnorderedBulkOperation(); builder.find(new
		 * BasicDBObject("_id", 1)).removeOne(); builder.find(new
		 * BasicDBObject("_id", 2)).removeOne();
		 * 
		 * result = builder.execute();
		 */

	}
}
