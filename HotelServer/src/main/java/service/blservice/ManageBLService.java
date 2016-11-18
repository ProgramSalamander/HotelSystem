package service.blservice;

import objects.ResultMessage;
import vo.ClientVO;
import vo.HotelVO;
import vo.HotelWorkerVO;
import vo.WebMarketVO;

public interface ManageBLService {
	// �ṩ��������õĽӿ�
		/**
		 * @param clientid
		 * @return �����ͻ�
		 */
		public ClientVO manage_searchClient(int clientid);

		/**
		 * @param clientid
		 * @return ���¿ͻ���Ϣ
		 */
		public ResultMessage manage_updateClient(ClientVO clientvo);

		/**
		 * @param hotelid
		 * @return ��ӾƵ�
		 */
		public ResultMessage manage_addHotel(HotelVO hotelvo);

		/**
		 * @param hotelid
		 * @param w
		 * @return ��ӾƵ깤����Ա
		 */
		public ResultMessage manage_addHotelWorker(HotelWorkerVO w);

		/**
		 * @param hotelid
		 * @return �����Ƶ깤����Ա
		 */
		public HotelWorkerVO manage_searchHotelWorker(int hotelid);

		/**
		 * @param hotelid
		 * @return ���¾Ƶ깤����Ա��Ϣ
		 */
		public ResultMessage manage_updateHotelWorker(HotelWorkerVO w);

		/**
		 * @param mw
		 * @return �����վӪ����Ա
		 */
		public ResultMessage manage_addMarketWorker(WebMarketVO mw);

		/**
		 * @param marketWorkerid
		 * @return ������վӪ����Ա
		 */
		public WebMarketVO manage_searchMarketWorker(int marketWorkerid);

		/**
		 * @param mw
		 * @return ������վӪ����Ա��Ϣ
		 */
		public ResultMessage manage_updateMarketWorker(WebMarketVO mw);
}
