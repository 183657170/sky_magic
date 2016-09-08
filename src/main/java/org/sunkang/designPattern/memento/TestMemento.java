package org.sunkang.designPattern.memento;
/**
 * 备忘录模式
 * 		捕获当前对象的某些状态，并且将这些状态备份在例外的对象里面
 * 		这样在还原的时候将备份对象的对象的状态还原到当前对象
 * 
 * 		实际上就是现将现在的状态保存一份，用于以后的还原
 * @author sunkang
 *
 */
public class TestMemento {
	public static void main(String[] args) {
		Originator originator=new Originator();
		originator.setLevel(100);
		
		//备份等级
		Memento memento=originator.createMemento();
		originator.show();
		
		originator.setLevel(120);
		originator.show();
		
		//还原备份
		originator.setMemento(memento);
		originator.show();
	}
}
