package org.sunkang.designPattern.observer;

import java.util.Observable;
import java.util.Observer;
/**
 * 产品观察者
 * 		处理产品发出通知
 * @author sunkang
 *
 */
public class ProductObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof String){//如果是字符串，表示观察的名字
			System.out.println("name change :" +arg);
		}else if(arg instanceof Double){//如果是Double，表示观察的价格
			System.out.println("price change :"+arg);
		}
		
	}

}
