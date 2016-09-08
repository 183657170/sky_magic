package org.sunkang.designPattern.simpleFactory;
/**
 * 测试工厂类
 * 简单工厂模式：
 * 		多种对象实现 统一的接口
 * 		通过传入参数选择创建某种对象
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
