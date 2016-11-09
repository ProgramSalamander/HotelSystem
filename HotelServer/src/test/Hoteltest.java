package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import logiccontroller.HotelController;
import mock.MockClient1;
import objects.AccommodationInfo;
import objects.Hotel;
import objects.HotelWorker;
import objects.ResultMessage;
import objects.Room;
import vo.HotelVO;

public class Hoteltest {
	HotelController hotelContro = new HotelController();
	@Test
	public void testhotel_checkInfo(){
		HotelVO hotelVO = hotelContro.hotel_checkInfo(1);
		HotelVO testHotel = new HotelVO("�Ͼ�","�½ֿ�", "���", "��ҾƵ�", "�Ƶ����з���", "����", "˫�˷�", 1, 100, "", "good");
		
		assertEquals(testHotel,hotelVO);
	}
	
	@Test
	public void testhotel_updateInfo(){
		HotelVO testHotel = new HotelVO("�Ͼ�","��������", "���", "��ҾƵ�", "�Ƶ����з���", "����", "˫�˷�", 1, 100, "", "good");
		assertEquals(ResultMessage.Success,hotelContro.hotel_updateInfo(testHotel));
	}
	
	@Test
	public void testhotel_importRoom(){
		Room importRoom = new Room("˫�˷�","220",5,"2016-10-11","2016-11-1");
		assertEquals(ResultMessage.Success,hotelContro.hotel_importRoom(importRoom));
	}
	
	@Test
	public void testhotel_updateAccomodation(){
		AccommodationInfo info = new AccommodationInfo("201","2016-10-11","2016-11-03","2016_11-04");
		assertEquals(ResultMessage.Success,hotelContro.hotel_updateAccomodation(info));
	}
	
	@Test
	public void testsearchHotel(){
		Hotel hotel = new Hotel("�Ͼ�","�½ֿ�", "���", "��ҾƵ�", "�Ƶ����з���", "����", "˫�˷�", 1, 100, "", "good");
		assertEquals(hotel,hotelContro.searchHotel(1));
	}
	
	@Test
	public void testpreviousHotel(){
		ArrayList<Hotel> HotelList_Client=new ArrayList<Hotel>();
		Hotel hotel=new Hotel("�Ͼ�","�½ֿ�", "���", "��ҾƵ�", "�Ƶ����з���", "����", "˫�˷�", 1, 100, "", "good");
		HotelList_Client.add(hotel);
		MockClient1 client = new MockClient1(2);
		assertEquals(HotelList_Client,hotelContro.previousHotel(client.getClientid()));
	}
	
	@Test
	public void testaddHotel(){
		Hotel hotel = new Hotel("�Ͼ�","�½ֿ�", "���", "��ҾƵ�", "�Ƶ����з���", "����", "˫�˷�", 1, 100, "", "good");
		assertEquals(ResultMessage.Success,hotelContro.addHotel(hotel));
	}
	
	@Test
	public void testaddHotelWorker(){
		HotelWorker worker = new HotelWorker("����","10000","���");
		assertEquals(ResultMessage.Success,hotelContro.addHotelWorker(worker));
	}
	
	@Test
	public void testsearchHotelWorker(){
		HotelWorker worker = new HotelWorker("����","10000","���");
		assertEquals(worker,hotelContro.searchHotelWorker(1));
	}
	
	@Test
	public void testupdateHotelWokerInfo(){
		HotelWorker worker = new HotelWorker("����","10110","���");
		assertEquals(ResultMessage.Success,hotelContro.updateHotelWokerInfo(1, worker));
	}
}
