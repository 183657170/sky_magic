package org.sunkang.designPattern.chain;
/**
 * 具体处理1
 * @author sunkang
 *
 */
public class ConcreteHandler2 extends Handler{

	@Override
	public void handlerRequest(int request) {
		//如果满足条件则当前处理者处理
		if(request>=10&&request<=20){
			System.out.println("我是处理者2");
			
		}else{//交给下一处理者处理
			nextHandler.handlerRequest(request);
		}
		
	}

}
