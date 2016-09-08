package org.sunkang.designPattern.singleton;
/**
 * 单例模式
 * 		类的对象只有一个
 * 			私有化构造器
 * 			通过静态方法获得对象
 * @author sunkang
 *
 */
public class TestSingleton {
	public static  Singleton singleton2=null;
	
	public static void main(String[] args) throws InterruptedException {
		Singleton singleton=Singleton.getSingleton();
		System.out.println(singleton.hashCode());
		
		singleton2=Singleton.getSingleton();
		System.out.println(singleton2.hashCode());
		
		for(int i=0;i<10000;i++){
			Thread thread=new Thread(new Runnable() {
				
				@Override
				public void run() {
					Singleton singleton3=Singleton.getSingleton();
					if(singleton2.hashCode()!=singleton3.hashCode()){
						System.out.println(singleton3.hashCode());
					}
					
				}
			});
			thread.run();
		}
	}
}
