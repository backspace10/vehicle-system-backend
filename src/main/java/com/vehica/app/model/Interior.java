package com.vehica.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interior")
public class Interior {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "interior_id")
	private long interiorId;

	@Column(name = "ac_id")
	private long acId;

	@Column(name = "music_id")
	private long musicId;

	@Column(name = "airbags")
	private String airbags;

	@Column(name = "leather_seat")
	private String seat;

	@Column(name = "model_id")
	private long modelId;

	public long getInteriorId() {
		return interiorId;
	}

	public void setInteriorId(long interiorId) {
		this.interiorId = interiorId;
	}

	public long getAcId() {
		return acId;
	}

	public void setAcId(long acId) {
		this.acId = acId;
	}

	public long getMusicId() {
		return musicId;
	}

	public void setMusicId(long musicId) {
		this.musicId = musicId;
	}

	public String getAirbags() {
		return airbags;
	}

	public void setAirbags(String airbags) {
		this.airbags = airbags;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public long getModelId() {
		return modelId;
	}

	public void setModelId(long modelId) {
		this.modelId = modelId;
	}

}
