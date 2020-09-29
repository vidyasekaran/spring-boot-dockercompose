package com.javatechie.os.api.common;

import com.javatechie.os.api.entity.Order;



public class TransactionResponse {
  
	private Order order;
    private double amount;
    private String transactionId;
    private String message;
	
	public TransactionResponse(Order order2, double amount2, String transactionId2, String response) {
		this.order = order2;
		this.amount =amount2;
		this.transactionId=transactionId2;
		this.message = response;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
    
    public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
}
