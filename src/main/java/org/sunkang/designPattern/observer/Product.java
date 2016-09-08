package org.sunkang.designPattern.observer;

import java.util.Observable;

/**
 * 商品
 * 		当商品的名字或者价格改变时，通知名字或者价格观察者，将该操作存入数据库
 * @author sunkang
 *
 */
public class Product extends Observable{
	
	private String name;
	
	private Double price;

	public void setName(String name) {
		this.name = name;
		setChanged();
		notifyObservers(name);
	}



	public void setPrice(Double price) {
		this.price = price;
		setChanged();
		notifyObservers(price);
	}
	
	
}
