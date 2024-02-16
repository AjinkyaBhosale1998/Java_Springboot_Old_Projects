package com.example.TEST.entity;

import lombok.Data;

@Data
public class Sales {

	private Integer SaleId;
	private String SalesChannel;
	private Integer OrderNumber;
	private Integer ProductId;
	private Integer CustomerId;
	private Integer CurrencyId;
	private Integer NetAmount;
	private Integer Tax;
	private Integer ShippingCost;
	private Integer GrossAmount;
	
	

}