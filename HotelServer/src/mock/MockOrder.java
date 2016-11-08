package mock;

import objects.Order;

public class MockOrder extends Order{
	int orderid;
	
	public MockOrder(int id){
		orderid=id;
	}
	
	public int getorder_id(){
		return orderid;
	}
}
