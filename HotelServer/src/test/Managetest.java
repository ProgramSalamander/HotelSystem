package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import mock.*;
import objects.ResultMessage;
import objects.VIPInfo;
import objects.VIPInfo.VIPType;
import service.blservice.Impl.ManageBLServiceImpl;
import vo.ClientVO;
import vo.HotelVO;
import vo.HotelWorkerVO;
import vo.WebMarketVO;

public class Managetest {
	/**
	 * 测试搜索客户。
	 */
	@Test
	public void testmanage_searchClient(){
		MockClient21 client1 = new MockClient21(1);
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		ClientVO clientvo = mserviceimpl.manage_searchClient(client1.getid());
		
		assertEquals(null,clientvo);
	}
	
	/**
	 * 测试更新客户信息。
	 */
	@Test
	public void testmanage_updateClient(){
		ArrayList<String> credit_record = new ArrayList<String>();
		VIPInfo info = new VIPInfo(VIPType.NORMAL, 1, "2000/01/01");
		ClientVO vo = new ClientVO(1, "张三", "11111111111", 0, credit_record, info);
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		ResultMessage result = mserviceimpl.manage_updateClient(vo);
		
		assertEquals(ResultMessage.Success,result);
	}
	
	/**
	 * 测试添加酒店。
	 */
	@Test
	public void testmanage_addHotel(){
		HotelVO hotelvo = new HotelVO(1,"1","1","1","1","1","1","1",1,1,"1","1");
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		ResultMessage result = mserviceimpl.manage_addHotel(hotelvo);
		
		assertEquals(ResultMessage.Success,result);
	}
	
	
	/**
	 * 测试添加酒店工作人员。
	 */
	@Test
	public void testmanage_addHotelWorker(){
		HotelWorkerVO hotelworkervo = new HotelWorkerVO(1,"1","2","3");
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		ResultMessage result =  mserviceimpl.manage_addHotelWorker(hotelworkervo);
		
		assertEquals(ResultMessage.Success,result);
	}
	
	
	/**
	 * 测试搜索酒店工作人员。
	 */
	@Test
	public void testmanage_searchHotelWorker(){
		MorkHotel21 hotel1 = new MorkHotel21(100012);
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		HotelWorkerVO hotelworkerpo = mserviceimpl.manage_searchHotelWorker(hotel1.getid());
		
		assertEquals(null,hotelworkerpo);
	}
	
	/**
	 * 测试更新酒店工作人员信息
	 */
	@Test
	public void testmanage_updateHotelWorker(){
		HotelWorkerVO hotelworkervo = new HotelWorkerVO(1,"1","2","3");
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		ResultMessage result =  mserviceimpl.manage_updateHotelWorker(hotelworkervo);
		
		assertEquals(ResultMessage.Success,result);
	}
	
	
	/**
	 * 测试添加网站营销人员
	 */
	@Test
	public void testmanage_addMarketWorker(){
		WebMarketVO webmarketvo = new WebMarketVO(1,"1","1");
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		ResultMessage result =  mserviceimpl.manage_addMarketWorker(webmarketvo);
		
		assertEquals(ResultMessage.Success,result);
	}
	
	
	/**
	 * 测试搜索网站营销人员 
	 */
	@Test
	public void testmanage_searchMarketWorker(){
		MorkWebMarket21 webmarket = new MorkWebMarket21(1,"1","1");
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		WebMarketVO webmarketvo =  mserviceimpl.manage_searchMarketWorker(webmarket.getid());
		
		assertEquals(null,webmarketvo);
		
	}
	
	
	/**
	 * 测试更新网站营销人员信息
	 */
	@Test
	public void testmanage_updateMarketWorker(){
		WebMarketVO webmarketvo = new WebMarketVO(1,"1","1");
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		ResultMessage result =  mserviceimpl.manage_addMarketWorker(webmarketvo);
		
		assertEquals(ResultMessage.Success,result);
	}
	
	
}