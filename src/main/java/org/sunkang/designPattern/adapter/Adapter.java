package org.sunkang.designPattern.adapter;
/**
 * 适配器
 * 		有目标类的所有内容，也有被适配者的需要的方法
 * @author sunkang
 *
 */
public class Adapter extends Target{
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}
	
	public void testDaptee(){
		adaptee.testAdaptee();
	}
}
