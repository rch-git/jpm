package com.jom.innerclass;

public class GearboxMain
{

	public static void main(String[] args)
	{
		Gearbox mclaren = new Gearbox(6);
//		Gearbox.Gear first = xyz.new Gear(1, 12.3);
//		System.out.println("drive speed: " + first.driveSpeed(100));
//		mclaren.addGear(1, 5.3);
//		mclaren.addGear(2, 6);
//		mclaren.addGear(3, 15.9);
		
		  mclaren.operateClutch(true);
		  mclaren.changeGear(1);
		  mclaren.operateClutch(false);
		  System.out.println(mclaren.wheelSpeed(1000));
		  mclaren.changeGear(2);
		  System.out.println(mclaren.wheelSpeed(3000));
		  mclaren.operateClutch(true);
		  mclaren.changeGear(3);
		  mclaren.operateClutch(false);
		  System.out.println(mclaren.wheelSpeed(6000));

	}
}
