
public class KeyPad {
	int number;
	int sim;
	public KeyPad() {
		
	}
	KeyPad(int number, int sim) {
		this.number = number;
		this.sim = sim ;
	}
	void printMyNumber() {
		System.out.println("My Number : "+number);
		System.out.println("SIM"+sim);
	}

}
