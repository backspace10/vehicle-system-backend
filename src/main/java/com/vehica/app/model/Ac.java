package com.vehica.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ac")
public class Ac {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ac_id")
	private long acId;

	@Column(name = "ac_name")
	private String acName;

	@Column(name = "ac_power")
	private float acPower;

	@Column(name = "ac_price")
	private long acPrice;

	public long getAcId() {
		return acId;
	}

	public void setAcId(long acId) {
		this.acId = acId;
	}

	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName;
	}

	public float getAcPower() {
		return acPower;
	}

	public void setAcPower(float acPower) {
		this.acPower = acPower;
	}

	public long getAcPrice() {
		return acPrice;
	}

	public void setAcPrice(long acPrice) {
		this.acPrice = acPrice;
	}

}
