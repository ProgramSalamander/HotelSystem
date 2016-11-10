package mock;

import objects.Order;
import objects.OrderState;

public class MockOrder11 extends Order{
	OrderState orderstate;
	
	public MockOrder11(OrderState state){
		orderstate=state;
	}
	
	public OrderState getorder_state(){
		return orderstate;
	}
}
