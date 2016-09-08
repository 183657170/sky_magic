package org.sunkang.designPattern.factoryMethod;
/**
 * 动物工厂接口，工厂方法模式，是每种对象分别对应一种工厂
 * @author sunkang
 *
 */
public interface AnimalFactory {
	
	public Animal createAnimal();

}
