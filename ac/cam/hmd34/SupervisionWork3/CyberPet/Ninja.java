package uk.ac.cam.hmd34.SupervisionWork3.CyberPet;

public class Ninja extends uk.ac.cam.hmd34.SupervisionWork3.CyberPet.Pet {
	public void playWith(){
		System.out.println("You attempt to play with your Ninja, but it dissapears in a puff of smoke.");
		super.increase();
		}
	public Ninja(){
		super("Ninja");
		}
	}