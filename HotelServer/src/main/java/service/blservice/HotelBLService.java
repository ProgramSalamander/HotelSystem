package service.blservice;

import java.util.ArrayList;

import vo.*;
import objects.*;
public interface HotelBLService {
	// �ṩ��������õĽӿ�
		/**
		 * @param hotelid
		 * @return �Ƶ�鿴��ϸ��Ϣ
		 */
		public HotelVO hotel_checkInfo(int hotelid);

		/**
		 * @param vo
		 * @return �Ƶ������ϸ��Ϣ
		 */
		public ResultMessage hotel_updateInfo(HotelVO vo);

		/**
		 * @param room
		 * @return �Ƶ�¼����÷���
		 */
		public ResultMessage hotel_importRoom(Room room);

		/**
		 * @param info
		 * @return �Ƶ������ס��Ϣ
		 */
		public ResultMessage hotel_updateAccomodation(AccommodationInfo info);

		// �ṩ��ͬ����õĽӿ�
		/**
		 * @param hotelid
		 * @return ���ض�Ӧ�Ƶ�
		 */
		public Hotel searchHotel(int hotelid);

		/**
		 * @param clientid
		 * @return ���ض�Ӧ�ͻ�Ԥ�����ľƵ��б�
		 */
		public ArrayList<Hotel> previousHotel(int clientid);

		/**
		 * @param hotel
		 * @return ��ӾƵ�
		 */
		public ResultMessage addHotel(Hotel hotel);

		/**
		 * @param worker
		 * @return ��ӾƵ깤����Ա
		 */
		public ResultMessage addHotelWorker(HotelWorker worker);

		/**
		 * @param hotelid
		 * @return ���ض�Ӧ�Ƶ�Ĺ�����Ա
		 */
		public HotelWorker searchHotelWorker(int hotelid);

		/**
		 * @param hotelid
		 * @param worker
		 * @return ���¶�Ӧ�Ƶ�Ĺ�����Ա��Ϣ
		 */
		public ResultMessage updateHotelWokerInfo(int hotelid, HotelWorker worker);
}
