package com.jpm.section09.interfaces.burger;

import java.util.List;

public interface OrderingSystem
{
//	public void printReceipt(Object o);
//	double calculateFinalPrice(Object o);
	
	public void printReceipt(List<Object> o);
	public double calculateFinalPrice(List<Object> o);
}
