package com.jpm.section07.composition.challenge.gamingcomputer;

public class MainComputer
{
	public static void main(String[] args)
	{
		Motherboard mb = new Motherboard("Z390", "MSI");
		Processor processor = new Processor("Intel", 3.4, 4.4, "Core i7 9900k");
		Ram ram = new Ram(32);
		PowerSupply ps = new PowerSupply(850, "Corsair", "80+ Gold");
		Tower t = new Tower("Mid ATX", "Corsair", "Carbide 200R");
		VideoCard vc = new VideoCard("Nvidia", "MSI", "2080");
				
		Storage[] stge = new Storage[2];
		stge[0] = new Storage(512, "m.2", "Samsung");
		stge[1] = new Storage(512, "SSD", "Samsung");
		
		Computer computer = new Computer(ps, stge, mb, ram, t, vc, processor);
		
		System.out.println("Motherboard: " + computer.getMotherboard().getManufacturer() + " " + computer.getMotherboard().getModel());
		System.out.println("Processor: " + computer.getProcessor().getChipset() + " " + computer.getProcessor().getModel());
		System.out.println("Ram: " + computer.getRam().getCapacity() + "GB");
		System.out.println("Power Supply: " + computer.getPowerSupply().getManufacturer() + " " + computer.getPowerSupply().getWattage() + "W " + computer.getPowerSupply().getRating());
		System.out.println("Video card: " + computer.getVideoCard().getManufacturer() + " " + computer.getVideoCard().getChipset() + " " + computer.getVideoCard().getModel());
		Storage[] s1 = computer.getStorage();
		
		for(Storage s : s1)
		{
			System.out.println("Storage: " + s.getCapacity() + " " + s.getManufacturer() + " " + s.getType());
		}
		System.out.println("Case: " + computer.getTower().getManufacturer() + " " + computer.getTower().getModel() + " " + computer.getTower().getSize());
	}
}
