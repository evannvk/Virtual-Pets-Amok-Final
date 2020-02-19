package amok;

import amok.Organic;
import amok.VirtualPet;
import amok.Walkable;

public class OrganicDog extends Organic implements Walkable{


	private int waste;

	public OrganicDog(String nameChoice, String descriptionChoice, String catOrDog, VirtualPet roboticOrOrganic) {
		super(nameChoice, descriptionChoice, catOrDog, roboticOrOrganic);
		this.waste = 10;
	}

	public int getCageClenliness() {
		return waste;
	}
	
	public void cleanCage() {
		int clean = 20;
		if (waste >= clean) {
			waste -= clean;
		} else {
			waste = 0;
		}
	}

	@Override
	public boolean shouldBeAbleToWalk() {
		
		return true;
	}

	@Override
	public int walkingReducesEnergy(int amount) {
		
		return reduceEnergy();
	}

	
}
