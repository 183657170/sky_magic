package org.sunkang.designPattern.strategy;
/**
 *打八折
 * @author sunkang
 *
 */
public class Fracture8Algorithm implements Checkout{

	@Override
	public int checkout(int money) {
		System.out.println("打八折");
		return money*8/10;
	}

}
