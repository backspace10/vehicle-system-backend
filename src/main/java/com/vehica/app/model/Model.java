package com.vehica.app.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="models")
public class Model {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="mdl_id")
	private long modelId;
	
	@Column(name="mdl_name")
	private String modelName;
	
	@Column(name="mdl_price")
	private long modelPrice;
	

	@Column(name="music_config")
	private boolean musicConfig;
	

	@Column(name="color_config")
	private boolean colorConfig;
	

	@Column(name="music_id")
	private long musicId;
	

	@Column(name="color_id")
	private long colorId;


	public long getModelId() {
		return modelId;
	}


	public void setModelId(long modelId) {
		this.modelId = modelId;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public long getModelPrice() {
		return modelPrice;
	}


	public void setModelPrice(long modelPrice) {
		this.modelPrice = modelPrice;
	}


	public boolean isMusicConfig() {
		return musicConfig;
	}


	public void setMusicConfig(boolean musicConfig) {
		this.musicConfig = musicConfig;
	}


	public boolean isColorConfig() {
		return colorConfig;
	}


	public void setColorConfig(boolean colorConfig) {
		this.colorConfig = colorConfig;
	}


	public long getMusicId() {
		return musicId;
	}


	public void setMusicId(long musicId) {
		this.musicId = musicId;
	}


	public long getColorId() {
		return colorId;
	}


	public void setColorId(long colorId) {
		this.colorId = colorId;
	}

		
}
