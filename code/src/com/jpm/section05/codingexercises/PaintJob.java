package com.jpm.section05.codingexercises;

public class PaintJob
{
	public static void main(String[] args)
	{
		System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

	}
	
	public static int getBucketCount( double width, double height, double areaPerBucket, int extraBuckets)
	{
		if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
		{
			return -1;
		}
		
		else
		{
			double wallArea = width * height;
			
			int extraBucketsNeeded =  (int) Math.ceil(((wallArea/areaPerBucket) - extraBuckets));
			
			return extraBucketsNeeded;
		}
	}
	
	/*
	 * public static int getBucketCount(double width, double height, double areaPerBucket)
	 * {
	 * 
	 * }
	 */
}