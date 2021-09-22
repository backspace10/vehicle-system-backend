package com.vehica.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exterior")
public class Exterior {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ext_id")
	private long exteriorId;

	@Column(name = "color_id")
	private long color_id;

	@Column(name = "tyre_id")
	private long tyreId;

	@Column(name = "fog_light_id")
	private long fogLightId;

	@Column(name = "model_id")
	private long modelId;

	public long getExteriorId() {
		return exteriorId;
	}

	public void setExteriorId(long exteriorId) {
		this.exteriorId = exteriorId;
	}

	public long getColor_id() {
		return color_id;
	}

	public void setColor_id(long color_id) {
		this.color_id = color_id;
	}

	public long getTyreId() {
		return tyreId;
	}

	public void setTyreId(long tyreId) {
		this.tyreId = tyreId;
	}

	public long getFogLightId() {
		return fogLightId;
	}

	public void setFogLightId(long fogLightId) {
		this.fogLightId = fogLightId;
	}

	public long getModelId() {
		return modelId;
	}

	public void setModelId(long modelId) {
		this.modelId = modelId;
	}

}
