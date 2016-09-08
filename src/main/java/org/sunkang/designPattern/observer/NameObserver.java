package org.sunkang.designPattern.observer;

import java.util.Observable;
import java.util.Observer;

public class NameObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof String){//如果是字符串，表示观察的名字
			System.out.println("name change :" +arg);
		}
		
	}

}
