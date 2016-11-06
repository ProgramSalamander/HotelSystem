package service.blservice;

import java.util.ArrayList;

import objects.*;

public   interface StrategyBLService {
	// �ṩ��������õĽӿ�

		/**
		 * @param input
		 * @return �Ƶ���Ӵ�������
		 */
		public ResultMessage hotelstrategy_make(HotelStrategy strategy);

		/**
		 * @param strategy
		 * @return �Ƶ���´�������
		 */
		public ResultMessage hotelstrategy_update(HotelStrategy strategy);

		/**
		 * @param strategy
		 * @return ��վӪ����Ա��Ӵ�������
		 */
		public ResultMessage webstrategy_make(WebStrategy strategy);

		/**
		 * @param strategy
		 * @return ��վӪ����Ա���´�������
		 */
		public ResultMessage webstrategy_update(WebStrategy strategy);

		// �ṩ��ͬ����õĽӿ�
		/**
		 * @param hotelid
		 * @param clientid
		 * @return �õ���Ӧ�ͻ����õĶ�Ӧ�Ƶ�Ĵ��������б�
		 */
		public ArrayList<HotelStrategy> getStrategy(int hotelid, int clientid);

		/**
		 * @param clientid
		 * @return �õ���Ӧ�ͻ�ʹ�õ���վ�Ĵ��������б�
		 */
		public ArrayList<WebStrategy> getStrategy(int clientid);
}
