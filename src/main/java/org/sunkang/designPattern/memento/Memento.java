package org.sunkang.designPattern.memento;
/**
 * 备忘录类
 * @author sunkang
 *
 */
public class Memento {
	private int level;
	
	

	public Memento(int level) {
		super();
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
