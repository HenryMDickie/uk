package uk.ac.cam.hmd34.SupervisionWork3.Cyberpet;

public class Cat extends Pet{
	public void playWith(){
		System.out.println("You attempt to play with your Cat, but it does nothing.");
		super.increase();
		}
	}