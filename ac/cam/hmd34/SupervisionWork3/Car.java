package uk.ac.cam.hmd34.SupervisionWork3;

public class Car implements Comparable<Car> {
	private String manufacturer;
	private int age;
	public String getManufacturer {
		return this.manufacturer;
		}
	public int getAge {
		return this.age;
		}
	public int compareTo(Car c) {
		return this.age.compareTo(c.getAge());
		}	
	}
