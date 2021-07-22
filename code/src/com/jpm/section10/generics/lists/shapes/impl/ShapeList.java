package com.jpm.section10.generics.lists.shapes.impl;

import com.jpm.section10.generics.lists.base.GenericList;

public class ShapeList implements GenericList<ShapeItem>
{
	private ShapeItem root = null;

	@Override
	public ShapeItem getRoot()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addItem(ShapeItem newItem)
	{
//		If the root is null, the list is empty, therefore, 
//		the element being added is the root
		if(this.root == null)
		{
			this.root = newItem;
			return true;
		}
		
//		If list is not empty, we start the process of figuring out where to add newItem
		ShapeItem currentItem = this.root;

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
					currentItem = currentItem.next();
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
					newItem.setPrevious(currentItem.previous());
					newItem.setNext(currentItem);
					currentItem.previous().setNext(newItem);
					currentItem.setPrevious(newItem);
				}
//				if currentItem is the root, then establish the links
				else
				{
					newItem.setNext(currentItem);
					currentItem.setPrevious(newItem);
					this.root = newItem;	
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

	@Override
	public boolean removeItem(ShapeItem itemToRemove)
	{
		if(itemToRemove != null)
		{
			System.out.println("Removing " + itemToRemove.getValue());
		}
		
		ShapeItem currentItem = this.root;
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
					this.root = currentItem.next();
				}
				else
				{
//					if currentItem is not the root, then we should check if currentItem is
//					the last element in the list.
					if(currentItem.next() != null)
					{
						currentItem.previous().setNext(currentItem.next());
						currentItem.next().setPrevious(currentItem.previous());
					}
					else
					{
						currentItem.previous().setNext(null); //remove right link
						currentItem.setPrevious(null); //remove left link
					}
				}
				System.out.println("Removed: " + itemToRemove.getValue());
				return true;
			}
			else if(comparison < 0)
			{
				currentItem = currentItem.next();
			}
			else
			{
				System.out.println("Element " + itemToRemove.getValue() + " is not found.");
				return false;
			}
		}
		return false;
	}

	@Override
	public void traverse(ShapeItem shape)
	{
		if(shape == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			while(shape != null)
			{
				System.out.println(shape.getValue());
				shape = shape.next();
			}
		}
	}
}
