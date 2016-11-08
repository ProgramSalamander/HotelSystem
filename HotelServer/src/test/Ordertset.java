package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import mock.MockOrder;
import objects.ResultMessage;
import service.blservice.Impl.OrderBLServiceImpl;

public class Ordertset {

	@Test
	public void testupdateActualLeaveTime(){
		MockOrder order1=new MockOrder(1);
		OrderBLServiceImpl OrderImpl=new OrderBLServiceImpl();
		ResultMessage result=OrderImpl.updateActualLeaveTime(order1.getorder_id(), "2016-12-1-12-00-00");
		
		assertEquals(ResultMessage.Success,result);
	}
	
}
