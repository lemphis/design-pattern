package strategy.ex2;

public class Client {

	public static void main(String[] args) {
		BlueLightRedLight game = new BlueLightRedLight();
		game.blueLight(new NormalSpeed());
		game.redLight(new FasterSpeed());
	}

}
