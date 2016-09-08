package org.sunkang.designPattern.bridge;

public class Iphone implements Phone{

	private App app;
	
	
	
	public Iphone(App app) {
		this.app = app;
	}



	@Override
	public void run() {
		app.run();
		
	}

}
