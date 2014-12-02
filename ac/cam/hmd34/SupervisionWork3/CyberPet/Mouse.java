package uk.ac.cam.hmd34.SupervisionWork3.CyberPet;

public class Mouse extends uk.ac.cam.hmd34.SupervisionWork3.CyberPet.Pet{
	public void playWith(){
		System.out.println("You attempt to play with your Mouse, but it scurries off towards cheese.");
		super.increase();
		}
	public Mouse(){
		super("Mouse");
		}
	}