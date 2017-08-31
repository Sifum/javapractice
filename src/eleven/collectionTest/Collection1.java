package eleven.collectionTest;

import java.util.ArrayList;
import java.util.List;

import min.general.Gerbil;

public class Collection1 {
	public static void main(String args[]) {
		List<Gerbil> gerbils = new ArrayList<Gerbil>();
		for(int i = 0; i < 10; i++) {
			gerbils.add(new Gerbil(i));
		}
		for(int j = 0; j < gerbils.size(); j++) {
			gerbils.get(j).hop();
		}
	}
}
