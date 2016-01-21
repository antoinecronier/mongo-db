package com.mongotester.entities;

import java.util.Date;

public class DBLogConf extends DBMongo {
	private int id;
	private int pejp;
	private String demain;
	private int pmax;
	private String ppct;
	private String modetat;
	private String ptec;
	private Date date_created;
	private DBCompteur compteur;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPejp() {
		return pejp;
	}
	public void setPejp(int pejp) {
		this.pejp = pejp;
	}
	public String getDemain() {
		return demain;
	}
	public void setDemain(String demain) {
		this.demain = demain;
	}
	public int getPmax() {
		return pmax;
	}
	public void setPmax(int pmax) {
		this.pmax = pmax;
	}
	public String getPpct() {
		return ppct;
	}
	public void setPpct(String ppct) {
		this.ppct = ppct;
	}
	public String getModetat() {
		return modetat;
	}
	public void setModetat(String modetat) {
		this.modetat = modetat;
	}
	public String getPtec() {
		return ptec;
	}
	public void setPtec(String ptec) {
		this.ptec = ptec;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public DBCompteur getCompteur() {
		return compteur;
	}
	public void setCompteur(DBCompteur compteur) {
		this.compteur = compteur;
	}
	
	
}
