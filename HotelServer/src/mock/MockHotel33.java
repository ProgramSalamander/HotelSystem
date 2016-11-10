package mock;

import objects.Hotel;

public class MockHotel33 extends Hotel {
	int lowprice;
	int highprice;
	public MockHotel33(int lowprice, int highprice) {
		this.lowprice = lowprice;
		this.highprice = highprice;
	}

	public int getLowprice(){
		return lowprice;
	}
	
	public int getHighprice(){
		return highprice;
	}
	
}
