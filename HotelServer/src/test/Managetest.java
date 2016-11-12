package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mork.MorkClient21;
import mork.MorkHotel21;
import mork.MorkWebMarket21;
import objects.ResultMessage;
import service.blservice.Impl.ManageBLServiceImpl;
import vo.ClientVO;
import vo.HotelVO;
import vo.HotelWorkerVO;
import vo.WebMarketVO;

public class Managetest {
	/**
	 * ���������ͻ���
	 */
	@Test
	public void testmanage_searchClient(){
		MorkClient21 client1 = new MorkClient21(1);
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		ClientVO clientvo = mserviceimpl.manage_searchClient(client1.getid());
		
		assertEquals(null,clientvo);
	}
	
	/**
	 * ���Ը��¿ͻ���Ϣ��
	 */
	@Test
	public void testmanage_updateClient(){
		ClientVO clientvo = new ClientVO(1,"1","1",1,"1",1,"1","1","1");
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		ResultMessage result = mserviceimpl.manage_updateClient(clientvo);
		
		assertEquals(ResultMessage.Success,result);
	}
	
	/**
	 * ������ӾƵꡣ
	 */
	@Test
	public void testmanage_addHotel(){
		HotelVO hotelvo = new HotelVO(1,"1","1","1","1","1","1","1",1,1,"1","1");
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		ResultMessage result = mserviceimpl.manage_addHotel(hotelvo);
		
		assertEquals(ResultMessage.Success,result);
	}
	
	
	/**
	 * ������ӾƵ깤����Ա��
	 */
	@Test
	public void testmanage_addHotelWorker(){
		HotelWorkerVO hotelworkervo = new HotelWorkerVO(1,"1","2","3");
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		ResultMessage result =  mserviceimpl.manage_addHotelWorker(hotelworkervo);
		
		assertEquals(ResultMessage.Success,result);
	}
	
	
	/**
	 * ���������Ƶ깤����Ա��
	 */
	@Test
	public void testmanage_searchHotelWorker(){
		MorkHotel21 hotel1 = new MorkHotel21(100012);
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		HotelWorkerVO hotelworkerpo = mserviceimpl.manage_searchHotelWorker(hotel1.getid());
		
		assertEquals(null,hotelworkerpo);
	}
	
	/**
	 * ���Ը��¾Ƶ깤����Ա��Ϣ
	 */
	@Test
	public void testmanage_updateHotelWorker(){
		HotelWorkerVO hotelworkervo = new HotelWorkerVO(1,"1","2","3");
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		ResultMessage result =  mserviceimpl.manage_updateHotelWorker(hotelworkervo);
		
		assertEquals(ResultMessage.Success,result);
	}
	
	
	/**
	 * ���������վӪ����Ա
	 */
	@Test
	public void testmanage_addMarketWorker(){
		WebMarketVO webmarketvo = new WebMarketVO(1,"1","1");
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		ResultMessage result =  mserviceimpl.manage_addMarketWorker(webmarketvo);
		
		assertEquals(ResultMessage.Success,result);
	}
	
	
	/**
	 * ����������վӪ����Ա 
	 */
	@Test
	public void testmanage_searchMarketWorker(){
		MorkWebMarket21 webmarket = new MorkWebMarket21(1,"1","1");
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		WebMarketVO webmarketvo =  mserviceimpl.manage_searchMarketWorker(webmarket.getid());
		
		assertEquals(null,webmarketvo);
		
	}
	
	
	/**
	 * ���Ը�����վӪ����Ա��Ϣ
	 */
	@Test
	public void testmanage_updateMarketWorker(){
		WebMarketVO webmarketvo = new WebMarketVO(1,"1","1");
		ManageBLServiceImpl mserviceimpl = new ManageBLServiceImpl();
		ResultMessage result =  mserviceimpl.manage_addMarketWorker(webmarketvo);
		
		assertEquals(ResultMessage.Success,result);
	}
	
	
}