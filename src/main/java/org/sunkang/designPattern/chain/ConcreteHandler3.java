package org.sunkang.designPattern.chain;
/**
 * 具体处理1
 * @author sunkang
 *
 */
public class ConcreteHandler3 extends Handler{

	@Override
	public void handlerRequest(int request) {
		//如果满足条件则当前处理者处理
		if(request>=20&&request<=30){
			System.out.println("我是处理者3");
			
		}else{//交给下一处理者处理
			nextHandler.handlerRequest(request);
		}
		
	}

}
