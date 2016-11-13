package test;

import java.util.ArrayList;

import org.junit.*;

import logiccontroller.ClientController;
import objects.Evaluation;
import objects.ResultMessage;
import objects.RoomType;
import objects.VIPInfo;
import objects.VIPInfo.VIPType;
import service.blservice.ClientBLService;
import service.blservice.Impl.ClientBLServiceImpl;
import vo.ClientVO;
import vo.HotelVO;
import mock.*;

public class Clienttest {
	// 测试提供给界面的接口
	@Test
	public void client_checkInfoTest() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		ArrayList<String> credit_record = new ArrayList<String>();
		VIPInfo info = new VIPInfo(VIPType.NORMAL, 1, "2000/01/01");
		ClientVO vo = new ClientVO(1, "张三", "11111111111", 0, credit_record, info);
		Assert.assertEquals(vo, clientcontroller.client_checkInfo(1));
	}

	@Test
	public void client_updateInfoTest() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		ArrayList<String> credit_record = new ArrayList<String>();
		VIPInfo info = new VIPInfo(VIPType.NORMAL, 1, "2000/01/01");
		ClientVO vo = new ClientVO(1, "张三", "11111111111", 0, credit_record, info);
		Assert.assertEquals(ResultMessage.Success, clientcontroller.client_updateInfo(vo));
	}

	@Test
	public void client_getpreviousHotelListTest() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		ArrayList<HotelVO> HotelList_Client = new ArrayList<HotelVO>();
		HotelVO hotel = new HotelVO(1,"南京", "新街口", "如家", "如家酒店", "酒店所有服务", "可用", "双人房", 1, 100, "", "good");
		HotelList_Client.add(hotel);
		Assert.assertEquals(HotelList_Client, clientcontroller.client_getpreviousHotelList(1));
	}

	@Test
	public void client_setLocationTest() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		MockHotel30 hotel30 = new MockHotel30("南京");
		ArrayList<HotelVO> HotelList_Client = new ArrayList<HotelVO>();
		HotelVO hotel = new HotelVO(1,"南京", "新街口", "如家", "如家酒店", "酒店所有服务", "可用", "双人房", 1, 100, "", "good");
		HotelList_Client.add(hotel);
		Assert.assertEquals(HotelList_Client, clientcontroller.client_setLocation(hotel30.getLocation()));
	}

	@Test
	public void client_searchHotelTest1() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		MockHotel31 hotel31 = new MockHotel31("如家");
		ArrayList<HotelVO> HotelList_Client = new ArrayList<HotelVO>();
		HotelVO hotel = new HotelVO(1,"南京", "新街口", "如家", "如家酒店", "酒店所有服务", "可用", "双人房", 1, 100, "", "good");
		HotelList_Client.add(hotel);
		Assert.assertEquals(HotelList_Client, clientcontroller.client_searchHotel(hotel31.getHotelname()));
	}

	@Test
	public void client_searchHotelTest2() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		MockHotel32 hotel32 = new MockHotel32(RoomType.DOUBLEROOM);
		ArrayList<HotelVO> HotelList_Client = new ArrayList<HotelVO>();
		HotelVO hotel = new HotelVO(1,"南京", "新街口", "如家", "如家酒店", "酒店所有服务", "可用", "双人房", 1, 100, "", "good");
		HotelList_Client.add(hotel);
		Assert.assertEquals(HotelList_Client, clientcontroller.client_searchHotel(hotel32.getType()));
	}

	@Test
	public void client_searchHotelTest3() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		MockHotel33 hotel33 = new MockHotel33(100, 200);
		ArrayList<HotelVO> HotelList_Client = new ArrayList<HotelVO>();
		HotelVO hotel = new HotelVO(1,"南京", "新街口", "如家", "如家酒店", "酒店所有服务", "可用", "双人房", 1, 100, "", "good");
		HotelList_Client.add(hotel);
		Assert.assertEquals(HotelList_Client,
				clientcontroller.client_searchHotel(hotel33.getLowprice(), hotel33.getHighprice()));
	}

	@Test
	public void client_searchHotelTest4() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		MockHotel34 hotel34 = new MockHotel34("2001/01/01", "2001/01/03");
		ArrayList<HotelVO> HotelList_Client = new ArrayList<HotelVO>();
		HotelVO hotel = new HotelVO(1,"南京", "新街口", "如家", "如家酒店", "酒店所有服务", "可用", "双人房", 1, 100, "", "good");
		HotelList_Client.add(hotel);
		Assert.assertEquals(HotelList_Client,
				clientcontroller.client_searchHotel(hotel34.getInTime(), hotel34.getLeaveTime()));
	}

	@Test
	public void client_searchHotelTest5() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		MockHotel35 hotel35 = new MockHotel35(1);
		ArrayList<HotelVO> HotelList_Client = new ArrayList<HotelVO>();
		HotelVO hotel = new HotelVO(1,"南京", "新街口", "如家", "如家酒店", "酒店所有服务", "可用", "双人房", 1, 100, "", "good");
		HotelList_Client.add(hotel);
		Assert.assertEquals(HotelList_Client, clientcontroller.client_searchHotel(hotel35.getStar()));
	}

	@Test
	public void client_searchHotelTest6() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		MockHotel36 hotel36 = new MockHotel36(4.0, 5.0);
		ArrayList<HotelVO> HotelList_Client = new ArrayList<HotelVO>();
		HotelVO hotel = new HotelVO(1,"南京", "新街口", "如家", "如家酒店", "酒店所有服务", "可用", "双人房", 1, 100, "", "good");
		HotelList_Client.add(hotel);
		Assert.assertEquals(HotelList_Client,
				clientcontroller.client_searchHotel(hotel36.getLowscore(), hotel36.getHighscore()));
	}

	@Test
	public void client_checkHotelInfoTest() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		HotelVO hotel = new HotelVO(1,"南京", "新街口", "如家", "如家酒店", "酒店所有服务", "可用", "双人房", 1, 100, "", "good");
		Assert.assertEquals(hotel, clientcontroller.client_checkHotelInfo(1));
	}

	@Test
	public void client_checkCreditTest() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		MockClient30 client30 = new MockClient30(1);
		Assert.assertEquals(0, clientcontroller.client_checkCredit(client30.getId()));
	}

	@Test
	public void client_checkCreditListTest() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		MockClient30 client30 = new MockClient30(1);
		ArrayList<String> strings = new ArrayList<>();
		Assert.assertEquals(strings, clientcontroller.client_checkCreditList(client30.getId()));
	}

	@Test
	public void client_evaluateHotelTest() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		MockClient30 client30 = new MockClient30(1);
		Evaluation evaluation = new Evaluation(4.0, "good");
		Assert.assertEquals(ResultMessage.Success, clientcontroller.client_evaluateHotel(evaluation, client30.getId()));
	}

	@Test
	public void client_enrollVIPTest() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		MockClient30 client30 = new MockClient30(1);
		VIPInfo info = new VIPInfo(VIPType.NORMAL, 1, "2001/01/01");
		Assert.assertEquals(ResultMessage.Success, clientcontroller.client_enrollVIP(info, client30.getId()));
	}

	// 测试提供给同层的接口
	@Test
	public void updateClientCreditTest() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		Assert.assertEquals(ResultMessage.Success, clientcontroller.updateClientCredit(1, 100, 0));
	}

	@Test
	public void checkClientInfoTest() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		MockClient1 client1 = new MockClient1(1);
		Assert.assertEquals(client1, clientcontroller.checkClientInfo(1));
	}

	@Test
	public void updateClientInfoTest() {
		ClientBLService clientcontroller = new ClientBLServiceImpl();
		MockClient1 client2 = new MockClient1(2);
		Assert.assertEquals(ResultMessage.Success, clientcontroller.updateClientInfo(client2));
	}
}

