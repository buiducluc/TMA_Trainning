package Mobile;

import java.util.ArrayList;
import java.util.List;

public class GSMTest {
	public static void main (String[] args){
		Battery batteryIp5 = new Battery("IP", 10, 15, Battery.BatteryType.LiIon);
		Battery batterySamSung = new Battery("SS", 15, 20, Battery.BatteryType.LiIon);
		Battery batteryLumia = new Battery("Lumia", 12, 20, Battery.BatteryType.LiIon);
		Battery batteryBlackBery = new Battery("BB", 10, 15, Battery.BatteryType.NiCd);
		
		Display displayIp5 = new Display(4, 2000);
		Display displaySamSung = new Display(4, 2000);
		Display displayLumia = new Display(5, 5000);
		Display displayBlackBery = new Display(4.5f, 3000);
		
		GSM gsmIP5 = new GSM("Iphone 5", "Apple", 15, "Luc", batteryIp5, displayIp5);
		GSM gsmSamSung = new GSM("Galaxy S7", "SamSung", 15, "Luc", batterySamSung, displaySamSung);
		GSM gsmLumia = new GSM("Lumia 730", "Microsoft", 15, "Luc", batteryLumia, displayLumia);
		GSM gsmBlackBery = new GSM("BlackBery", "BlackBery", 10, "Luc", batteryBlackBery, displayBlackBery);
		
		List<GSM> listGSM = new ArrayList<GSM>();
		listGSM.add(gsmIP5);
		listGSM.add(gsmSamSung);
		listGSM.add(gsmLumia);
		listGSM.add(gsmBlackBery);
		
		//display information
		
		for(GSM list : listGSM){
			System.out.println(list);
		}
		
		
		
		
	}

	

}
