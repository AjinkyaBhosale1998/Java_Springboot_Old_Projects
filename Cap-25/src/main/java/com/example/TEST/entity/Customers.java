package com.example.TEST.entity;

import lombok.Data;

@Data
public class Customers {

	private Integer CustomersId;
	private String FirstName;
	private String LastName;
	private String Email;
	private Long Phone;
	private Integer CountryId;

}