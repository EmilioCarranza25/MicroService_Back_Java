package com.pruebaback.pruebaback.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/** 
 * 
 * Class Customer
 * Autor: Emilio Carranza
 * 
 * */

@Entity
@Data
@Table(name = "customer")
public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String firstName;
	private String secondName;
	private String lastName;
	private String lastaName2;
	private String phone;
	private String address;
	private String city;
	
	
}
