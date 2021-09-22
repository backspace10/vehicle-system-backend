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
@Table(name="segment")
public class Segment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="seg_id")
	private long segId;
	
	@Column(name="seg_name")
	private String name;
	
	@Column(name="min_qty")
	private int minQty;

	
	@OneToMany(targetEntity = Model.class, cascade = CascadeType.ALL)
	@JoinColumn(name="seg_fk", referencedColumnName = "seg_id")
	private List<Model> model;


	public long getSegId() {
		return segId;
	}


	public void setSegId(long segId) {
		this.segId = segId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMinQty() {
		return minQty;
	}


	public void setMinQty(int minQty) {
		this.minQty = minQty;
	}


	public List<Model> getModel() {
		return model;
	}


	public void setModel(List<Model> model) {
		this.model = model;
	}
		
		
}
