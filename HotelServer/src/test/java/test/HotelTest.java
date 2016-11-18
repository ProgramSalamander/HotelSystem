package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import mock.MockAccommo1;
import mock.MockClient1;
import mock.MockHotel1;
import mock.MockHotelWorker1;
import mock.MockRoom1;
import objects.Hotel;
import objects.ResultMessage;
import service.blservice.Impl.HotelBLServiceImpl;
import vo.HotelVO;

public class HotelTest {
	HotelBLServiceImpl hotelblImpl = new HotelBLServiceImpl();
	@Test
	public void testhotel_checkInfo(){
		HotelVO hotelVO = hotelblImpl.hotel_checkInfo(1);
		HotelVO testHotel = new HotelVO(1,"南京","新街�?", "如家", "如家酒店", "酒店�?有服�?", "可用", "双人�?", 1, 100, "", "good");
		
		assertEquals(testHotel,hotelVO);
	}
	
	@Test
	public void testhotel_updateInfo(){
		HotelVO testHotel = new HotelVO(1,"南京","仙林中心", "如家", "如家酒店", "酒店�?有服�?", "可用", "双人�?", 1, 100, "", "good");
		assertEquals(ResultMessage.Success,hotelblImpl.hotel_updateInfo(testHotel));
	}
	
	@Test
	public void testhotel_importRoom(){
		MockRoom1 importRoom = new MockRoom1("双人�?","220",5,"2016-10-11","2016-11-1");
		assertEquals(ResultMessage.Success,hotelblImpl.hotel_importRoom(importRoom));
	}
	
	@Test
	public void testhotel_updateAccomodation(){
		MockAccommo1 info = new MockAccommo1("201","2016-10-11","2016-11-03","2016_11-04");
		assertEquals(ResultMessage.Success,hotelblImpl.hotel_updateAccomodation(info));
	}
	
	@Test
	public void testsearchHotel(){
		Hotel hotel = new Hotel();
		MockHotel1 hotel1 = new MockHotel1(1);
		assertEquals(hotel,hotelblImpl.searchHotel(hotel1.getHotelid()));
	}
	
	@Test
	public void testpreviousHotel(){
		ArrayList<Hotel> HotelList_Client=new ArrayList<Hotel>();
		Hotel hotel=new Hotel();
		HotelList_Client.add(hotel);
		MockClient1 client = new MockClient1(2);
		assertEquals(HotelList_Client,hotelblImpl.previousHotel(client.getClientid()));
	}
	
	@Test
	public void testaddHotel(){
		Hotel hotel = new Hotel();
		assertEquals(ResultMessage.Success,hotelblImpl.addHotel(hotel));
	}
	
	@Test
	public void testaddHotelWorker(){
		MockHotelWorker1 worker = new MockHotelWorker1(1,"张三","10000","如家");
		assertEquals(ResultMessage.Success,hotelblImpl.addHotelWorker(worker));
	}
	
	@Test
	public void testsearchHotelWorker(){
		MockHotelWorker1 worker = new MockHotelWorker1(1,"张三","10000","如家");
		assertEquals(worker,hotelblImpl.searchHotelWorker(1));
	}
	
	@Test
	public void testupdateHotelWokerInfo(){
		MockHotelWorker1 worker = new MockHotelWorker1(1,"张三","10110","如家");
		assertEquals(ResultMessage.Success,hotelblImpl.updateHotelWokerInfo(worker.getHotelid(), worker));
	}
}
