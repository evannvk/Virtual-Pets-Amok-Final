package amok;

import amok.RoboticPets;
import amok.Walkable;

public class RoboticDog extends RoboticPets implements Walkable {

	public RoboticDog(String nameChoice, String descriptionChoice, String catOrDog, String roboticOrOrganic) {
		super(nameChoice, descriptionChoice, catOrDog, roboticOrOrganic);
		
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