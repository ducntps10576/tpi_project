package tpi.impl;

import tpi.iservice.ZebraAnimalIService;

public class ZebraAnimalImpl implements ZebraAnimalIService {

	@Override
	public void eat() {
		System.out.println("Food of Zebra Animal");
	}
}
