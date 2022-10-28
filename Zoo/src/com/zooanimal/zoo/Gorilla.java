package com.zooanimal.zoo;

public class Gorilla extends Mammal {
	public Gorilla() {
		super();
		
	}
	
	public void displayEnergy() {
		System.out.println("Gorilla ");
		 super.displayEnergyLevel();
		
		
	}
	public void climb( int times) {
		for(int i =0;i<times;i++) {
			this.energylevel-=10;
			System.out.println(" the Gorilla climb so energy deceased by 10 ");
		}
		
		
	}
	public void throwThings( int times) {
		for(int i =0;i<times;i++) {
			this.energylevel-=5;
			System.out.println(" the Gorilla climb so energy deceased by 5 ");
		}
		
	}
	public void eatBanana( int times) {
		for(int i =0;i<times;i++) {
			this.energylevel+=5;
			System.out.println(" the Gorilla climb so energy inceasing by 10  ");
		}
		
	
	}
	

	

}
