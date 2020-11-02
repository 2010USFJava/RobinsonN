package com.challenge.bean;

import java.io.Serializable;

import com.challenge.writer.TeamLog;
import com.challenge.writer.UAvVill;
import com.challenge.writer.Writer;


public class One4All implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dekuUnderdog;
	private String sirnighteyeIntelligence;
	private String bakugoPowerhouse;
	private String endeavorBackup;
	private String todorokiEmo;
	
	public One4All() {
		super();
		Writer.writeTeams(UAvVill.teamList);
	}

	public One4All(String dekuUnderdog, String sirnighteyeIntelligence, String bakugoPowerhouse, String endeavorBackup,
			String todorokiEmo) {
		super();
		this.dekuUnderdog = dekuUnderdog;
		this.sirnighteyeIntelligence = sirnighteyeIntelligence;
		this.bakugoPowerhouse = bakugoPowerhouse;
		this.endeavorBackup = endeavorBackup;
		this.todorokiEmo = todorokiEmo;
		
		Writer.writeTeams(UAvVill.teamList);
		TeamLog.logTeam("info", "New Heroes have joined UA led by, " + this.endeavorBackup + ". PLUS ULTRA!");
		
	}

	public String getDekuUnderdog() {
		return dekuUnderdog;
	}

	public void setDekuUnderdog(String dekuUnderdog) {
		this.dekuUnderdog = dekuUnderdog;
	}

	public String getSirnighteyeIntelligence() {
		return sirnighteyeIntelligence;
	}

	public void setSirnighteyeIntelligence(String sirnighteyeIntelligence) {
		this.sirnighteyeIntelligence = sirnighteyeIntelligence;
	}

	public String getBakugoPowerhouse() {
		return bakugoPowerhouse;
	}

	public void setBakugoPowerhouse(String bakugoPowerhouse) {
		this.bakugoPowerhouse = bakugoPowerhouse;
	}

	public String getEndeavorBackup() {
		return endeavorBackup;
	}

	public void setEndeavorBackup(String endeavorBackup) {
		this.endeavorBackup = endeavorBackup;
	}

	public String getTodorokiEmo() {
		return todorokiEmo;
	}

	public void setTodorokiEmo(String todorokiEmo) {
		this.todorokiEmo = todorokiEmo;
	}

	@Override
	public String toString() {
		return "Your Team One4All Includes: \n [Team Underdog " + dekuUnderdog + "\n Team Intelligence " + sirnighteyeIntelligence
				+ "\n Team Powerhouse " + bakugoPowerhouse + "Seaoned Hero " + endeavorBackup + "/n Mandatory Emo Memmber "
				+ todorokiEmo + "]";
	}

	
	
	
}
