package com.jpm.abstractclass.challenge.mylinkedlist;

public class MyStringList implements GenericList
{
	private Letter root = null;
	
	public MyStringList(Letter root)
	{
		super();
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
				if(currentItem.next() != null)
				{
					currentItem = (Letter) currentItem.next();
				}
				else
				{
//					At this point, we are adding the element at the end of the list
					newItem.setPrevious(currentItem); //establish the left link
					currentItem.setNext(newItem); //establish the right link
					return true;
				}
			}
//			newItem is less than currentItem
			else if(comparison > 0)
			{
//				check to see if currentItem is the root
				if(currentItem.previous() != null)
				{
//					newItem.setPrevious(currentItem);
//					currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
					newItem.setNext(currentItem);
					newItem.setPrevious(currentItem.previous());
					currentItem.previous().setNext(newItem);
					currentItem.setPrevious(newItem);
					
				}
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

	@Override
	public boolean removeItem(GenericListItem itemToRemove)
	{
		if(itemToRemove != null)
		{
			System.out.println("Removing " + itemToRemove.getValue());
		}
		
		Letter currentItem = this.root;
//		traverse through the list
		while(currentItem.next() != null)
		{
			int comparison = currentItem.compareTo(itemToRemove);
//			we found the element we want to delete
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
//					the last element in the list
					if(currentItem.next() != null)
					{
						currentItem.previous().setNext(currentItem.next()); //establishing right link
						currentItem.next().setPrevious(currentItem.previous()); //establishing left link
					}
					else
					{
						currentItem.previous().setNext(null); //remove right link
						currentItem.setPrevious(null); //remove left link
					}
				}
				return true;
			}
			else if(comparison < 0)
			{
				currentItem = (Letter) currentItem.next();
			}
			else
			{
//				this means after traversing the list, we found no element that matches
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