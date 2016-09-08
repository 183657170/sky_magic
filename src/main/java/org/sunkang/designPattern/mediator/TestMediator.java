package org.sunkang.designPattern.mediator;
/**
 * 中介者模式
 * 		用中介对象来完成一系列对象直接的交互
 * 		一系列对象先找中介者，中介者负责把请求转发给接受的对象
 * 通过中介者里面组合请求者对象，请求者里面组合中介者对象
 * 
 * 使用终结者模式的场合
 *
 *		1.一组定义良好的对象，现在要进行复杂的通信。
 *		
 *		2.定制一个分布在多个类中的行为，而又不想生成太多的子类。
 *		
 *		可以看出，中介对象主要是用来封装行为的，行为的参与者就是那些对象，但是通过中介者，这些对象不用相互知道。呵呵~~~
 *		
 *		使用中介者模式的优点：
 *		
 *		1.降低了系统对象之间的耦合性，使得对象易于独立的被复用。
 *		
 *		2.提高系统的灵活性，使得系统易于扩展和维护。
 *
 *	使用中介者模式的缺点：
 *
 *		中介者模式的缺点是显而易见的，因为这个“中介“承担了较多的责任，所以一旦这个中介对象出现了问题，那么整个系统就会受到重大的影响。
 * @author sunkang
 *
 */
public class TestMediator {
	public static void main(String[] args) {
		//中介者
		ConcreteMediator  mediator=new ConcreteMediator();
		
		//初始化同事认识的中介者
		ConcteteColleage1 colleage1=new ConcteteColleage1(mediator);
		ConcteteColleage2 colleage2=new ConcteteColleage2(mediator);
		
		//告诉中介者有哪些同事
		mediator.setColleage1(colleage1);
		mediator.setColleage2(colleage2);
		
		colleage1.send("吃饭了吗？");
		colleage2.send("没吃");
	}
}
