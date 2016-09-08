package org.sunkang.designPattern.builder;

import java.util.Observable;
import java.util.Observer;

/**
 * 创建者模式
 * 		将一个复杂对象的构建和表示分离，是同样的构建可以创建不同的表示
 * 		构建某个对象的顺序是稳定的。但是对象内部的构建面临着复杂变化
 * 		如:创建一个桌子的顺序是稳定的，但是构建桌板是变化的
 * 			如需要改变内部的的结构，只需要重新添加一个建造者类
 * 
 *即流程不变，但每个流程实现的具体细节则是经常变化的。建造者模式的好处就是保证了流程不会变化，流程即不会增加、也不会遗漏或者产生流程次序错误
 * 			
 * @author sunkang
 *
 */
public class TestBuilder {
	public static void main(String[] args) {
		Desk desk=new Desk();
		CreateDesk createDesk=new CreateDeskA(desk);
		Assemble assemble=new Assemble();
		assemble.CreateDesk(createDesk);
		desk.showDesk();
		
	}
}
