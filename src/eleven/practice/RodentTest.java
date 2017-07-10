package eleven.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import min.general.Gerbil;
import min.general.Hamster;
import min.general.Mouse;
import min.general.Rodent;

public class RodentTest {
	public static void main(String args[]) {
		List<Rodent> lists = new ArrayList<>();
		lists.add(new Mouse());
		lists.add(new Gerbil());
		lists.add(new Hamster());
		Iterator<Rodent> it = lists.iterator();
		while(it.hasNext()) {
			it.next().whatTooth();
		}
		
	}
}
