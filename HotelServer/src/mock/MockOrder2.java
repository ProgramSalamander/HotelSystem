package mock;

import objects.OrderState;

public class MockOrder2 {
	OrderState orderstate;
	
	public MockOrder2(OrderState state){
		orderstate=state;
	}
	
	public OrderState getorder_state(){
		return orderstate;
	}
}
