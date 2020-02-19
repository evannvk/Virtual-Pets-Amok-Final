package amok;

public interface Walkable {
	
	boolean shouldBeAbleToWalk();
	
	int walkingReducesEnergy(int amount);
}
