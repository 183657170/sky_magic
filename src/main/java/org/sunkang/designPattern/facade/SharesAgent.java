package org.sunkang.designPattern.facade;
/**
 * 股票经纪人
 * @author sunkang
 *
 */
public class SharesAgent {
	private SharesA sharesA=new SharesA();
	
	private SharesB sharesB=new SharesB();
	
	private SharesC sharesC=new SharesC();
	
	/**
	 * 经纪人帮我操作股票
	 */
	public void methodA(){
		sharesA.buySharesA();
		sharesB.sellShBresB();
	}
	
	/**
	 * 经纪人帮我操作股票
	 */
	public void methodB(){
		sharesB.buyShBresB();
		sharesC.buySharesC();
	}
}
