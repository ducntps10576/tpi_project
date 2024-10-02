package tpi.main;

import tpi.enums.AnimalEnum;
import tpi.factory.AnimalFactory;

public class Zoo {

	public static void main(String[] args) {
		AnimalFactory.getAnimal(AnimalEnum.TIGER_ANIMAL);
		AnimalFactory.getAnimal(AnimalEnum.ZEBRA_ANIMAL);
	}
}
