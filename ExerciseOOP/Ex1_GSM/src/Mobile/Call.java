package Mobile;

public class Call {
	private String day;
	private String time;
	private String numberCall;
	private int duration;
	
	public Call(){
		
	}
	
	public Call(String day, String time, String numberCall, int duration) {
		this.day = day;
		this.time = time;
		this.numberCall = numberCall;
		this.duration = duration;
	}
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getNumberCall() {
		return numberCall;
	}
	public void setNumberCall(String numberCall) {
		this.numberCall = numberCall;
	}
	public int getduration() {
		return duration;
	}
	public void setduration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Call [day=" + day + ", time=" + time + ", numberCall=" + numberCall + ", duration=" + duration + "]";
	}
	
	
	
	
	
}
