package com.jpm.section10.generics.lists.base;

public interface GenericList<T>
{
	T getRoot();
	boolean addItem(T newItem);
	boolean removeItem(T itemToRemove);
	void traverse(T gli);
}