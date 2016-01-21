package com.mongotester.entities;

import java.util.Date;

public class DBPrice extends DBMongo{
	private int id;
	private float pricehp;
	private float pricehc;
	private Date date_created;
	private Date date_finished;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPricehp() {
		return pricehp;
	}
	public void setPricehp(float pricehp) {
		this.pricehp = pricehp;
	}
	public float getPricehc() {
		return pricehc;
	}
	public void setPricehc(float pricehc) {
		this.pricehc = pricehc;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public Date getDate_finished() {
		return date_finished;
	}
	public void setDate_finished(Date date_finished) {
		this.date_finished = date_finished;
	}
	
	
}
