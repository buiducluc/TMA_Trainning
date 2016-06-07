package Mobile;

public class Battery {
	private String model;
	private int hoursIdle;
	private int hoursTalk;
	private BatteryType type;
	
	public Battery(){
		
	}
	
	public Battery(String model, int hoursIdle, int hoursTalk, BatteryType type){
		this.hoursIdle = hoursIdle;
		this.model = model;
		this.hoursTalk = hoursTalk;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Battery [model=" + model + ", hoursIdle=" + hoursIdle + ", hoursTalk=" + hoursTalk + ", type=" + type
				+ "]";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHoursIdle() {
		return hoursIdle;
	}

	public void setHoursIdle(int hoursIdle) {
		this.hoursIdle = hoursIdle;
	}

	public int getHoursTalk() {
		return hoursTalk;
	}

	public void setHoursTalk(int hoursTalk) {
		this.hoursTalk = hoursTalk;
	}
	public enum BatteryType{
		LiIon, NiMH, NiCd
	}
	
	
	
}	
