package org.sunkang.designPattern.strategy;
/**
 * 采用策略的方式结算
 *
 * 定义一系列的算法的方法，这些方法所完成的工作是相同的，策略模式就是以相同的方法调用所有的算法，
 * 减少各个算法之间的耦合，修改其中一个算法，不影响其他算法，还便于单元测试
 * 传入那种算法对象，就是调用了那种算法
 * 
 * "策略模式"定义一系列的算法,将一个算法封装起来,并让它们可以相互替换.也是应用了组合的方式,根据不同的需要进行组合. 
 * @author sunkang
 *
 */
public class CheckoutStrategy {
	
	private Checkout checkout;

	public CheckoutStrategy(Checkout checkout) {
		this.checkout = checkout;
	}
	/**
	 * 结算
	 * @return
	 */
	public int checkout(int money){
		return checkout.checkout(money);
	}
}
