package com.vehica.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "colors")
public class Colors {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "clr_id")
	private long clrId;

	@Column(name = "clr_name")
	private String clrName;

	@Column(name = "clr_price")
	private long clrPrice;

	@Column(name = "clr_config")
	private boolean clrConfig;

	public long getClrId() {
		return clrId;
	}

	public void setClrId(long clrId) {
		this.clrId = clrId;
	}

	public String getClrName() {
		return clrName;
	}

	public void setClrName(String clrName) {
		this.clrName = clrName;
	}

	public long getClrPrice() {
		return clrPrice;
	}

	public void setClrPrice(long clrPrice) {
		this.clrPrice = clrPrice;
	}

	public boolean isClrConfig() {
		return clrConfig;
	}

	public void setClrConfig(boolean clrConfig) {
		this.clrConfig = clrConfig;
	}

}
