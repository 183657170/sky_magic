package org.sunkang.designPattern.builder;
/**
 * 创建桌子A
 * 		相当于分解每一步
 * @author sunkang
 *
 */
public class CreateDeskA implements CreateDesk{
	
	private Desk desk;
	
	
	
	public CreateDeskA(Desk desk) {
		this.desk = desk;
	}

	/**
	 * 创建桌面
	 */
	public void createDesktop(){
		desk.AddPart("一个白色的桌面");
	}
	
	/**
	 * 创建脚
	 */
	public void createDeskLeg(){
		desk.AddPart("四个白色的脚");
	}
}
