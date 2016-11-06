package logiccontroller;

import java.util.ArrayList;

import businesslogicsevice.OrderBLService;
import businesslogicsevice.ResultMessage;
import vo.ClientVO;
import vo.OrderVO;

public class OrderController implements OrderBLService{
	//订单参数
		int id=000001;
		String state="正常";
		boolean execute=false;
		String hotel="如家";
		String start_time="2016-10-16-19:00";
		String end_time="2016-10-20-12:00";
		String latest_execute_time="2016-10-17-12:00";
		String room_type="双人房";
		int room_number=1;
		String strategy="无";
		int price=800;
		int expect_number_of_people=2;
		
		
		
		//客户浏览订单
		public ArrayList<OrderVO> order_client_browse(){
			ArrayList<OrderVO> OrderList_Client=new ArrayList<OrderVO>();
			OrderVO neworder=new OrderVO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people);
			OrderList_Client.add(neworder);
			return OrderList_Client;
		}
		
		//酒店工作人员浏览订单
		public ArrayList<OrderVO> order_hotel_browse(){
			ArrayList<OrderVO> OrderList_Hotel=new ArrayList<OrderVO>();
			OrderVO neworder=new OrderVO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people);
			OrderList_Hotel.add(neworder);
			return OrderList_Hotel;
		}
		
		//客户撤销订单
		public ResultMessage order_client_cancel(){
			return ResultMessage.Success;
		}
		
		//客户生成订单
		public OrderVO order_client_generate(String input){
			OrderVO neworder=new OrderVO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people);
			return neworder;
		}
		
		//酒店工作人员执行订单
		public ResultMessage order_hotel_execute(ClientVO c){
			return ResultMessage.Success;
		}
}
