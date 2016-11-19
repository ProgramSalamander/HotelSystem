package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import mock.MockClient1;
import mock.MockHotel1;
import mock.MockHotelStrategy1;
import mock.MockWebStrategy1;
import objects.HotelStrategy;
import objects.ResultMessage;
import objects.WebStrategy;
import service.blservice.Impl.StrategyBLServiceImpl;

public class StrategyTest {
	StrategyBLServiceImpl strategyblImpl = new StrategyBLServiceImpl();
	
	@Test
	public void testisHotelstrategy_make(){
		MockHotelStrategy1 hs=new MockHotelStrategy1("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		assertEquals(ResultMessage.Success,strategyblImpl.hotelstrategy_make(hs));
	}
	
	@Test
	public void testisHotelstrategy_update(){
		MockHotelStrategy1 hs=new MockHotelStrategy1("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		assertEquals(ResultMessage.Success,strategyblImpl.hotelstrategy_update(hs));
	}
	
	@Test
	public void testisWebstrategy_make(){
		MockWebStrategy1 ws=new MockWebStrategy1("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		assertEquals(ResultMessage.Success,strategyblImpl.webstrategy_make(ws));
	}
	
	@Test
	public void testisWebstrategy_update(){
		MockWebStrategy1 ws=new MockWebStrategy1("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		assertEquals(ResultMessage.Success,strategyblImpl.webstrategy_update(ws));
	}
	
	@Test
	public void testgetHotelStrategy(){
		MockHotelStrategy1 hs=new MockHotelStrategy1("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		ArrayList<HotelStrategy> hotelStrategy = new ArrayList<HotelStrategy>();
		hotelStrategy.add(hs);
		MockClient1 client  = new MockClient1(2);
		MockHotel1 hotel = new MockHotel1(1);
		assertEquals(hotelStrategy,strategyblImpl.getStrategy(hotel.getHotelid(), client.getClientid()));
	}
	
	@Test
	public void testgetWebStrategy(){
		MockWebStrategy1 ws=new MockWebStrategy1("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		ArrayList<WebStrategy> webStrategy = new ArrayList<WebStrategy>();
		webStrategy.add(ws);
		MockClient1 client  = new MockClient1(2);
		assertEquals(webStrategy,strategyblImpl.getStrategy( client.getClientid()));
	}
	
}
