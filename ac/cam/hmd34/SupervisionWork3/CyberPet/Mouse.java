package uk.ac.cam.hmd34.SupervisionWork3.Cyberpet;

public class Mouse extends Pet{
	public void playWith(){
		System.out.println("You attempt to play with your mouse, but it scurries off towards cheese.");
		super.increase();
		}
	}