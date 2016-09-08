package org.sunkang.designPattern.chain;
/**
 * 职责链模式
 * 		将多个处理者对象以链的形式链接，当有请求来时，通过该链一次往下面传递，直到找到真正的处理者
 * 
 * 		
 * @author sunkang
 *
 */
public class TestChain {
	public static void main(String[] args) {
		
		//设置职责链顺序
		ConcreteHandler1 concreteHandler1=new ConcreteHandler1();
		ConcreteHandler2 concreteHandler2=new ConcreteHandler2();
		ConcreteHandler3 concreteHandler3=new ConcreteHandler3();
		concreteHandler1.setNextHandler(concreteHandler2);
		concreteHandler2.setNextHandler(concreteHandler3);
		
		
		int[] arr={10,2,22,6,16};
		for(int i:arr){
			concreteHandler1.handlerRequest(i);
		}
	}
}
