package com.jpm.abstractclass.challenge.stringlist.impl;

import com.jpm.abstractclass.challenge.base.GenericList;
import com.jpm.abstractclass.challenge.base.GenericListItem;

public class MyStringList implements GenericList
{
	private Letter root = null;
	
	public MyStringList(Letter root)
	{
		this.root = root;
	}

	@Override
	public GenericListItem getRoot()
	{
		return this.root;
	}

	@Override
	public boolean addItem(GenericListItem newItem)
	{
//		If the root is null, the list is empty, therefore, 
//		the element being added is the root
		if(this.root == null)
		{
			this.root = (Letter) newItem;
			return true;
		}
		
//		If list is not empty, we start the process of figuring out where to add newItem
		Letter currentItem = this.root;
		
		while(currentItem != null)
		{
			int comparison = currentItem.compareTo(newItem);
//			newItem is greater than currentItem
			if(comparison < 0)
			{
//				the list is always ordered in ascending, therefore, if newItem is greater than currentItem,
//				we cycle through the elements until we find the right spot
				if(currentItem.next() != null)
				{
					currentItem = (Letter) currentItem.next();
				}
				else
				{
//					At this point, we compared newItem with all elements in the list, and we reached the end
					newItem.setPrevious(currentItem); //establish the left link
					currentItem.setNext(newItem); //establish the right link
					return true;
				}
			}
//			newItem is less than currentItem
			else if(comparison > 0)
			{
//				check to see if currentItem is the root, and if its not, 
//				establish the left and right links
				if(currentItem.previous() != null)
				{
					newItem.setNext(currentItem);
					newItem.setPrevious(currentItem.previous());
					currentItem.previous().setNext(newItem);
					currentItem.setPrevious(newItem);
					
				}
//				if currentItem is the root, then establish the links
				else
				{
					newItem.setNext(currentItem);
					currentItem.setPrevious(newItem);
					this.root = (Letter) newItem;
				}
				return true;
			}
			else
			{
				System.out.println(currentItem.getValue() + " is equal to: " + newItem.getValue());
				return false;
			}
		}
		return false;
	}

	/**
	 * Deleting an items involves finding the item in the list, and setting right and left links
	 * between its previous and next elements. 
	 */
	@Override
	public boolean removeItem(GenericListItem itemToRemove)
	{
		if(itemToRemove != null)
		{
			System.out.println("Finding " + itemToRemove.getValue());
		}
		
		Letter currentItem = this.root;
//		traverse through the list
		while(currentItem.next() != null)
		{
			int comparison = currentItem.compareTo(itemToRemove);
//			we found the element we want to delete, when currentItem is equal to itemToRemove
			if(comparison == 0)
			{
//				current item is the root
				if(currentItem == this.root)
				{
					this.root = (Letter) currentItem.next();
				}
				else
				{
//					if currentItem is not the root, then we should check if currentItem is
//					the last element in the list. 
					if(currentItem.next() != null) //currentItem is not the last element in the list
					{
						currentItem.previous().setNext(currentItem.next()); //establishing right link
						currentItem.next().setPrevious(currentItem.previous()); //establishing left link
					}
					else //currentItem is the last element in the list
					{
						currentItem.previous().setNext(null); //remove right link
						currentItem.setPrevious(null); //remove left link
					}
				}
				System.out.println("Removed: " + itemToRemove.getValue());
				return true;
			}
//			this will advance to the next item in the list for comparison
			else if(comparison < 0)
			{
				currentItem = (Letter) currentItem.next();
			}
//			this means after traversing the list, we found no element that matches
			else
			{
				System.out.println("Element " + itemToRemove.getValue() + " is not found.");
				return false;
			}
		}
		
		return false;
	}

	@Override
	public void traverse(GenericListItem gli)
	{
		if(gli == null)
		{
			System.out.println("The list is empty.");
		}
		else
		{
			while(gli != null)
			{
				System.out.println(gli.getValue());
				gli = gli.next();
			}
		}
	}
}