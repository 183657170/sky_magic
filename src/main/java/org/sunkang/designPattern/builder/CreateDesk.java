package org.sunkang.designPattern.builder;
/**
 * 创建桌子接口
 * @author sunkang
 *
 */
public interface CreateDesk {
	
	
	/**
	 * 创建桌面
	 */
	public void createDesktop();
	
	/**
	 * 创建脚
	 */
	public void createDeskLeg();
}
