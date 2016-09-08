package org.sunkang.designPattern.prototype;

import java.util.Date;

/**
 * 工作经历
 * @author sunkang
 *
 */
public class WorkExper implements Cloneable{
	private String workName;
	
	private Date workDate;

	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public WorkExper(String workName, Date workDate) {
		super();
		this.workName = workName;
		this.workDate = workDate;
	}

	public String getWorkName() {
		return workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
	}

	public Date getWorkDate() {
		return workDate;
	}

	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}
	
	
}
