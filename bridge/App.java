package bridge;

public class App {

	public static void main(String[] args) {
		Champion ahri = new Ahri(new PoolParty());
		ahri.skillQ();
		ahri.skillR();
	}

}
