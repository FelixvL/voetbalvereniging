package voetbalvereniging;

import java.util.ArrayList;

public class Maffia  {

	ArrayList<Omkoopbaar> omkoopbaren = new ArrayList<>();
	
	void recruteren(Omkoopbaar okb) {
		omkoopbaren.add(okb);
		try {
			okb.omkopen(3, "geef geld");
		}catch(Exception e) {
			System.out.println("Doodschieten");
		}
	}
}
