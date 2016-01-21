package com.mongotester.entities;

import java.util.Date;

public class DBAbo extends DBMongo {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6069831845181684320L;
	
	private int id;
	private String optarit;
	private int isousc;
	private String hhphc;
	private String retclient;
	private String contract;
	private String owner;
	private Date date_created;
	private Date date_finished;
	private DBCompteur compteur;
	private DBPrice price;
	
	public static final String ID = "id";
	public static final String OPTARIT = "optarit";
	public static final String ISOUSC = "isousc";
	public static final String HHPHC = "hhphc";
	public static final String RETCLIENT = "retclient";
	public static final String CONTRACT = "contract";
	public static final String OWNER = "owner";
	public static final String DATE_CREATED = "date_created";
	public static final String DATE_FINISHED = "date_finished";
	public static final String COMPTEUR = "compteur";
	public static final String PRICE = "price";
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOptarit() {
		return optarit;
	}
	public void setOptarit(String optarit) {
		this.optarit = optarit;
	}
	public int getIsousc() {
		return isousc;
	}
	public void setIsousc(int isousc) {
		this.isousc = isousc;
	}
	public String getHhphc() {
		return hhphc;
	}
	public void setHhphc(String hhphc) {
		this.hhphc = hhphc;
	}
	public String getRetclient() {
		return retclient;
	}
	public void setRetclient(String retclient) {
		this.retclient = retclient;
	}
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
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
	public DBCompteur getCompteur() {
		return compteur;
	}
	public void setCompteur(DBCompteur compteur) {
		this.compteur = compteur;
	}
	public DBPrice getPrice() {
		return price;
	}
	public void setPrice(DBPrice price) {
		this.price = price;
	}
	
	
}
