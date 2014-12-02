package uk.ac.cam.hmd34.SupervisionWork3.CyberPet;

public class Pet {
	private String name;
	private int age;
	private int hunger_level;
	private int tired_level;
	public void update(){
		this.hunger_level++;
		this.tired_level++;
		this.age++;
		System.out.println("Hunger: " + hunger_level + "/nTiring: " + tired_level);
		}
	public void increase(){
		hunger_level += 19;
		tired_level += 19;
		}
	public void fed(){
		this.hunger_level = 0;
		System.out.println("You feed your " + name + ".");
		}
	public void slept(){
		this.tired_level = 0;
		System.out.println("You put your " + name + " to sleep.");
		}
	public void playWith(){};
	public Pet(){
		name = "Pet";
		}
	}
