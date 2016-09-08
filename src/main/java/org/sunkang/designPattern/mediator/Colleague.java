package org.sunkang.designPattern.mediator;
/**
 * 同事的抽象类
 * @author sunkang
 *
 */
public abstract class Colleague {
	
	/**
	 * 中介者，每个同事都是通过中介者与例外的同事发消息
	 */
	public Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	
}
