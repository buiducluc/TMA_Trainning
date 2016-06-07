package Mobile;

import java.util.ArrayList;


public class GSMCallHistoryTest{

	
	public static void main(String[] args){
		Battery batteryIp5 = new Battery("IP", 10, 15, Battery.BatteryType.LiIon);
		Display displayIp5 = new Display(4, 2000);
		GSM gsmIP5 = new GSM("Iphone 5", "Apple", 15, "Luc", batteryIp5, displayIp5);
		
		
		Call call1 = new Call("1/5/2016", "11:30", "01636740939", 5000);
		Call call2 = new Call("1/5/2016", "15:30", "01363765253", 1000);
		Call call3 = new Call("1/5/2016", "11:30", "01690140939", 400);
		Call call4 = new Call("1/5/2016", "11:30", "0983587427", 100);
		
		gsmIP5.CallHistory = new ArrayList<Call>();
		
		gsmIP5.CallHistory.add(call1);
		gsmIP5.CallHistory.add(call2);
		gsmIP5.CallHistory.add(call3);
		gsmIP5.CallHistory.add(call4);
		
		for(Call listCall : gsmIP5.CallHistory){
			System.out.println(listCall);
		}
		
		//Total price of the call in history
				System.out.println("Total price of the call in history: " + gsmIP5.calculateCall((float) 0.37) + "\n");
		
		//Find a longest call from history and delete longest call
		gsmIP5.delLongestCall();
		
		for(Call listCall : gsmIP5.CallHistory){
			System.out.println(listCall);
		}
		
		System.out.println("Total price of the call in history after delete: " + gsmIP5.calculateCall((float) 0.37));
		
	
		
	}
}
