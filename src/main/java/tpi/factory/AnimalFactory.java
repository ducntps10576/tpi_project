package tpi.factory;

import tpi.enums.AnimalEnum;
import tpi.process.TigerProcess;
import tpi.process.ZebraProcess;

public class AnimalFactory {

	public static void getAnimal(AnimalEnum animal) {

		switch (animal) {
		case TIGER_ANIMAL: {
			TigerProcess.process();
			break;
		}
		case ZEBRA_ANIMAL: {
			ZebraProcess.process();
			break;
		}
		default:
			throw new IllegalArgumentException("The Animal not support: " + animal);
		}
	}
}
