package org.sunkang.designPattern.chain;
/**
 * 处理的抽象类
 * @author sunkang
 *
 */
public abstract class Handler {
	
	/**
	 * 下一个请求
	 */
	public Handler nextHandler;

	/**
	 * 设置下一个请求
	 * @param nextHandler
	 */
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public abstract void handlerRequest(int request);
}
