package org.sunkang.designPattern.simpleFactory;
/**
 * 测试工厂类
 * @author sunkang
 *
 */
public class TestFactory {
	public static void main(String[] args) throws Exception {
		Animal animal=AnimalFactory.getAnimal("cat");
		animal.call();
		
		Animal animal2=AnimalFactory.getAnimal("dog");
		animal2.call();
		
		Animal animal3=AnimalFactory.getAnimal("chicken");
		animal3.call();
		
	}
}
