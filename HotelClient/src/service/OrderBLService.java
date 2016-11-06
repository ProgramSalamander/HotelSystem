package service;

import java.util.ArrayList;

import Objects.HotelStrategy;
import Objects.OrderState;
import Objects.ResultMessage;
import Objects.RoomType;
import Objects.WebStrategy;
import VO.OrderVO;

public interface OrderBLService {
		//提供给界面调用的接口
		public ArrayList<OrderVO> order_client_browse(int clientid);
		
		public ArrayList<OrderVO> order_client_browse(int clientid,OrderState state);
		
		public ArrayList<OrderVO> order_client_browse(int clientid,boolean isExecute);
		
		public ArrayList<OrderVO> order_hotel_browse(int hotelid);
		
		public ArrayList<OrderVO> order_hotel_browse(int hotelid,OrderState state);
		
		public ArrayList<OrderVO> order_hotel_browse(int hotelid,boolean isExecute);
		
		public ResultMessage order_client_cancel(int clientid,int orderid);
		
		public OrderVO order_client_generate(OrderVO vo);
		
		public ResultMessage order_hotel_execute(int orderid);
		
		public ArrayList<OrderVO> order_market_browseUnfilled();
		
		public ResultMessage order_market_cancelAbnormal(int orderid);
		
		public int calculateTotalwithoutStrategy(RoomType type, int num);
		
		public int calculateTotalwithStrategy(RoomType type, int num,ArrayList<HotelStrategy> list1,ArrayList<WebStrategy>list2);
		
		//提供给同层调用的接口
		public ResultMessage updateActualLeaveTime();
}
