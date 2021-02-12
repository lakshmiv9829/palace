package com.xworkz.exceptionalevent;

import com.xworkz.exceptionalevent.Dto.PalaceDTO;
import com.xworkz.exceptionalevent.Dto.ZooDTO;

public class EventTester {

	public static void main(String[] args) throws Throwable{
		Object obj = new Object();
		System.out.println(obj.hashCode());
		ExceptionalEvent event = new ExceptionalEvent();
		event.frame5();
		event.createExceptionalEvent(false);
		//PalaceDTO dto= new PalaceDTO();
		//ZooDTO zooDTO=new ZooDTO(, false);
		
		
	}
}
