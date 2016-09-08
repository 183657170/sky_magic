package org.sunkang.designPattern.mediator;
/**
 * 具体的中介者
 * @author sunkang
 *
 */
public class ConcreteMediator implements Mediator{
	
	//中介知道的两个同事
	
	private ConcteteColleage1 colleage1;
	
	private ConcteteColleage2 colleage2;
	
	




	@Override
	public void send(String message, Colleague colleague) {
		//如果是同事一发送的请求，则通知同事2
		if(colleague instanceof ConcteteColleage1){
			colleage2.notify(message);
		}else{
			colleage1.notify(message);
		}
		
	}
	

	public void setColleage1(ConcteteColleage1 colleage1) {
		this.colleage1 = colleage1;
	}



	public void setColleage2(ConcteteColleage2 colleage2) {
		this.colleage2 = colleage2;
	}
}
