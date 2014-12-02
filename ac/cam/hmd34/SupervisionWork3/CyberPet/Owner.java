package uk.ac.cam.hmd34.SupervisionWork3.CyberPet;

public class Owner{
	private String name;
	private int age;
	private Pet pet;
	public void feedPet(){
		this.pet.fed();
		}
	public void putPetToSleep(){
		this.pet.slept();
		}
	public void update(){
		this.pet.update();
		}
	public Pet getPet(){
		return this.pet;
		}
	public void playWithPet(){
		this.pet.playWith();
		}
	public Owner(){
		name = "Henry";
		age = 0;
		pet = new Pet();
		//switch (i){
			//case 1:	pet = new Cat();
				//	break;
//			case 2: pet = new Dog();
//					break;
//			case 3: pet = new Mouse();
//					break;
//			case 4: pet = new Ninja();
	//				break;
			//}
			
		}
	}