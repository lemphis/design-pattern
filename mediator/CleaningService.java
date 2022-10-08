package mediator;

public class CleaningService {

	private FrontDesk frontDesk;

	public CleaningService(FrontDesk frontDesk) {
		this.frontDesk = frontDesk;
	}

	public void getTowel(Integer guestId, int numberOfTowels) {
		String roomNumber = this.frontDesk.getRoomNumberFor(guestId);
		System.out.println("provide " + numberOfTowels + " to " + roomNumber);
	}

}
