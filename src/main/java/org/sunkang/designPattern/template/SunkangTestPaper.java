package org.sunkang.designPattern.template;
/**
 * 孙康的试卷
 * @author sunkang
 *
 */
public class SunkangTestPaper extends TestPaper{

	
	
	@Override
	public String getName() {
		return "孙康";
	}

	@Override
	public String twoAnwer() {
		return "A";
	}

	@Override
	public String oneAnswer() {
		return "B";
	}
	
}
