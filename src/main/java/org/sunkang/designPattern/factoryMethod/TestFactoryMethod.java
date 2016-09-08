package org.sunkang.designPattern.factoryMethod;
/**
 * 工厂方法模式：
 * 		每种类型的对象对应一个自己的工厂类，但是都对应一个统一的接口
 * 		要增加对象类型，通过增加工厂类的方式进行
 * 		满足开放-闭合原则
 * 		将简单工厂类的判断创建那种对象的逻辑交给客户端来实现，即交给TestFactoryMethod来实现
 * @author sunkang
 *
 */
public class TestFactoryMethod {
	public static void main(String[] args) {
		AnimalFactory factory=new CatFactory();
		Animal animal=factory.createAnimal();
		animal.cry();
	}
}
