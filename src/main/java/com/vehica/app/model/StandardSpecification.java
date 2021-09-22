package com.vehica.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "standard_specification")
public class StandardSpecification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "std_spec_id")
	private long id;

	@Column(name = "std_spec_name")
	private String stdSpecName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStdSpecName() {
		return stdSpecName;
	}

	public void setStdSpecName(String stdSpecName) {
		this.stdSpecName = stdSpecName;
	}

}
