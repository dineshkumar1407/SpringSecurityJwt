package com.example.springjwt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Null;

import com.sun.istack.NotNull;

@Entity
@Table(name = "roles")
public class Role {	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	
	private Integer  id;
	public Role(Integer  id) {
//		super();
		this.id = id;
	}

	@Enumerated(EnumType.STRING)
	@Column(length = 20,name="name")
	private ERole name;

	public Role() {

	}

	public Role(ERole name) {
		this.name = name;
	}

	public Integer  getId() {
		return id;
	}

	public void setId(Integer  id) {
		this.id = id;
	}

	public ERole getName() {
		return name;
	}

	public void setName(ERole name) {
		this.name = name;
	}
}
