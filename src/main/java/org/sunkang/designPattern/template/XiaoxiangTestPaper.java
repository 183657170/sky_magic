package org.sunkang.designPattern.template;
/**
 * 小翔的试卷
 * @author sunkang
 *
 */
public class XiaoxiangTestPaper extends TestPaper{

	@Override
	public String getName() {
		return "小翔";
	}

	@Override
	public String twoAnwer() {
		return "B";
	}

	@Override
	public String oneAnswer() {
		return "A";
	}
	
}
