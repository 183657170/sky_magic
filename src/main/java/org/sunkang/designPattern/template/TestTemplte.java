package org.sunkang.designPattern.template;
/**
 * 测试模板模式
 * 
 * 	模板模式：
 * 		将不变的行为搬移到超类，也就是父类，在子类去实现这些变化的行为
 * 	优点
 * 		增加代码的复用率		
 * 
 * @author sunkang
 *
 */
public class TestTemplte {
	public static void main(String[] args) {
		//查看孙康的试卷
		TestPaper testPaper=new SunkangTestPaper();
		testPaper.show();
		System.out.println();
		System.out.println("*********************************************************");
		System.out.println();
		//查看小翔的试卷
		TestPaper testPaper2=new XiaoxiangTestPaper();
		testPaper2.show();
		
	}
}
