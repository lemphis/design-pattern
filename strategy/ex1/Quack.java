package strategy.ex1;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("꽥");
	}

}
