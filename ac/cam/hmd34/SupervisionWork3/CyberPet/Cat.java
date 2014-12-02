package uk.ac.cam.hmd34.SupervisionWork3.CyberPet;

public class Cat extends uk.ac.cam.hmd34.SupervisionWork3.CyberPet.Pet{
	public void playWith(){
		System.out.println("You attempt to play with your Cat, but it does nothing.");
		super.increase();
		}
	public Cat(){
		super("Cat");
		}
	}