package uk.ac.cam.hmd34.SupervisionWork3;

public class Singleton{
	private static int i = 0;
	private static Singleton ins;
	private Singleton(){
		i++;
		}
	public static get(){
		ins = new Singleton();
		return ins;
		}
	}