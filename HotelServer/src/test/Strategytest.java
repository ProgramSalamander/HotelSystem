package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import logiccontroller.StrategyController;
import mock.MockClient1;
import mock.MockHotel1;
import objects.HotelStrategy;
import objects.ResultMessage;
import objects.WebStrategy;
import vo.HotelStrategyVO;
import vo.WebStrategyVO;

public class Strategytest {
	StrategyController strategyContro = new StrategyController();
	@Test
	public void testhotelstrategy_make(){
		HotelStrategyVO hsVO=new HotelStrategyVO("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		assertEquals(hsVO,strategyContro.hotelstrategy_make("��ҵ���,��,2016-10-14-0:00,2016-10-20-0:00,����,false"));
	}
	
	@Test
	public void testhotelstrategy_update(){
		HotelStrategyVO hsVO=new HotelStrategyVO("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		assertEquals(hsVO,strategyContro.hotelstrategy_make("����"));
	}
	
	@Test
	public void testwebstrategy_make(){
		WebStrategyVO wsVO=new WebStrategyVO("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		assertEquals(wsVO,strategyContro.webstrategy_make("��ҵ���,��,2016-10-14-0:00,2016-10-20-0:00,����,false"));
	}
	
	@Test
	public void testwebstrategy_update(){
		WebStrategyVO wsVO=new WebStrategyVO("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		assertEquals(wsVO,strategyContro.webstrategy_make("����"));
	}
	
	@Test
	public void testisHotelstrategy_make(){
		HotelStrategy hs=new HotelStrategy("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		assertEquals(ResultMessage.Success,strategyContro.hotelstrategy_make(hs));
	}
	
	@Test
	public void testisHotelstrategy_update(){
		HotelStrategy hs=new HotelStrategy("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		assertEquals(ResultMessage.Success,strategyContro.hotelstrategy_update(hs));
	}
	
	@Test
	public void testisWebstrategy_make(){
		WebStrategy ws=new WebStrategy("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		assertEquals(ResultMessage.Success,strategyContro.webstrategy_make(ws));
	}
	
	@Test
	public void testisWebstrategy_update(){
		WebStrategy ws=new WebStrategy("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		assertEquals(ResultMessage.Success,strategyContro.webstrategy_update(ws));
	}
	
	@Test
	public void testgetHotelStrategy(){
		HotelStrategy hs=new HotelStrategy("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		ArrayList<HotelStrategy> hotelStrategy = new ArrayList<HotelStrategy>();
		hotelStrategy.add(hs);
		MockClient1 client  = new MockClient1(2);
		MockHotel1 hotel = new MockHotel1(1);
		assertEquals(hotelStrategy,strategyContro.getStrategy(hotel.getHotelid(), client.getClientid()));
	}
	
	@Test
	public void testgetWebStrategy(){
		WebStrategy ws=new WebStrategy("��ҵ���","��","2016-10-14-0:00","2016-10-20-0:00","����",false);
		ArrayList<WebStrategy> webStrategy = new ArrayList<WebStrategy>();
		webStrategy.add(ws);
		MockClient1 client  = new MockClient1(2);
		assertEquals(webStrategy,strategyContro.getStrategy( client.getClientid()));
	}
	
}
