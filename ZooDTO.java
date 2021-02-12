package com.xworkz.exceptionalevent.Dto;

public class ZooDTO implements Cloneable{
	private String name;
	private int numOfAnimals;
	private boolean open;
	private double entryFee;
	private boolean safari;
	public ZooDTO(double entryFee,boolean safari) {
		this.entryFee=entryFee;
		this.safari=safari;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumOfAnimals() {
		return numOfAnimals;
	}
	public void setNumOfAnimals(int numOfAnimals) {
		this.numOfAnimals = numOfAnimals;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public double getentryFee() {
		return entryFee;
	}
	public boolean isSafari() {
		return safari;
	}
	@Override
	public int hashCode() {
		return 11;
	}
	
	@Override
	public String toString() {
		return "ZooDTO [name=" + name + ", numOfAnimals=" + numOfAnimals + ", open=" + open + ", entryFee=" + entryFee
				+ ", safari=" + safari + "]";
	}
	@Override
	public ZooDTO clone() throws CloneNotSupportedException {
		System.out.println("invoked clone");
		return (ZooDTO)super.clone();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(this==obj) {
				return true;
				
			} 
			else {
				if(obj instanceof ZooDTO) {
					ZooDTO zooDTO =(ZooDTO)obj;
					if(zooDTO.getName()==this.name) {
						return true;
					}
				}
			}
			return false;
		}
		return false;
	}
	
	
	

}
