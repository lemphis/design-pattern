package abstractfactory;

public class ShipInventory {

	public static void main(String[] args) {
		ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
		Ship ship = shipFactory.createShip();
		System.out.println(ship.getAnchor().getClass());
		System.out.println(ship.getWheel().getClass());
	}

}
