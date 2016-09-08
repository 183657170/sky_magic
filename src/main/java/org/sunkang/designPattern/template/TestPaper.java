package org.sunkang.designPattern.template;
/**
 * 试卷，模板
 * @author sunkang
 *
 */
public abstract class TestPaper {
	
	/**
	 * 姓名
	 */
	public void name(){
		System.out.println("姓名："+getName());
	}
	
	/**
	 * 第一题
	 */
	public void one(){
		System.out.println("1.下面那个选项是正确的（"+oneAnswer()+"）");
		System.out.println("A.我是正确的		B.我是错误的");
	}
	/**
	 * 第二题
	 */
	public void two(){
		System.out.println("2.下面那个答案是错误的（"+twoAnwer()+"）");
		System.out.println("A.我是正确的		B.我是错误的");
	}
	
	
	public abstract String getName();
	
	/**
	 * 第二题答案
	 * @return
	 */
	public abstract String twoAnwer();
	
	
	/**
	 * 第一题答案
	 * @return
	 */
	public abstract String oneAnswer();
	
	/**
	 * 查看试卷
	 */
	public void show(){
		name();
		one();
		two();
	}
}
