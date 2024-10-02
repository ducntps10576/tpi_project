package tpi.impl;

import tpi.iservice.TigerAnimalIService;

public class TigerAnimalImpl implements TigerAnimalIService {

	@Override
	public void eat() {
		System.out.println("Food of Tiger Animal");	
	}
}
