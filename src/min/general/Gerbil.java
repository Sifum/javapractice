package min.general;

public class Gerbil extends Rodent{
	private int gerbilNumber;
	
	public Gerbil() {
	}
	
	public void whatTooth() {
		System.out.println("It's Gerbil tooth\n");
	}
	
	public Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}
	
	public void hop() {
		System.out.println("Gerbil " + gerbilNumber + " is  jumping!\n");
	}
}
