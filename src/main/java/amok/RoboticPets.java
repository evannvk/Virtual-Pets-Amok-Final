package amok;

import amok.VirtualPet;

public class RoboticPets extends VirtualPet {

	private int rust;

	public RoboticPets(String nameChoice, String descriptionChoice, String catOrDog, String roboticOrOrganic) {
		super(nameChoice, descriptionChoice, catOrDog, roboticOrOrganic);
		this.rust = 20;
	}

	public void oilPet() {
		int oil = 10;
		if (rust >= oil) {
			rust -= oil;
		} else {
			rust = 0;
		}
	}
	
	public void tick() {
		rust ++;
	}

}
