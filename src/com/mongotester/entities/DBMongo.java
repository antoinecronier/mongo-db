package com.mongotester.entities;

import org.bson.Document;

public class DBMongo extends Document {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int _id;

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}
	
	
}
