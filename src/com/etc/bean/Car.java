package com.etc.bean;

public class Car {
	private int spead;

	public Car(){
		
	}
	public Car(int spead) {
		super();
		this.spead = spead;
	}

	public int getSpead() {
		return spead;
	}

	public void setSpead(int spead) {
		this.spead = spead;
	}

	@Override
	public String toString() {
		return "Car [spead=" + spead + "]";
	}
	
	
}
