package com.nt.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {

	@Id
	private Integer eid;
	private String ename;
	private Double esal;
}
