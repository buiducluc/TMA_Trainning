package Mobile;

import java.util.List;

public class GSM {
	private String modelGSM;
	private String manufacturer;
	private float price;
	private String owner;
	private Battery battery;
	private Display display;
	
	//Add static IP4s
	static GSM Iphone4s = new GSM("Iphone", "Apple", 20.7f, "Luc", null, null);
	
	List<Call> CallHistory;
	
	public GSM(){
		
	}
	public GSM(String modelGSM, String manufacturer, float price, String owner, Battery bettery, Display display) {
		super();
		this.modelGSM = modelGSM;
		this.manufacturer = manufacturer;
		this.price = price;
		this.owner = owner;
		this.battery = bettery;
		this.display = display;
	}
	public String getModelGSM() {
		return modelGSM;
	}
	public void setModelGSM(String modelGSM) {
		this.modelGSM = modelGSM;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Battery getBettery() {
		return battery;
	}
	public void setBettery(Battery bettery) {
		this.battery = bettery;
	}
	public Display getDisplay() {
		return display;
	}
	public void setDisplay(Display display) {
		this.display = display;
	}
	
	//try override toString()
	@Override
	public String toString() {
		return "GSM [modelGSM=" + modelGSM + ", manufacturer=" + manufacturer + ", price=" + price + ", owner=" + owner
				+ ", bettery=" + battery + ", display=" + display + "]";
	}
	
	public boolean checkExist(Call c){
		
		if(c.getDay() != null && c.getNumberCall() != null 
				&& c.getTime() != null &&c.getduration() > 0){
			return true;
		}
		
		return false;
	}
	
	public void addCallHistory(Call c){
		CallHistory.add(c);
	}
	
	public void deleteCallHistory(Call c){
		if(checkExist(c)){
			CallHistory.remove(c);
			System.out.println("Removed call: " + c);
		}
		else{
			System.out.println("No removed call.");

		}
	}
	
	
	
	public void clearHistory(){
		CallHistory.clear();
	}
	public Double calculateCall(float priceForMinutes){
		Double result = 0.0;
		Double minutes = 0.0;
		for(Call call : CallHistory){
			minutes = (double) (call.getduration()/60);
			result += minutes*priceForMinutes;
		}
		return result;
	}
	
	public Call findLongest(){
		Call result = this.CallHistory.get(0);
		for(Call list : CallHistory){
			if(result.getduration() < list.getduration()){
				result = list;
			}
		}
		return result;
	}
	
	public void delLongestCall(){
		//findLongest();
		this.CallHistory.remove(findLongest());
	}

	
	
}
