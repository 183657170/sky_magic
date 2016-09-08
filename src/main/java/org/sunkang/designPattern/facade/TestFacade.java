package org.sunkang.designPattern.facade;
/**
 * 外观模式
 * 		为一组接口提供一个一致的界面
 * 		至于一致的界面里面做了什么并不关心，只关心他的外观
 * 		封装一些复杂的操作，给外界一个简单统一的接口
 * 		
 * 分层就用到了外观模式
 * 			
 * @author sunkang
 *
 */
public class TestFacade {
	public static void main(String[] args) {
		//股票经纪人统一的帮我买卖股票
		SharesAgent agent=new SharesAgent();
		agent.methodA();
		
	}
}
