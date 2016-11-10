package mock;

import objects.Order;

public class MockOrder12 extends Order{
	boolean isexecute;
	
	public MockOrder12(boolean x){
		isexecute=x;;
	}
	
	public boolean getorder_execute(){
		return isexecute;
	}
}
