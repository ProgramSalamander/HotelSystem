package mock;

import objects.Order;

public class MockOrder10 extends Order{
	int order_id;
	
	public MockOrder10(int id){
		order_id=id;
	}
	
	public int getorder_id(){
		return order_id;
	}
}
