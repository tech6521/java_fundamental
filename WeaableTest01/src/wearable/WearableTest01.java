package wearable;

import wearable.*;

public class WearableTest01 {
	public static void main(String[] args) {
		Wearable[] w = {
				new WearableComputer("배수지"),
				new WearableRobot(1),
				new WearableComputer("이종석"),
				new WearableRobot(4),
		};
		
		/*for(int i=0;i < w.length;i++) {
			w[i].putOn();
			w[i].putOff();
			System.out.println();
		}*/
		
		for(Wearable wa : w) {
			wa.putOn();
			wa.putOff();
			System.out.println();
		}
	}
}
