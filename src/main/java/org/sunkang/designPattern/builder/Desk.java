package org.sunkang.designPattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 桌子
 * @author sunkang
 *
 */
public class Desk {
	//桌子需要的零件
	private List<String> parts=new ArrayList<>();
	
	/**
	 * 添加零件
	 */
	public void AddPart(String part){
		parts.add(part);
	}
	
	/**
	 * 查看桌子
	 */
	public void showDesk(){
		for(String part:parts ){
			System.out.println(part);
		}
	}
}
