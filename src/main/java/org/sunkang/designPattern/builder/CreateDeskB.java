package org.sunkang.designPattern.builder;
/**
 * 创建桌子A
 * 		相当于分解每一步
 * @author sunkang
 *
 */
public class CreateDeskB  implements CreateDesk{
	
	private Desk desk=new Desk();
	
	/**
	 * 创建桌面
	 */
	public void createDesktop(){
		desk.AddPart("一个黑色的桌面");
	}
	
	/**
	 * 创建脚
	 */
	public void createDeskLeg(){
		desk.AddPart("四个黑色的脚");
	}
}
