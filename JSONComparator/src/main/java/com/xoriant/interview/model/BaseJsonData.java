package com.xoriant.interview.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "baseJson")
public class BaseJsonData {

	private Long id;

	private String inputJson;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	@Column(name = "inputJson", length = 10000)
	public String getInputJson() {
		return inputJson;
	}

	public void setInputJson(String inputJson) {
		this.inputJson = inputJson;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
