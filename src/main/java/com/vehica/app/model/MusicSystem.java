package com.vehica.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "music_system")
public class MusicSystem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "music_id")
	private long musicId;

	@Column(name = "music_name")
	private String musicName;

	@Column(name = "music_price")
	private long musicPrice;

	@Column(name = "music_config")
	private boolean musicConfig;

	public long getMusicId() {
		return musicId;
	}

	public void setMusicId(long musicId) {
		this.musicId = musicId;
	}

	public String getMusicName() {
		return musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}

	public long getMusicPrice() {
		return musicPrice;
	}

	public void setMusicPrice(long musicPrice) {
		this.musicPrice = musicPrice;
	}

	public boolean isMusicConfig() {
		return musicConfig;
	}

	public void setMusicConfig(boolean musicConfig) {
		this.musicConfig = musicConfig;
	}

}
