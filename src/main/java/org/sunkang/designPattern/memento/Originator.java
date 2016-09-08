package org.sunkang.designPattern.memento;
/**
 * 发起者
 * 		发起备份和还原备份
 * @author sunkang
 *
 */
public class Originator {
	//等级
	private int level=0;
	
	/**
	 * 创建备份，备份到memento中
	 */
	public Memento createMemento(){
		return new Memento(level);
	}
	
	/**
	 * 还原备份
	 */
	public void setMemento(Memento memento){
		this.level=memento.getLevel();
	}
	
	/**
	 * 显示等级
	 */
	public void show(){
		System.out.println("当前等级："+level);
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
