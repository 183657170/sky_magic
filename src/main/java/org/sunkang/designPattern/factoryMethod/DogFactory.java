package org.sunkang.designPattern.factoryMethod;
/**
 * 创建狗的工厂
 * @author sunkang
 *
 */
public class DogFactory implements AnimalFactory{

	@Override
	public Animal createAnimal() {
		return new Dog();
	}

}
