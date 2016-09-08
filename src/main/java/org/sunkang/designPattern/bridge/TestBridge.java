package org.sunkang.designPattern.bridge;
/**
 * 桥接模式
 * 		将多角度的变化独立出来，减少他们之间的耦合，再通过组合（属性）的方式拼接在一起
 * 
 * 		多维度：手机品牌和安装的软件
 * @author sunkang
 *
 */
public class TestBridge {
	public static void main(String[] args) {
		
		App contacts=new Contacts();
		App game=new GameApp();
		
		Phone phone=new Iphone(contacts);
		phone.run();
		
		
		Phone phone2=new SamsungPhone(game);
		phone2.run();
		
	}
}
