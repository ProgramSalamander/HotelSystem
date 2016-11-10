package objects;

public class VIPInfo {
	public enum VIPType {
		NORMAL, Enterprise
	};

	VIPType type;
	int VIPid;
	String birthday;
	String enterpriseName;

	public VIPInfo(VIPType type, int vIPid, String info) {
		this.type = type;
		VIPid = vIPid;
		if(type == VIPType.NORMAL)
			birthday = info;
		else
			enterpriseName = info;
	}
}
