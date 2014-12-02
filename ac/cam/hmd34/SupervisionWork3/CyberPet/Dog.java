package uk.ac.cam.hmd34.SupervisionWork3.CyberPet;

public class Dog extends uk.ac.cam.hmd34.SupervisionWork3.CyberPet.Pet {
	public void playWith(){
		System.out.println("You attempt to play with your Dog, but it humps your leg.");
		super.increase();
		}
	public Dog(){
		super("Dog");
		}
	}