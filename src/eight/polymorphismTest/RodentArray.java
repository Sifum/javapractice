package eight.polymorphismTest;

import min.general.Gerbil;
import min.general.Hamster;
import min.general.Mouse;
import min.general.Rodent;

public class RodentArray {
	public static void main(String args[]) {
		Rodent[] rodent = new Rodent[3];
		for(int i = 0; i < 3; i++) {
			switch (i) {
			case 0:
				rodent[i] = new Mouse();
				break;
			case 1:
				rodent[i] = new Gerbil();
				break;
			case 2:
				rodent[i] = new Hamster();
				break;
			default:
				break;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			rodent[i].whatTooth();
		}
		
	}
}
