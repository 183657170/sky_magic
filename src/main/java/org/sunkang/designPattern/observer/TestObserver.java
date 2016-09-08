package org.sunkang.designPattern.observer;
/**
 * 观察者模式
 * 		多个观察者监听某个主题对象，当主题对象，发生改变时，通知观察者，更新自身
 * 		java里面已经写好观察的的接口
 * 		主题对象继承Observable类
 * 		观察者实现Observer接口
 * @author sunkang
 *
 */
public class TestObserver {
	public static void main(String[] args) {
		ProductObserver observer=new ProductObserver();
		Product product=new Product();
		product.addObserver(observer);
		
		//可以添加多个观察者，观察者得到的通知顺序为，先添加的，后通知
//		NameObserver nameObserver=new NameObserver();
//		product.addObserver(nameObserver);
		
		product.setName("苹果");
		product.setPrice(12.1);
	}
}
