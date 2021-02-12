package com.xworkz.exceptionalevent;

import com.xworkz.exceptionalevent.Dto.PalaceDTO;
import com.xworkz.exceptionalevent.Dto.ZooDTO;

public class CloneTester {
	public static void main(String[] args) throws CloneNotSupportedException {
		PalaceDTO palaceDto = new PalaceDTO();
		palaceDto.setKingName("vadayar");
		palaceDto.setQueenName("rani");
		palaceDto.setLocation("Mysore");
		
		PalaceDTO copyPlaceDTO=  palaceDto.clone();
		System.out.println(copyPlaceDTO.getKingName()+" "+copyPlaceDTO.getQueenName()+" "+copyPlaceDTO.getLocation());
		ZooDTO zooDTO=new ZooDTO(1000, true);
		zooDTO.setName("Mysore");
		zooDTO.setNumOfAnimals(500);
		zooDTO.setOpen(true);
		System.out.println(zooDTO.getNumOfAnimals()+" "+ zooDTO.isOpen()+" "+zooDTO.getName()+" "+zooDTO.getNumOfAnimals());
		
	}
	
}
