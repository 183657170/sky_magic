package org.sunkang.designPattern.singleton;
/**
 * 该类为单例模式
 * @author sunkang
 *
 */
public class Singleton {
	private static Singleton singleton;

	private Singleton() {
		super();
	}
	
	public  static Singleton getSingleton(){
		
		//先判断对象存不存在，不存在的时候再锁（双重锁定）
		if(singleton ==null){
			
			//对该代码块加锁，防止多线程情况下，出现多个实例
			synchronized(Singleton.class){
				if(singleton ==null){
					singleton=new Singleton();
				}
			}
			
		}
			
		return singleton;
	}
}
