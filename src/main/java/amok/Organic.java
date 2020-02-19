package amok;

import amok.VirtualPet;

public class Organic extends VirtualPet {

	private int hunger;
	private int thirst;

	public Organic(String nameChoice, String descriptionChoice, String catOrDog, String roboticOrOrganic) {
		super(nameChoice, descriptionChoice, catOrDog, roboticOrOrganic);
		this.hunger = 25;
		this.thirst = 20;
	}
	
	public int getHunger() {
		return hunger;
	}
	
	public int getThirst() {
		return thirst;
	}
	
	public void reduceHunger() {
		int food = 7;
		if (hunger >= food ) {
			hunger -= food;
		} else {
			hunger = 0;
		}
	}

	public void reduceThirst() {
		int water = 12;
		if (thirst >= water ) {
			thirst -= water;
		} else {
			thirst = 0;
		}
	}
	
	
	public void tick() {
		hunger ++;
		thirst ++;
	}

}
