package eleven.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import min.general.Gerbil;

public class Collection8 {
	public static void main(String args[]) {
		List<Gerbil> gerbils = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			gerbils.add(new Gerbil(i));
		}
		Iterator<Gerbil> it = gerbils.iterator();
		while(it.hasNext()) {
			it.next().hop();
		}
	}
}
