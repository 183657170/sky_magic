package org.sunkang.designPattern.prototype;

import java.util.Date;

/**
 * 测试原型模式
 * 		原型模式在java里面就是clone
 * clone分为浅复制和深复制、
 * 		浅复制：复制的对象里面的属性，还是引用的原来的对象，不会新创建实体类里面的实体属性对象
 * 			下面测试结果：
 * 				Resume [name=孙康, age=20, workExper=文思海辉]
 *				Resume [name=孙康, age=20, workExper=文思海辉]
 * 		深复制：还会创建对象里面的实体属性对象，再引用，需要重写clone的方法
 * 			下面测试结果：
 * 				Resume [name=孙康, age=20, workExper=艾普工华]
 *				Resume [name=孙康, age=20, workExper=文思海辉]
 * @author sunkang
 *
 */
public class TestPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		WorkExper exper=new WorkExper("艾普工华", new Date());
		Resume resume=new Resume("孙康",20,exper);
		
		Resume resume2=(Resume) resume.clone();
		WorkExper exper2=resume2.getWorkExper();
		exper2.setWorkName("文思海辉");
		
		System.out.println(resume.toString());
		System.out.println(resume2.toString());
	}
}
