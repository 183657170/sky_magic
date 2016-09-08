package org.sunkang.designPattern.factoryMethod;
/**
 * 创建猫的工厂
 * @author sunkang
 *
 */
public class CatFactory implements AnimalFactory{

	@Override
	public Animal createAnimal() {
		
		return new Cat();
	}
	
}
