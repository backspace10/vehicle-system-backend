package com.vehica.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fog_light")
public class FogLight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fog_light_id")
	private long fogLightId;

	@Column(name = "fog_light_name")
	private String fogLightName;

	@Column(name = "fog_light_price")
	private long fogLightPrice;

	public long getFogLightId() {
		return fogLightId;
	}

	public void setFogLightId(long fogLightId) {
		this.fogLightId = fogLightId;
	}

	public String getFogLightName() {
		return fogLightName;
	}

	public void setFogLightName(String fogLightName) {
		this.fogLightName = fogLightName;
	}

	public long getFogLightPrice() {
		return fogLightPrice;
	}

	public void setFogLightPrice(long fogLightPrice) {
		this.fogLightPrice = fogLightPrice;
	}


}
