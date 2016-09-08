package org.sunkang.designPattern.builder;
/**
 * 组装桌子
 * 		指挥者类
 * @author sunkang
 *
 */
public class Assemble {
	/**
	 * 创建桌子
	 * @param createDesk
	 */
	public void CreateDesk(CreateDesk createDesk){
		createDesk.createDesktop();//组装桌面
		createDesk.createDeskLeg();//组装脚
	}
}
