package com.vehica.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tyre")
public class Tyre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tyre_id")
	private long tyreId;

	@Column(name = "tyre_name")
	private String tyreName;

	@Column(name = "tyre_price")
	private long tyrePrice;

	public long getTyreId() {
		return tyreId;
	}

	public void setTyreId(long tyreId) {
		this.tyreId = tyreId;
	}

	public String getTyreName() {
		return tyreName;
	}

	public void setTyreName(String tyreName) {
		this.tyreName = tyreName;
	}

	public long getTyrePrice() {
		return tyrePrice;
	}

	public void setTyrePrice(long tyrePrice) {
		this.tyrePrice = tyrePrice;
	}

}
