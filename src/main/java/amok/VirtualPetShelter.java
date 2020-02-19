package amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> allPets = new HashMap<String, VirtualPet>();

	public void addPet(VirtualPet pet) {
		allPets.put(pet.getName(), pet);
	}

	public VirtualPet findPet(String petName) {
		return this.allPets.get(petName);
	}

	public Collection<VirtualPet> allPets() {

		return this.allPets.values();
	}


	public void adoptPetOut(String petName) {
		this.allPets.remove(petName);
	}

	public void tickAll() {
		for (VirtualPet petToTick : allPets.values()) {
			petToTick.tick();
		}
	}

	public void reduceHungerOrganic() {
		for (Map.Entry<String, VirtualPet> entry : allPets.entrySet()) {
			VirtualPet pet = entry.getValue();
			if (pet instanceof Organic) {
				((Organic) pet).reduceThirst();
			}
		}
	}

	public void reduceThirstOrganic() {
		for (Map.Entry<String, VirtualPet> entry : allPets.entrySet()) {
			VirtualPet pet = entry.getValue();
			if (pet instanceof Organic) {
				((Organic) pet).reduceThirst();
			}
		}
	}

	public void reduceEnergyAll() {
		for (Map.Entry<String, VirtualPet> playWithPet : allPets.entrySet()) {

			playWithPet.getValue().reduceEnergy();
		}
	}

	public void oilRoboticPets() {
		for (Map.Entry<String, VirtualPet> entry : allPets.entrySet()) {
			VirtualPet pet = entry.getValue();
			if (pet instanceof RoboticPets) {
				((RoboticPets) pet).oilPet();
			}
		}
	}

	public String givePetStatuses() {
		String petStatuses = "";
		if (allPets.values().size() == 0) {
			petStatuses = "The shelter is empty.";
		}
		for (VirtualPet pet : allPets.values()) {
			petStatuses += pet.status() + "\n";
		}
		return petStatuses;
	}

}
