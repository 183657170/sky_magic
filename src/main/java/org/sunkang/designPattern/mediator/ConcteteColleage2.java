package org.sunkang.designPattern.mediator;
/**
 * 具体的同事1
 * @author sunkang
 *
 */
public class ConcteteColleage2 extends Colleague{

	public ConcteteColleage2(Mediator mediator) {
		super(mediator);
	}
	
	/**
	 * 发送消息
	 * @param message
	 */
	public void send(String message){
		mediator.send(message, this);
	}
	
	public void notify(String message){
		System.out.println("同事2的到消息："+message);
	}
	
}
