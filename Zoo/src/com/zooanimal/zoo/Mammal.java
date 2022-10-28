package com.zooanimal.zoo;

public class Mammal {
	protected int energylevel;
	
	Mammal(){
		this.energylevel=100;
		
	}
	
	
	public void displayEnergyLevel() {
		System.out.println("Energy level :"+energylevel);
		
	}
	

}
