package Axsos.java.caresoft;

import java.util.Random;

public class User {
	protected Integer id;
	protected int pin;
	
	User(){
		Random rand=new Random();
		this.id = rand.nextInt(100000)+9000;
		this.pin = rand.nextInt(8000)+1000;
		
		
	}
	User(Integer id){
		Random rand=new Random();
		this.id = id;
		this.pin = rand.nextInt(8000)+1000;
		
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}

}
