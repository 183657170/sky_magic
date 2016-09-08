package org.sunkang.designPattern.adapter;
/**
 * 适配者模式
 * 		将不同的两个类（两个不同类的方法）适配到一起，增加代码的复用率
 * 		
 * @author sunkang
 *
 */
public class TestAdapter {
	public static void main(String[] args) {
		Adaptee adaptee=new Adaptee();
		
		Adapter adapter=new Adapter(adaptee);
		
		adapter.testDaptee();
		adapter.testTarget();
	}
}
