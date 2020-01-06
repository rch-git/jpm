package com.jpm.composition.challenge.gamingcomputer;

public class Computer
{
	private PowerSupply powerSupply;
	private Storage[] storage;
	private Motherboard motherboard;
	private Ram ram;
	private Tower tower;
	private VideoCard videoCard;
	private Processor processor;
	
	public Computer(PowerSupply powerSupply, Storage[] storage, Motherboard motherboard, Ram ram, Tower tower, VideoCard vc, Processor processor)
	{
		this.powerSupply = powerSupply;
		this.storage = storage;
		this.motherboard = motherboard;
		this.ram = ram;
		this.tower = tower;
		this.videoCard = vc;
		this.processor = processor;
	}

	public PowerSupply getPowerSupply()
	{
		return powerSupply;
	}

	public Storage[] getStorage()
	{
		return storage;
	}

	public Motherboard getMotherboard()
	{
		return motherboard;
	}

	public Ram getRam()
	{
		return ram;
	}

	public Tower getTower()
	{
		return tower;
	}

	public VideoCard getVideoCard()
	{
		return videoCard;
	}

	public Processor getProcessor()
	{
		return processor;
	}
	
	
}
