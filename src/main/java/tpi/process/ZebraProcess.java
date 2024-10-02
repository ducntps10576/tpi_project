package tpi.process;

import tpi.impl.ZebraAnimalImpl;
import tpi.iservice.ZebraAnimalIService;

public class ZebraProcess {

	private static ZebraAnimalIService service = new ZebraAnimalImpl();
	
	public static void process() {
		service.eat();
	}
}
