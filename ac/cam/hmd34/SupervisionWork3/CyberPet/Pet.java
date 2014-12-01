package uk.ac.cam.hmd34.SupervisionWork3.CyberPet;

public class Pet {
	private String name;
	private int age;
	private Owner owner;
	private int hunger_level;
	private int tired_level;
	public Owner getOwner(){
		return this.owner;
		}
	public void update(){
		this.hunger_level++;
		this.tired_level++;
		this.age++;
		}
	public void fed(){
		this.hunger_level = 0;
		}
	public void slept(){
		this.tired_level = 0;
		}
	public abstract void playWith();
	}
