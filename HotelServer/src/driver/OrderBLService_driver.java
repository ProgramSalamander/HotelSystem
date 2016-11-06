package driver;

import java.util.ArrayList;

import VO.ClientVO;
import VO.OrderVO;
import businesslogicsevice.OrderBLService;
import businesslogicsevice.ResultMessage;

public class OrderBLService_driver {
	public void drive(OrderBLService orderBLService){
		
		//�ͻ��鿴����
		ArrayList<OrderVO> OrderList_Client=new ArrayList<OrderVO>();
		OrderList_Client=orderBLService.order_client_browse();
		OrderVO order=OrderList_Client.get(0);
		System.out.println(order.getid());
		System.out.println(order.getstate());
		System.out.println(order.getexecute());
		System.out.println(order.gethotel());
		System.out.println(order.getstart_time());
		System.out.println(order.getend_time());
		System.out.println(order.getlatest_execute_time());
		System.out.println(order.getroom_type());
		System.out.println(order.getroom_number());
		System.out.println(order.getstrategy());
		System.out.println(order.getprice());
		System.out.println(order.getexpect_number_of_people());
		
		//�Ƶ깤����Ա�鿴����
		ArrayList<OrderVO> OrderList_Hotel=new ArrayList<OrderVO>();
		OrderList_Hotel=orderBLService.order_hotel_browse();
		OrderVO hotel=OrderList_Hotel.get(0);
		System.out.println(hotel.getid());
		System.out.println(hotel.getstate());
		System.out.println(hotel.getexecute());
		System.out.println(hotel.gethotel());
		System.out.println(hotel.getstart_time());
		System.out.println(hotel.getend_time());
		System.out.println(hotel.getlatest_execute_time());
		System.out.println(hotel.getroom_type());
		System.out.println(hotel.getroom_number());
		System.out.println(hotel.getstrategy());
		System.out.println(hotel.getprice());
		System.out.println(hotel.getexpect_number_of_people());
		
		//�ͻ���������
		ResultMessage result_client=orderBLService.order_client_cancel();
		if(result_client==ResultMessage.Success){
			System.out.println("�����ɹ�");
		}
		else{
			System.out.println("����ʧ��");
		}
		
		//�ͻ����ɶ���
		OrderVO order1=orderBLService.order_client_generate("input");
		System.out.println(order1.getid());
		System.out.println(order1.getstate());
		System.out.println(order1.getexecute());
		System.out.println(order1.gethotel());
		System.out.println(order1.getstart_time());
		System.out.println(order1.getend_time());
		System.out.println(order1.getlatest_execute_time());
		System.out.println(order1.getroom_type());
		System.out.println(order1.getroom_number());
		System.out.println(order1.getstrategy());
		System.out.println(order1.getprice());
		System.out.println(order1.getexpect_number_of_people());
		
		//�Ƶ깤����Աִ�ж���
		ClientVO c=new ClientVO("Jack","11111111111",0,"��",000001,"���˻�Ա","1997-1-1","��");
		ResultMessage result_hotel=orderBLService.order_hotel_execute(c);
		if(result_hotel==ResultMessage.Success){
			System.out.println("ִ�ж����ɹ�");
		}
		else{
			System.out.println("ִ�ж���ʧ��");
		}
	}
}
