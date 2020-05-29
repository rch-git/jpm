package com.jpm.abstractclass.challenge.base;

/**
 * This is the interface for a GenericList. This should be implemented by all classes 
 * that wish to use the functionality of a GenericList.
 * 
 * @author Ravi
 *
 */

public interface GenericList
{
	GenericListItem getRoot();
	boolean addItem(GenericListItem newItem);
	boolean removeItem(GenericListItem itemToRemove);
	void traverse(GenericListItem listToPrint);
}
