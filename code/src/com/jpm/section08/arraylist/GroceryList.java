package com.jpm.section08.arraylist;

import java.util.ArrayList;

public class GroceryList
{
	
	public ArrayList<String> getGroceryList()
	{
		return groceryList;
	}

//	public void setGroceryList(ArrayList<String> groceryList)
//	{
//		this.groceryList = groceryList;
//	}

	private ArrayList<String> groceryList = new ArrayList<String>();
	
	public void addGroceryItem(String item)
	{
		groceryList.add(item);
	}
	
	public void printGroceryList()
	{
		System.out.println("You have " + groceryList.size() + " item(s) in your list.");
		for (int i = 0; i < groceryList.size(); i++)
		{
			System.out.println((i + 1) + ". " + groceryList.get(i));
		}
	}
	
	private void modifyGroceryItem(int position, String newItem)
	{
		groceryList.set(position, newItem);
	}
	
	private void removeGroceryItem(int position)
	{
		groceryList.remove(position);
	}
	
	private int findItem(String searchItem)
	{
		return groceryList.indexOf(searchItem);
//		boolean exists = groceryList.contains(searchItem);
//		int position = groceryList.indexOf(searchItem);
//		if (position >= 0)
//		{
//			return groceryList.get(position);
//		}
//		
//		return null;
	}
	
	public void modifyGroceryItem(String currentItem, String newItem)
	{
		int position = findItem(currentItem);
		if (position >= 0)
		{
			modifyGroceryItem(position, newItem);
			System.out.println(currentItem + " has been replaced with " + newItem);
		}
	}
	
	public void removeGroceryItem(String item)
	{
		int position = findItem(item);
		if (position >= 0)
		{
			removeGroceryItem(position);
			System.out.println(item + " has been removed.");
		}
	}
	
	public boolean onFile(String item)
	{
		int position = findItem(item);
		if (position >= 0)
		{
			return true;
		}
		
		return false;
	}
}