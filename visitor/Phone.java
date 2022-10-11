package visitor;

public class Phone implements Device {

	@Override
	public void print(Circle shape) {
		System.out.println("Print Circle to Phone");
	}

	@Override
	public void print(Rectangle shape) {
		System.out.println("Print Rectangle to Phone");
	}

	@Override
	public void print(Triangle shape) {
		System.out.println("Print Triangle to Phone");
	}

}
