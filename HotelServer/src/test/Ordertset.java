package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import mock.MockClient1;
import mock.MockHotel1;
import mock.MockOrder1;
import mock.MockOrder2;
import mock.MockOrder3;
import mock.MockRoom1;
import objects.HotelStrategy;
import objects.OrderState;
import objects.ResultMessage;
import objects.RoomType;
import objects.WebStrategy;
import service.blservice.Impl.OrderBLServiceImpl;
import vo.OrderVO;

public class Ordertset {

	@Test
	public void testorder_client_browse1(){
		MockClient1 client1=new MockClient1(1);
		OrderBLServiceImpl OrderImpl=new OrderBLServiceImpl();
		ArrayList<OrderVO> orderlist=OrderImpl.order_client_browse(client1.getclient_id());
		ArrayList<OrderVO> expect_orderlist=new ArrayList<OrderVO>();
		OrderVO expect_order1=new OrderVO(0, null, false, null, null, null, null, null, 0, null, 0, 0);
		expect_orderlist.add(expect_order1);
		
		assertEquals(expect_orderlist,orderlist);
	}

	@Test
	public void testorder_client_browse2(){
		MockClient1 client1=new MockClient1(1);
		MockOrder2 order1=new MockOrder2(OrderState.NORMAL);
		OrderBLServiceImpl OrderImpl=new OrderBLServiceImpl();
		ArrayList<OrderVO> orderlist=OrderImpl.order_client_browse(client1.getclient_id(),order1.getorder_state());
		ArrayList<OrderVO> expect_orderlist=new ArrayList<OrderVO>();
		OrderVO expect_order1=new OrderVO(0, null, false, null, null, null, null, null, 0, null, 0, 0);
		expect_orderlist.add(expect_order1);
		
		assertEquals(expect_orderlist,orderlist);
	}
	
	@Test
	public void testorder_client_browse3(){
		MockClient1 client1=new MockClient1(1);
		MockOrder3 order1=new MockOrder3(false);
		OrderBLServiceImpl OrderImpl=new OrderBLServiceImpl();
		ArrayList<OrderVO> orderlist=OrderImpl.order_client_browse(client1.getclient_id(),order1.getorder_execute());
		ArrayList<OrderVO> expect_orderlist=new ArrayList<OrderVO>();
		OrderVO expect_order1=new OrderVO(0, null, false, null, null, null, null, null, 0, null, 0, 0);
		expect_orderlist.add(expect_order1);
		
		assertEquals(expect_orderlist,orderlist);
	}
	
	@Test
	public void testorder_hotel_browse1(){
		MockHotel1 hotel1=new MockHotel1(1);
		OrderBLServiceImpl OrderImpl=new OrderBLServiceImpl();
		ArrayList<OrderVO> orderlist=OrderImpl.order_hotel_browse(hotel1.gethotel_id());
		ArrayList<OrderVO> expect_orderlist=new ArrayList<OrderVO>();
		OrderVO expect_order1=new OrderVO(0, null, false, null, null, null, null, null, 0, null, 0, 0);
		expect_orderlist.add(expect_order1);
		
		assertEquals(expect_orderlist,orderlist);
	}
	
	@Test
	public void testorder_hotel_browse2(){
		MockHotel1 hotel1=new MockHotel1(1);
		MockOrder2 order1=new MockOrder2(OrderState.NORMAL);
		OrderBLServiceImpl OrderImpl=new OrderBLServiceImpl();
		ArrayList<OrderVO> orderlist=OrderImpl.order_client_browse(hotel1.gethotel_id(),order1.getorder_state());
		ArrayList<OrderVO> expect_orderlist=new ArrayList<OrderVO>();
		OrderVO expect_order1=new OrderVO(0, null, false, null, null, null, null, null, 0, null, 0, 0);
		expect_orderlist.add(expect_order1);
		
		assertEquals(expect_orderlist,orderlist);
	}
	
	@Test
	public void testorder_hotel_browse3(){
		MockHotel1 hotel1=new MockHotel1(1);
		MockOrder3 order1=new MockOrder3(false);
		OrderBLServiceImpl OrderImpl=new OrderBLServiceImpl();
		ArrayList<OrderVO> orderlist=OrderImpl.order_client_browse(hotel1.gethotel_id(),order1.getorder_execute());
		ArrayList<OrderVO> expect_orderlist=new ArrayList<OrderVO>();
		OrderVO expect_order1=new OrderVO(0, null, false, null, null, null, null, null, 0, null, 0, 0);
		expect_orderlist.add(expect_order1);
		
		assertEquals(expect_orderlist,orderlist);
	}
	
	@Test
	public void testorder_client_cancel(){
		MockClient1 client1=new MockClient1(1);
		MockOrder1 order1=new MockOrder1(1);
		OrderBLServiceImpl OrderImpl=new OrderBLServiceImpl();
		ResultMessage order_cancel_result=OrderImpl.order_client_cancel(client1.getclient_id(), order1.getorder_id());
		
		assertEquals(ResultMessage.Success,order_cancel_result);
	}
	
	@Test
	public void testorder_client_generate(){
		OrderVO orderinfo=new OrderVO(0, null, false, null, null, null, null, null, 0, null, 0, 0);
		OrderBLServiceImpl OrderImpl=new OrderBLServiceImpl();
		ResultMessage order_generate_result=OrderImpl.order_client_generate(orderinfo);
		
		assertEquals(ResultMessage.Success,order_generate_result);
	}
	
	@Test
	public void testorder_hotel_execute(){
		MockOrder1 order1=new MockOrder1(1);
		OrderBLServiceImpl OrderImpl=new OrderBLServiceImpl();
		ResultMessage order_hotel_execute_result=OrderImpl.order_hotel_execute(order1.getorder_id());
		
		assertEquals(ResultMessage.Success,order_hotel_execute_result);
	}
	
	@Test
	public void testorder_market_browseUnfilled(){
		OrderBLServiceImpl OrderImpl=new OrderBLServiceImpl();
		ArrayList<OrderVO> orderlist=OrderImpl.order_market_browseUnfilled();
		ArrayList<OrderVO> expect_orderlist=new ArrayList<OrderVO>();
		OrderVO expect_order1=new OrderVO(0, null, false, null, null, null, null, null, 0, null, 0, 0);
		expect_orderlist.add(expect_order1);
		
		assertEquals(expect_orderlist,orderlist);
	}
	
	@Test
	public void testorder_market_cancelAbnormal(){
		MockOrder1 order1=new MockOrder1(1);
		OrderBLServiceImpl OrderImpl=new OrderBLServiceImpl();
		ResultMessage order_marlet_cancel_result=OrderImpl.order_market_cancelAbnormal(order1.getorder_id());
		
		assertEquals(ResultMessage.Success,order_marlet_cancel_result);
	}
	
	@Test
	public void testcalculateTotalwithoutStrategy(){
		MockRoom1 room1=new MockRoom1(RoomType.SINGLEROOM,1);
		OrderBLServiceImpl OrderImpl=new OrderBLServiceImpl();
		int total=OrderImpl.calculateTotalwithoutStrategy(room1.getroomtye(),room1.getroomnum());
		
		assertEquals(200,total);
	}

	@Test
	public void testcalculateTotalwithStrategy(){
		MockRoom1 room1=new MockRoom1(RoomType.SINGLEROOM,1);
		ArrayList<HotelStrategy> hotelstrategy=new ArrayList<HotelStrategy>();
		ArrayList<WebStrategy> webstrategy=new ArrayList<WebStrategy>();
		OrderBLServiceImpl OrderImpl=new OrderBLServiceImpl();
		int total=OrderImpl.calculateTotalwithStrategy(room1.getroomtye(),room1.getroomnum(),hotelstrategy,webstrategy);
		
		assertEquals(200,total);
	}

	
	@Test
	public void testupdateActualLeaveTime(){
		MockOrder1 order1=new MockOrder1(1);
		OrderBLServiceImpl OrderImpl=new OrderBLServiceImpl();
		ResultMessage result=OrderImpl.updateActualLeaveTime(order1.getorder_id(), "2016-12-1-12-00-00");
		
		assertEquals(ResultMessage.Success,result);
	}
}
