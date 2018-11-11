package br.com.johnsquispe.obstaclerest.domain;

import java.sql.Date;

import javax.persistence.Entity;

@Entity(name="obstacles")
public class Obstacle {

	private String description;
	private Local local;
	private Date lastUpdate;
	private boolean active;
	private boolean firstReport;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isFirstReport() {
		return firstReport;
	}
	public void setFirstReport(boolean firstReport) {
		this.firstReport = firstReport;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
			
}
