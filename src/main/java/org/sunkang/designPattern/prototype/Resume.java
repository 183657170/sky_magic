package org.sunkang.designPattern.prototype;
/**
 * 个人简介
 * 		名字，年龄，工作经验等
 * @author sunkang
 *
 */
public class Resume implements Cloneable{
	private String name;
	
	private int age;
	
	private WorkExper workExper;
	
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//用原始的克隆方法表示用的浅复制
		//		return super.clone();
		
		//下面重新写的是为了实现深复制
		WorkExper newExper= (WorkExper) workExper.clone();
		Object obj=new Resume(name, age, newExper);
		return obj;
	}
	
	

	@Override
	public String toString() {
		return "Resume [name=" + name + ", age=" + age + ", workExper="
				+ workExper.getWorkName() + "]";
	}



	public Resume(String name, int age, WorkExper workExper) {
		this.name = name;
		this.age = age;
		this.workExper = workExper;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public WorkExper getWorkExper() {
		return workExper;
	}

	public void setWorkExper(WorkExper workExper) {
		this.workExper = workExper;
	}
	
	
	
}
