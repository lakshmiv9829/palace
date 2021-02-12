package com.xworkz.exceptionalevent.Dto;

public class PalaceDTO implements Cloneable {
	private String location;
	private String kingName;
	private String queenName;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getKingName() {
		return kingName;
	}

	public void setKingName(String kingName) {
		this.kingName = kingName;
	}

	public String getQueenName() {
		return queenName;
	}

	public void setQueenName(String queenName) {
		this.queenName = queenName;
	}

	@Override
	public int hashCode() {

		return 1;
	}

	@Override
	public String toString() {
		return "PalaceDTO [location=" + location + ", kingName=" + kingName + ", queenName=" + queenName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (this == obj) {
				return true;
			} else {
				if (obj instanceof PalaceDTO) {
					PalaceDTO palaceDTO = new PalaceDTO();
					if (palaceDTO.getLocation() == this.location)
						
					return true;
				}
				return false;
			}

		}
		return false;

	}

	@Override
	public PalaceDTO clone() throws CloneNotSupportedException {
		System.out.println("invoked clone");
		return (PalaceDTO)super.clone();
	}
	

}
