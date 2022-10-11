package visitor;

public class Watch implements Device {

	@Override
	public void print(Circle shape) {
		System.out.println("Print Circle to Watch");
	}

	@Override
	public void print(Rectangle shape) {
		System.out.println("Print Rectangle to Watch");
	}

	@Override
	public void print(Triangle shape) {
		System.out.println("Print Triangle to Watch");
	}

}
