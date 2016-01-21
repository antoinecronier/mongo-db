package com.mongotester.entities;

import java.util.Date;

public class DBCompteur extends DBMongo {
	private int id;
	private String adco;
	private DBAdresse adresse;
	private Date date_created;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdco() {
		return adco;
	}
	public void setAdco(String adco) {
		this.adco = adco;
	}
	public DBAdresse getAdresse() {
		return adresse;
	}
	public void setAdresse(DBAdresse adresse) {
		this.adresse = adresse;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	
	
}
