package logiccontroller;


import java.util.ArrayList;
import vo.*;
import service.blservice.*;
import objects.*;

public class OrderController implements OrderBLService{
	//��������
		int id=000001;
		String state="����";
		boolean execute=false;
		String hotel="���";
		String start_time="2016-10-16-19:00";
		String end_time="2016-10-20-12:00";
		String latest_execute_time="2016-10-17-12:00";
		String room_type="˫�˷�";
		int room_number=1;
		String strategy="��";
		int price=800;
		int expect_number_of_people=2;
		
		
		
		//�ͻ��������
		public ArrayList<OrderVO> order_client_browse(){
			ArrayList<OrderVO> OrderList_Client=new ArrayList<OrderVO>();
			OrderVO neworder=new OrderVO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people);
			OrderList_Client.add(neworder);
			return OrderList_Client;
		}
		
		//�Ƶ깤����Ա�������
		public ArrayList<OrderVO> order_hotel_browse(){
			ArrayList<OrderVO> OrderList_Hotel=new ArrayList<OrderVO>();
			OrderVO neworder=new OrderVO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people);
			OrderList_Hotel.add(neworder);
			return OrderList_Hotel;
		}
		
		//�ͻ���������
		public ResultMessage order_client_cancel(){
			return ResultMessage.Success;
		}
		
		//�ͻ����ɶ���
		public OrderVO order_client_generate(String input){
			OrderVO neworder=new OrderVO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people);
			return neworder;
		}
		
		//�Ƶ깤����Աִ�ж���
		public ResultMessage order_hotel_execute(ClientVO c){
			return ResultMessage.Success;
		}

		@Override
		public ArrayList<OrderVO> order_client_browse(int clientid) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayList<OrderVO> order_client_browse(int clientid, OrderState state) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayList<OrderVO> order_client_browse(int clientid, boolean isExecute) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayList<OrderVO> order_hotel_browse(int hotelid) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayList<OrderVO> order_hotel_browse(int hotelid, OrderState state) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayList<OrderVO> order_hotel_browse(int hotelid, boolean isExecute) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultMessage order_client_cancel(int clientid, int orderid) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultMessage order_client_generate(OrderVO vo) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultMessage order_hotel_execute(int orderid) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayList<OrderVO> order_market_browseUnfilled() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultMessage order_market_cancelAbnormal(int orderid) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int calculateTotalwithoutStrategy(RoomType type, int num) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int calculateTotalwithStrategy(RoomType type, int num, ArrayList<HotelStrategy> list1,
				ArrayList<WebStrategy> list2) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public ResultMessage updateActualLeaveTime(int orderid, String leaveTime) {
			// TODO Auto-generated method stub
			return null;
		}
}
