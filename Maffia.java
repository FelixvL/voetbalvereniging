package voetbalvereniging;

import java.util.ArrayList;

public class Maffia  {

	ArrayList<Omkoopbaar> omkoopbaren = new ArrayList<>();
	
	void recruteren(Omkoopbaar okb) {
		omkoopbaren.add(okb);
	}
}
