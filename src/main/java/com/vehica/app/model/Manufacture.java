package com.vehica.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "manufacturer")
public class Manufacture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mnf_id")
	private long mnfId;
	
	@Column(name = "mnf_name")
	private String mnfName;

	
	@OneToMany(targetEntity = Model.class, cascade = CascadeType.ALL)
	@JoinColumn(name="mnf_fk", referencedColumnName = "mnf_id")
	private List<Model> model;


	public long getMnfId() {
		return mnfId;
	}


	public void setMnfId(long mnfId) {
		this.mnfId = mnfId;
	}


	public String getMnfName() {
		return mnfName;
	}


	public void setMnfName(String mnfName) {
		this.mnfName = mnfName;
	}


	public List<Model> getModel() {
		return model;
	}


	public void setModel(List<Model> model) {
		this.model = model;
	}

	
	
	
}
