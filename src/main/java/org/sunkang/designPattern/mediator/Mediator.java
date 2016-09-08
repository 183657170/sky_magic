package org.sunkang.designPattern.mediator;
/**
 * 中介者的接口，负责发送消息
 * @author sunkang
 *
 */
public interface Mediator {
	/**
	 * 发送消息
	 * @param message
	 * @param colleague 发给谁？
	 */
	public void send(String message ,Colleague colleague);
}
