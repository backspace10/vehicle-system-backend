package com.vehica.app.model;

public class EmailSender {

	private String userName;
	private String body;
	private String clientFullName;
	private String modelName;
	private String configColor;
	private String configMusic;
	private long qty;
	private long modelPrice;
	private long modelId;
	
	
	
	public long getModelId() {
		return modelId;
	}

	public void setModelId(long modelId) {
		this.modelId = modelId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getClientFullName() {
		return clientFullName;
	}

	public void setClientFullName(String clientFullName) {
		this.clientFullName = clientFullName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getConfigColor() {
		return configColor;
	}

	public void setConfigColor(String configColor) {
		this.configColor = configColor;
	}

	public String getConfigMusic() {
		return configMusic;
	}

	public void setConfigMusic(String configMusic) {
		this.configMusic = configMusic;
	}

	public long getQty() {
		return qty;
	}

	public void setQty(long qty) {
		this.qty = qty;
	}

	public long getModelPrice() {
		return modelPrice;
	}

	public void setModelPrice(long modelPrice) {
		this.modelPrice = modelPrice;
	}

}
