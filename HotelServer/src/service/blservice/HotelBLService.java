package service.blservice;

import java.util.ArrayList;

<<<<<<< HEAD
import Objects.AcommodationInfo;
import Objects.Hotel;
import Objects.HotelWorker;
import Objects.ResultMessage;
import Objects.Room;
import vo.HotelVO;

=======
import vo.*;
import objects.*;
>>>>>>> origin/master
public interface HotelBLService {
	// 提供给界面调用的接口
		/**
		 * @param hotelid
		 * @return 酒店查看详细信息
		 */
		public HotelVO hotel_checkInfo(int hotelid);

		/**
		 * @param vo
		 * @return 酒店更新详细信息
		 */
		public ResultMessage hotel_updateInfo(HotelVO vo);

		/**
		 * @param room
		 * @return 酒店录入可用房间
		 */
		public ResultMessage hotel_importRoom(Room room);

		/**
		 * @param info
		 * @return 酒店更新入住信息
		 */
		public ResultMessage hotel_updateAccomodation(AcommodationInfo info);

		// 提供给同层调用的接口
		/**
		 * @param hotelid
		 * @return 返回对应酒店
		 */
		public Hotel searchHotel(int hotelid);

		/**
		 * @param clientid
		 * @return 返回对应客户预定过的酒店列表
		 */
		public ArrayList<Hotel> previousHotel(int clientid);

		/**
		 * @param hotel
		 * @return 添加酒店
		 */
		public ResultMessage addHotel(Hotel hotel);

		/**
		 * @param worker
		 * @return 添加酒店工作人员
		 */
		public ResultMessage addHotelWorker(HotelWorker worker);

		/**
		 * @param hotelid
		 * @return 返回对应酒店的工作人员
		 */
		public HotelWorker searchHotelWorker(int hotelid);

		/**
		 * @param hotelid
		 * @param worker
		 * @return 更新对应酒店的工作人员信息
		 */
		public ResultMessage updateHotelWokerInfo(int hotelid, HotelWorker worker);
}
