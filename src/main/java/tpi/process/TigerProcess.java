package tpi.process;

import tpi.impl.TigerAnimalImpl;
import tpi.iservice.TigerAnimalIService;

public class TigerProcess {

	private static TigerAnimalIService service = new TigerAnimalImpl();
	
	public static void process() {
		service.eat();
	}
}
