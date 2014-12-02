package uk.ac.cam.hmd34.SupervisionWork3.Cyberpet;

public class Dog extends Pet{
	public void playWith(){
		System.out.println("You attempt to play with your Dog, but it humps your leg.");
		super.increase();
		}
	}