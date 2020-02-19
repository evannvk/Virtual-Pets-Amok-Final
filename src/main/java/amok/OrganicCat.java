package amok;

import amok.Organic;

public class OrganicCat extends Organic {

	private int litter;

	public OrganicCat(String nameChoice, String descriptionChoice, String catOrDog, String roboticOrLiving) {
		super(nameChoice, descriptionChoice, catOrDog, roboticOrLiving);

		this.litter = 10;
	}

	
	public int getLitter() {

		return litter;
	}

	public void cleanBox(int amount) {
		int clean = 30;
		if (litter >= clean) {
			litter -= clean;
		} else {
			litter = 0;
		}
	}

}
