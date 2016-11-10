package mork;

import objects.HotelWorker;
import vo.HotelWorkerVO;

public class MorkHotelWorker11 extends HotelWorker {
	int hotelid;
	HotelWorkerVO w;
	
	public MorkHotelWorker11(int id,HotelWorkerVO hwvo){
		hotelid = id;
		w = hwvo;
	}
	public int getid(){
		return this.hotelid;
	}
	public HotelWorkerVO getHotelWorkerVO(){
		return this.w;
	}
	
	
}
