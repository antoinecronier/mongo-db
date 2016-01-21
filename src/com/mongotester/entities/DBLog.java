package com.mongotester.entities;

import java.util.Date;

public class DBLog extends DBMongo {
	private int id;
	private int iinst;
	private int papp;
	private Date date_created;
	private int index;
	private DBLogConf logConf;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIinst() {
		return iinst;
	}
	public void setIinst(int iinst) {
		this.iinst = iinst;
	}
	public int getPapp() {
		return papp;
	}
	public void setPapp(int papp) {
		this.papp = papp;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public DBLogConf getLogConf() {
		return logConf;
	}
	public void setLogConf(DBLogConf logConf) {
		this.logConf = logConf;
	}
	
	
}
