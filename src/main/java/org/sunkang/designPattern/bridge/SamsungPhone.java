package org.sunkang.designPattern.bridge;

public class SamsungPhone implements Phone{
	
	private App app;
	
	

	public SamsungPhone(App app) {
		this.app = app;
	}



	@Override
	public void run() {
		app.run();
		
	}

}
