package amok;

import amok.OrganicCat;
import amok.OrganicDog;
import amok.RoboticCat;
import amok.RoboticDog;

public class VirtualPet {
	private String petName;
	private String petDescription;
	private String petDNA;
	private String petRobotic;
	private int energy;
	private int health;

	public VirtualPet(String nameChoice, String descriptionChoice, String catOrDog, String petRobotic2) {

		this.petName = nameChoice;
		this.petDescription = descriptionChoice;
		this.petDNA = catOrDog;
		this.petRobotic = petRobotic2;
		this.energy = 15;
		this.health = 100;
	}

	public String getName() {
		return petName;
	}

	public String getDescription() {
		return petDescription;
	}

	public String getPetType() {
		return petDNA;
	}

	@SuppressWarnings("unused")
	public String getRobotOrOrganic() {
		Object Robotic = "robotic";
		Object Organic = "organic";
		if (petRobotic.equals(Robotic) && petDNA.contains("Cat")) {
			VirtualPet pet = new RoboticCat(petName, petDescription, petDNA, petRobotic);
		} else if (petRobotic.equals(Robotic) && petDNA.contains("Dog")) {
			VirtualPet pet = new RoboticDog(petName, petDescription, petDNA, petRobotic);
		} else if (petRobotic.equals(Organic) && petDNA.contains("Cat")) {
			VirtualPet pet = new OrganicCat(petName, petDescription, petDNA, petRobotic);
		} else if (petRobotic.equals(Organic) && petDNA.contains("Dog")) {
			VirtualPet pet = new OrganicDog(petName, petDescription, petDNA, petRobotic);
		}
		return petRobotic;
	}

	public int getEnergy() {
		return energy;
	}

	public int getHappiness() {
		return health;
	}

	public int reduceEnergy() {
		int activity = 10;
		if (energy >= activity) {
			energy -= activity;
		} else {
			energy = 0;
		}
		return energy;
	}

	public void increaseHappiness() {
		int heal = 10;
		heal += health;
	}

	public void tick() {
		energy++;
		health--;
	}

	Organic org = new Organic(petName, petDescription, petDNA, petRobotic);

	public String status() {
		return petName + " | " + petDescription +  " | Pet type: " + petDNA + " | Pet robotic or living: " + petRobotic + " | Hunger: " + org.getHunger() + " | Energy: " + energy + " | Thirst: " + org.getThirst() + " | Health: " + health;
	}
	
}
