package com.jpm.abstractclass.challenge.mylinkedlist;

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
	boolean addItem(GenericListItem gli);
	boolean removeItem(GenericListItem gli);
	void traverse(GenericListItem gli);
}
